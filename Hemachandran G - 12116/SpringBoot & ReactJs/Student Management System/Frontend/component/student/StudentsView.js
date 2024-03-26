
import React, { useEffect, useState } from 'react';
import axios from "axios";
import {FaEdit, FaEye, FaTrashAlt} from "react-icons/fa";
import { Link, useParams } from 'react-router-dom';
import Search from '../common/Search';
import StudentService from '../../service/StudentService';

const StudentsView = () => {
    const[students, setStudents] = useState([]);
    const[search, setSearch] = useState("");

     const{sid}=useParams()

    useEffect(() => {
        loadStudents();
    }, []);


    const loadStudents = async()=> {
        await StudentService.findallStudent().then((response)=>{
          setStudents(response.data);
          console.log(response.data)
        })
            
            
    
};

// const handleDelete = async(id)=>{
//     // console.log(id);
//     await StudentService.deleteStudent(id).then((response)=>{
//        setStudents(response.data);
       
//     }); 
//    alert("Deleted Successfully!");
    
// }
const handleDelete =  (sid)=>{
    console.log(sid);
     StudentService.deleteStudent(sid).then((response)=>{
   // setStudents(response.data);
   console.log(response.data);
   let st = students.filter((student)=> {
     console.log(student.sid)
     } );
   setStudents(st);
   alert("Deleted Successfully!");

   });

 //  window.location.reload();
}

  return (
    <section>
        <Search 
        search={search}
        setSearch={setSearch} 
        />
      <table className='table table-bordered table-hover shadow'>
        <thead>
            <tr className='text-center'>
                <th>sid</th>
                <th>Name</th>
                <th>PhoneNo</th>
                <th>Email</th>
                <th>DeptId</th>
                <th>Dept Name</th>
                <th colSpan="3">Actions</th>

            </tr>
        </thead>
        <tbody className='text-center'>
            {students.filter((st) =>
            st.name.toLowerCase().includes(search))
            .map((students)=> (
                <tr key={students.sid
                } >
                
                    <td>{students.sid}</td>
                    <td>{students.name}</td>
                    <td>{students.phnno}</td>
                    <td>{students.email}</td>
                    <td>{students.department.id}</td>
                    <td>{students.department.dname}</td>
                    <td className='mx-2'>
                    <Link to={`/student-profile/${students.sid}`}
                            className='btn btn-info'>
                           <FaEye/> View
                        </Link>
          
                        <Link to={`/edit-student/${students.sid}`} 
                        className='btn btn-warning'>
                           <FaEdit/> Update
                        </Link>
                        <button className='btn btn-danger'
                        onClick={()=> handleDelete(students.sid)}
                        >
                           <FaTrashAlt/> Delete
                        </button>
                    </td>
                </tr>

            ))} 
            
        </tbody>


      </table>
    </section>
  )
}

export default StudentsView
