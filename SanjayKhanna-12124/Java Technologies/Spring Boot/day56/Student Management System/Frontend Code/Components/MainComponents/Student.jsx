import { Button } from '@mui/material';
import React, { useEffect, useState } from 'react';
import studentService from '../../Services/StudentService';
import AddStudent from '../StudentComponents/AddStudent';
import DeleteStudent from '../StudentComponents/DeleteStudent';
import EditStudent from '../StudentComponents/EditStudent';
import Search from '../UtilitiesComponents/Search';

const Student = () => {

    const [studData, setStudData] = useState([]);
    const [eId,setEventId] = useState(0);
    const [search, setSearch] = useState("");

    const [Flags, setFlags] = useState({
        isAddable: false,
        isEditable: false,
        isDeletable: false
    });

    // Get all students data on component mount
    useEffect(() => {
        studentService.doReadAll()
            .then((res) => { setStudData(res.data) })
            .catch((err) => console.log('Error: ', err))
    },[]);



    return (
        <div>
            <section className="container container-lg">
                <div className="card card-lg mt-5 shadow-lg p-2 mx-auto">
                    <div className="card-header card-title border-0 text-center h1">Student Record List</div>
                    <div className="card-body">
                        <div className="container row mt-3">
                            <div className="col-4" style={{ "textAlign": "left" }}>
                                <Button variant="contained" onClick={()=>{setFlags({isAddable:true})}} color="success">Add Student</Button></div>
                            <div className="col-4"  style={{ "textAlign": "center" }}>
                                <h5>No of Record: {studData.length} </h5>
                            </div>
                            <div className="col-4">
                                <Search search={search} setSearch={setSearch} />
                            </div>
                        </div>
                        <div className='container'>
                        <table className="table table-bordered table-striped table-hover mt-3">
                            <thead className="bg-dark text-white text-center">
                                <tr>
                                    <td>Student Name</td>
                                    <td>Age</td>
                                    <td>Gender</td>
                                    <td>Department Name</td>
                                    <td>Department Head</td>
                                    <td className="col-2">Action</td>
                                </tr>
                            </thead>
                            <tbody>
                                {   studData.filter((st)=>st.stuName.toLowerCase().includes(search)||st.stuName.toUpperCase().includes(search)).map((item) =>( 
                                        <tr key={item.stuId}>
                                            <td>{item.stuName}</td>
                                            <td>{item.stuAge}</td>
                                            <td>{item.stuGender}</td>
                                            <td>{item.department.deptName}</td>
                                            <td>{item.department.deptHead}</td>
                                            <td className="d-flex justify-content-evenly"><Button variant="contained" onClick={() => { setFlags({isEditable:true});setEventId(item.stuId)}}>edit</Button><Button variant="contained" color="error" onClick={() => { setFlags({isDeletable:true});setEventId(item.stuId) }}>delete</Button></td>
                                        </tr>
                                    ) )
                                }
                            </tbody>
                        </table>
                        </div>
                    </div>
                </div>
            </section>
            {Flags.isAddable && <AddStudent Flags={Flags} />}
            {Flags.isEditable && <EditStudent  Flags={Flags} id={eId}/>}
            {Flags.isDeletable && <DeleteStudent Flags={Flags} id={eId} />}
        </div>
    );
}

export default Student;
