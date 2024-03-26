import React, { useState,useEffect } from 'react'
import { Link, useNavigate } from 'react-router-dom';
import "bootstrap/dist/css/bootstrap.min.css";
import StudentService from '../Services/StudentService';
import CourseService from '../Services/CourseService';

export default function AddStudent() {

  //to navigate to the home page after clicking submit
  let navigate=useNavigate()
  
    const [student,setStudent]=useState({
      studentName:"",
      studentQualification:"",
      studentAge:"",
      studentCity:"",
             course:{
                 id:0
                }
             })


  //.. for keep on adding new data or objects
  const onInputChange=(e)=>{

  if (e.target.name === "id") {
    setStudent({ ...student, course: { id: e.target.value } });
  } else
    setStudent({ ...student, [e.target.name]: e.target.value });
};


    
    //prevent default is to stop the unwanted url loading when clicking submit
    //to insert the data fetch axios link from postman API
    const onHandleSubmit=async(e)=>{      
      if (student.studentName !== "" && student.studentAge !== "" ) {
      e.preventDefault();
      await StudentService.saveStudent(student);
      
      alert('Student Details Added Successfully !!')
      navigate("/home");
        
      }else{
        alert("please fill out all the record")
      }
      
    };


    const [all, setAll] = useState([]);

  const loadDetails = async (e) => {
    await CourseService.getAllIdList()
      .then((res) => setAll(res.data))
      .catch((err) => console.log(err));
  };

  useEffect(() => {
    loadDetails();
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


  
  
    <div className='container '
    id='Carder'>
        <div className='row'> 
        <div className="col-md-6 offset-md-3 border rounded p-4 mt-4 shadow dark ">
            <h2 className='text-center m-4' ><b className='.text-danger'> REGISTER STUDENT DETAILS</b></h2>
            <form onSubmit={(e)=>onHandleSubmit(e,student)}>

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
                <label htmlFor='Brand Id' className='form-label '><b>Course ID :</b></label>
                <select
              name="id"
              value={student.id}
              onChange={(e)=>onInputChange(e)}>
              <option selected="selected">Choose Course Id Here</option>
              {all.map((index) => (
                <option key={index} value={index}>
                  {index}
                </option>
              ))}
            </select>
                </div>
                <button type='submit' className='btn btn-info' >SUBMIT</button>
                 <Link type='submit' className='btn btn-danger mx-2' to="/home">CANCEL</Link>


                 </form>
        </div>
        </div>
    </div></>
  )
}
