import React, { useEffect } from 'react'
import { Link, useNavigate,} from 'react-router-dom';
import { useState } from 'react';

import "bootstrap/dist/css/bootstrap.min.css";
import CourseService from '../Services/CourseService';

export default function DeleteCourse() {

    let navigate=useNavigate()


    const [courses,setCourses]=useState([])
    const [id, setId] = useState(0);
 

       useEffect((e)=>{  
        loadCourse()
    },[]);

    
       const loadCourse=()=>{
       CourseService.getAllIdList()
       .then((res)=>{
        setCourses(res.data);
        console.log(res.data)
       
       })
       .catch((err)=>console.log(err))
        }

        

   const onSubmit=async(e)=>{
    e.preventDefault();
                 const res= await CourseService.DeleteById(id);
                    navigate("/brand") 
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
        <h2 className='text-center m-4'><b>DELETE COURSE DETAILS BY ID</b></h2>
        <form onSubmit={onSubmit}>
        <div className='mb-3'>
            <label htmlFor='id' className='form-label '><b>Course ID :</b></label>
            <select type={'text'}
             placeholder='Enter Id '
             name="id"
             
             onChange={(e)=>setId(e.target.value)}>
                <option selected>Select one</option>
             {courses.map((items)=>(
                   
                 
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
