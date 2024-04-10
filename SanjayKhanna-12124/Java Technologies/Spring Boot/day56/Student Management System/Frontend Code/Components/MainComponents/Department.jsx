import { Button } from '@mui/material';
import React, { useEffect, useState } from 'react';
import departmentService from '../../Services/DepartmentServices';
import AddDepartment from '../DepartmentComponents/AddDepartment';
import DeleteDepartment from '../DepartmentComponents/DeleteDepartment';
import EditDepartment from '../DepartmentComponents/EditDepartment';
import Search from '../UtilitiesComponents/Search';

const Department = () => {

    const [deptData,setDeptData]  = useState([]);
    const [eId,setEventId] = useState(0);
    const [search, setSearch] = useState("");

    const [Flags, setFlags] = useState({
        isAddable: false,
        isEditable: false,
        isDeletable: false
    });

    // Fetch data from the server
    useEffect(()=>{
        departmentService.doReadAllDepartment()
        .then((response) => setDeptData(response.data))
        .catch((error)=> console.log('Error:', error));
    },[]);

    return (
        <div>
            <section className="container container-lg">
                <div className="card card-lg  mt-5 shadow-lg p-2 mx-auto">
                    <div className="card-header card-title border-0 text-center h1">Department Record List</div>
                    <div className="card-body">
                        <div className="container row mt-3">
                            <div className="col-4" style={{ "textAlign": "left" }}>
                                <Button variant="contained" onClick={() => { setFlags({ isAddable: true }) }} color="success">Add Department</Button></div>
                            <div className="col-4" style={{ "textAlign": "center" }}>
                                <h5>No of Record: {deptData.length} </h5>
                            </div>
                            <div className="col-4">
                                <Search search={search} setSearch={setSearch} />
                            </div>
                        </div>
                        <table className="table table-bordered table-striped table-hover mt-3">
                            <thead className="bg-dark text-white text-center">
                                <tr>
                                    <td>Department Name</td>
                                    <td>Department Head</td>
                                    <td className='col-3'>Action</td>
                                </tr>
                            </thead>
                            <tbody>
                                {deptData.filter((st)=>st.deptName.toLowerCase().includes(search)||st.deptName.toUpperCase().includes(search)).map((item) =>(
                                    <tr key={item.deptId}>
                                        <td>{item.deptName}</td>
                                        <td>{item.deptHead}</td>
                                        <td className="d-flex justify-content-evenly"><Button variant="contained" onClick={() => { setFlags({isEditable:true});setEventId(item.deptId)}}>edit</Button><Button variant="contained" color="error" onClick={() => { setFlags({isDeletable:true});setEventId(item.deptId) }}>delete</Button></td>
                                    </tr>
                                ))}
                            </tbody>
                        </table>
                    </div>
                </div>
            </section>
            {Flags.isAddable && <AddDepartment Flags={Flags} />}
            {Flags.isEditable && <EditDepartment Flags={Flags} id={eId}/>}
            {Flags.isDeletable && <DeleteDepartment Flags= {Flags} id ={eId}/>}
        </div>
    );
}

export default Department;
