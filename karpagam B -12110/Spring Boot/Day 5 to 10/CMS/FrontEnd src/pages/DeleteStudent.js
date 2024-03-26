import React, { useEffect } from 'react'
import { Link, useNavigate,} from 'react-router-dom';
import { useState } from 'react';

import "bootstrap/dist/css/bootstrap.min.css";
import StudentService from '../Services/StudentService';

export default function DeleteStudent() {

    let navigate=useNavigate()


    const [students,setStudents]=useState([])
    const [id, setId] = useState(0);
 

       useEffect((e)=>{  
        loadStudent()
    },[]);

    
       const loadStudent=()=>{
       StudentService.getAllIdList()
       .then((res)=>{
        setStudents(res.data);
        console.log(res.data)
       
       })
       .catch((err)=>console.log(err))
        }

        

   const onSubmit=async(e)=>{
    e.preventDefault();
                 const res= await StudentService.DeleteStudents(id)
                    navigate("/home") 
                    alert('Deleted Successfully :)')
                    console.log(res.data)
            };
                
 return (
   <><div>
          <nav className="navbar navbar-expand-lg navbar-dark bg-secondary"
              id='navbar-custom-i'>
              <div className="container-fluid">
                  <Link className="navbar-brand" to={"/"}><h4><i><b>COURSE MANAGEMENT SYSTEM</b></i></h4></Link>
                  
    
              </div>
          </nav>
      </div>
    <div className='container '>
    <div className='row'> 
    <div className="col-md-6 offset-md-3 border rounded p-4 mt-4 shadow ">
        <h2 className='text-center m-4'><b>DELETE STUDENT DETAILS BY ID</b></h2>
        <form onSubmit={onSubmit}>
        <div className='mb-3'>
            <label htmlFor='studentId' className='form-label '><b>ITEM ID :</b></label>
            <select type={'text'}
             placeholder='Enter Id '
             name="studentId"
             
             onChange={(e)=>setId(e.target.value)}>
                <option selected>Select one</option>
             {students.map((items)=>(
                   
                 
             <option value={items} key={items}>
                {items}

             </option>
               ))}

             </select>
             </div>
       
             <button type='submit' className='btn btn-info' >Delete</button>
             <Link type='submit' className='btn btn-danger mx-2' to="/home">CANCEL</Link>


             </form>
    </div>
    </div>
</div></>
  )
}
