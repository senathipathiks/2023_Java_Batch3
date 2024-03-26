
import React, { useEffect, useState } from 'react';
import axios from "axios";
import {FaEdit, FaEye, FaTrashAlt} from "react-icons/fa";
import { Link } from 'react-router-dom';
import Search from '../common/Search';
import StudentService from '../../service/StudentService';

const DepartmentView = () => {
    const[department, setDepartment] = useState([]);
    const[search, setSearch] = useState("");


    useEffect(() => {
        loadDepartment();
    }, []);


    const loadDepartment = async()=> {
        const result = await StudentService.findallStudent(students);
            
            setStudents(result.data);
    
};

// const handleDelete = async(id)=>{
//     // console.log(id);
//     await StudentService.deleteStudent(id).then((response)=>{
//        setStudents(response.data);
       
//     }); 
//    alert("Deleted Successfully!");
    
// }
const handleDelete =  (id)=>{
    console.log(id);
     StudentService.deleteStudent(id).then((response)=>{
   // setStudents(response.data);
   console.log(response.data);
   let st = students.filter((student)=> {
     console.log(student.id)
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
                <th>ID</th>
                <th>Name</th>
                <th>PhoneNo</th>
                <th>Email</th>
                <th>Department</th>
                <th colSpan="3">Actions</th>

            </tr>
        </thead>
        <tbody className='text-center'>
            {students.filter((st) =>
            st.name.toLowerCase().includes(search))
            .map((students)=> (
                <tr>
                
                    <td>{students.id}</td>
                    <td>{students.name}</td>
                    <td>{students.phnno}</td>
                    <td>{students.email}</td>
                    <td>{students.department}</td>
                    <td className='mx-2'>
                    <Link to={`/view-departments/${department.id}`} 
                        className='btn btn-info'>
                           <FaEye/> View
                        </Link>
                    </td>
                    <td className='mx-2'>
                        <Link to={`/edit-departments/${department.id}`} 
                        className='btn btn-warning'>
                           <FaEdit/> Update
                        </Link>
                    </td>
                    <td className='mx-2'>
                        <button className='btn btn-danger'
                        onClick={()=> handleDelete(department.id)}
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

export default DepartmentView
