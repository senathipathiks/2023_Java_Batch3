import React, { useEffect, useState } from 'react'
import { Link, useNavigate, useParams } from 'react-router-dom';
import "bootstrap/dist/css/bootstrap.min.css";
import StudentService from '../Services/StudentService';

export default function EditStudent() {

  //to navigate to the home page after clicking submit
  let navigate=useNavigate();


  
    const [student,setStudent]=useState({
      studentName:"",
      studentQualification:"",
      studentAge:"",
      studentCity:"",
             course:{
                 id:0
                }
             })


      const {studentId}=useParams()

  //.. for keep on adding new data or objects

        const onInputChange=(e)=>{

          if (e.target.name === "id") {
            setStudent({ ...student, brand: { id: e.target.value } });
          } else
          setStudent({ ...student, [e.target.name]: e.target.value });
        };

    //prevent default is to stop the unwanted url loading when clicking submit
    //to insert the data fetch axios link from postman API
    const onhandleSubmit=async(e)=>{
    if (student.studentName !== "" && student.studentCity !== "" &&  student.studentAge !== "") {

      e.preventDefault();
      await StudentService.UpdateStudents(student);
      
      alert('Student Details Updated Succesfully !!')
      navigate('/home');
    }
    else{
      alert("please fill out all the record")
    }
  }

 

 const loadInvent=async(studentId)=>{
        const result=await StudentService.fetchStudentById(studentId);
        setStudent(result.data)
    };

    useEffect(() => {
      loadInvent(studentId);
    }, []);
  
    
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
            <h2 className='text-center m-4'><b>UPDATE STUDENT DETAILS</b></h2>
            <form onSubmit={(e)=>onhandleSubmit(e,student)}>

            
            <div className='mb-8'>
                <label htmlFor='studentName' className='form-label '><b>student NAME :</b></label>
                <input type={'text'}
                 className='form-label'
                 placeholder='Enter stuednt Name'
                 name="studentName"
                 value={student.studentName}
                 onChange={(e)=>onInputChange(e)}
                />
                </div>
                <div className='mb-8'>
                <label htmlFor='studentQualification' className='form-label '><b>student qualification :</b></label>
                <input type={'text'}
                 className='form-label'
                 placeholder='Enter Student qualification'
                 name="studentQualification"
                 value={student.studentQualification}
                 onChange={(e)=>onInputChange(e)}
                /></div>
                 <div className='mb-8'>
                <label htmlFor='studentAge' className='form-label '><b>student age :</b></label>
                <input type={'text'}
                 className='form-label'
                 placeholder='Enter Student Age'
                 name="studentAge"
                 value={student.studentAge}
                 onChange={(e)=>onInputChange(e)}
                /></div>
                 <div className='mb-8'>
                <label htmlFor='studentCity' className='form-label '><b>city:</b></label>
                <input type={'text'}
                 className='form-label'
                 placeholder='Enter Student city'
                 name="studentCity"
                 value={student.studentCity}
                 onChange={(e)=>onInputChange(e)}



                /></div>
           <div className='mb-3'>
                <label htmlFor='Course Id' className='form-label '><b>Course  Id :</b></label>
                <input type={'text'}
                 className='form-label'
                 placeholder='Enter Item Quantity '
                 name="id"
                 value={student.course.id}
                 readOnly

                 onChange={(e)=>onInputChange(e)}/>
                 </div>
                 <button type='submit' className='btn btn-info'>SUBMIT</button>
                 <Link type='submit' className='btn btn-danger mx-2' to="/home">CANCEL</Link>


                 </form>
        </div>
        </div>
    </div></>
  )
}
