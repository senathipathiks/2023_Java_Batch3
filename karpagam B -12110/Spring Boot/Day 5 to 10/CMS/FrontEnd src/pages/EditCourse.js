import React, { useState,useEffect } from 'react'
import { Link, useNavigate,useParams } from 'react-router-dom';

import "bootstrap/dist/css/bootstrap.min.css";
import CourseService from '../Services/CourseService';

export default function EditCourse() {

  //to navigate to the home page after clicking submit
  let navigate=useNavigate()

  const {id}=useParams()

    const [course,setCourse]=useState({
      courseName:"",
      couresDuration:"",
      courseType:"",
      courseStartDate:"",
      courseEndDate:"",
      courseLecturer:""
    })
    //destruturing
    const {courseName,couresDuration,courseType,courseStartDate,courseEndDate,courseLecturer}=course

  //.. for keep on adding new data or objects

    const onInputChange=(e)=>{
      setCourse({...course,[e.target.name]:e.target.value});
    };

    useEffect(()=>{
      console.log(id)
        loadInvent(id)
    },[]);
    
    //prevent default is to stop the unwanted url loading when clicking submit
    //to insert the data fetch axios link from postman API
    const onSubmit=async(e)=>      
     {
      e.preventDefault();
      await CourseService.UpdateCourse(course);
      
      alert('Course Details Updated Successfully !!')
      navigate("/course");
        
      
     };
     const loadInvent=async(id)=>{
      const result=await CourseService.fetchCourseById(id);
      setCourse(result.data)
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


  
  
    <div className='container '
    id='Carder'>
        <div className='row'> 
        <div className="col-md-6 offset-md-3 border rounded p-4 mt-4 shadow dark ">
            <h2 className='text-center m-4' ><b className='.text-danger'> UPDATE COURSE DETAILS</b></h2>
            <form onSubmit={(e)=>onSubmit(e)}
                  >
                        <div className='mb-3'>
                <label htmlFor='courseName' className='form-label '><b>COURSE NAME :</b></label>
                <input type={'text'}
                 className='form-label'
                 placeholder='Enter Course Name'
                 name="courseName"
                 value={courseName}
                 onChange={(e)=>onInputChange(e)}
                />
                </div>
                <div className='mb-3'>
                <label htmlFor='couresDuration' className='form-label '><b>DURATION </b></label>
                <input type={'text'}
                 className='form-label'
                 placeholder='Enter Course Duration'
                 name="couresDuration"
                 value={couresDuration}
                 onChange={(e)=>onInputChange(e)}
                />
                </div>
                <div className='mb-3'>
                <label htmlFor='courseType' className='form-label '><b>COURSE TYPE</b></label>
                <input type={'text'}
                 className='form-label'
                 placeholder='Enter Course Type'
                 name="courseType"
                 value={courseType}
                 onChange={(e)=>onInputChange(e)}
                />
                </div>
                <div className='mb-3'>
                <label htmlFor='courseStartDate' className='form-label '><b>COURSE START DATE</b></label>
                <input type={'text'}
                 className='form-label'
                 placeholder='Enter Course start date'
                 name="courseStartDate"
                 value={courseStartDate}
                 onChange={(e)=>onInputChange(e)}
                />
                </div>
                <div className='mb-3'>
                <label htmlFor='courseEndDate' className='form-label '><b>END DATE</b></label>
                <input type={'text'}
                 className='form-label'
                 placeholder='Enter Course end date'
                 name="courseEndDate"
                 value={courseEndDate}
                 onChange={(e)=>onInputChange(e)}
                />
                </div>
                <div className='mb-3'>
                <label htmlFor='courseLecturer' className='form-label '><b>LECTURER NAME</b></label>
                <input type={'text'}
                 className='form-label'
                 placeholder='Enter Lecturer name'
                 name="courseLecturer"
                 value={courseLecturer}
                 onChange={(e)=>onInputChange(e)}
                />
                </div>
           
                 <button type='submit' className='btn btn-info' to="/brand">SUBMIT</button>
                 <Link type='submit' className='btn btn-danger mx-2' to="/home">CANCEL</Link>


                 </form>
        </div>
        </div>
    </div></>
  )
}
