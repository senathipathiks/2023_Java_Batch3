
import React, { useEffect, useState } from 'react';
import axios from "axios";
import {FaEdit, FaEye, FaTrashAlt} from "react-icons/fa";
// import {FaEdit, FaEye, FaTrashAlt} from "react-icons/all";
import { Link } from 'react-router-dom';
import Search from '../common/Search';
import DepartmentService from '../../service/DepartmentService';

const DepartmentsView = () => {
    const[departments, setDepartments] = useState([]);
    const[search, setSearch] = useState("");


    useEffect(() => {
        loadDepartments();
    }, []);


    const loadDepartments = async()=> {
        const result = await DepartmentService.findallDepartment(departments);
            
            setDepartments(result.data);
    
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
    DepartmentService.deleteDepartment(id).then((response)=>{
   // setStudents(response.data);
   console.log(response.data);
   let st = departments.filter((department)=> {
     console.log(department.id)
     } );
   setDepartments(st);
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
                <th colSpan="3">Actions</th>

            </tr>
        </thead>
        <tbody className='text-center'>
            {departments
            .map((departments)=> ( 
                <tr>
                
                    <td>{departments.id}</td>
                    <td>{departments.dname}</td>
                    <td className='mx-2'>
                    <Link to={`/department-profile/${departments.id}`} 
                        className='btn btn-info'>
                           <FaEye/> View
                        </Link>
                    </td>
                    <td className='mx-2'>
                        <Link to={`/edit-department/${departments.id}`} 
                        className='btn btn-warning'>
                           <FaEdit/> Update
                        </Link>
                    </td>
                    <td className='mx-2'>
                        <button className='btn btn-danger'
                        onClick={()=> handleDelete(departments.id)}
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

export default DepartmentsView
