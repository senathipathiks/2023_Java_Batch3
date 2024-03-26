import React, { useEffect, useState } from 'react';
import axios from "axios";
import { Link, useNavigate, useParams } from 'react-router-dom';
import StudentService from '../../service/StudentService';

const EditStudent = () => {
    
    let navigate = useNavigate();

    const{id} = useParams();

    const[student,setStudent] = useState({
        sid:"",
        name: "",
        phnno: "",
        email: "",

    })
    const{sid,name, phnno, email, department}= student;

    useEffect(() => {
        loadStudent();
    }, []);


    const loadStudent = async()=> {
        // console.log(id);
        await StudentService.findStudent(id).then((response)=>{
        setStudent(response.data);
    
});
    }

    const handleInputChange = (e) =>{
        setStudent({...student,[e.target.name] : e.target.value});
    };
    const updateStudent = async(e) => {
        e.preventDefault();
        await StudentService.updateStudent(student);
        navigate("/view-students");
    };
    
  return (
    <div className='col-sm-8 py-2 px-5 offset-2 shadow'>
        <h2 className='mt-5'>Edit Student</h2>
      <form onSubmit={(e)=> updateStudent(e)}>
      <div className='input-group mb-5'>
            <label
            className='input-group-text'
            htmlFor="name">
                Id
            </label>
            <input
            className='form-control col-sm-6'
            type='text'
            name='name'
            id='name'
            required
            value={sid}
            onChange={(e) => handleInputChange(e)}
            />
            
        </div>
        <div className='input-group mb-5'>
            <label
            className='input-group-text'
            htmlFor="name">
                Name
            </label>
            <input
            className='form-control col-sm-6'
            type='text'
            name='name'
            id='name'
            required
            value={name}
            onChange={(e) => handleInputChange(e)}
            />

        </div>
        <div className='input-group mb-5'>
            <label
            className='input-group-text'
            htmlFor="phnno">
                PhoneNum 
            </label>
            <input
            className='form-control col-sm-6'
            type='text'
            name='phnno'
            id='phnno'
            required
            value={phnno}
            onChange={(e) => handleInputChange(e)}
            />
            
        </div>
        <div className='input-group mb-5'>
            <label
            className='input-group-text'
            htmlFor="email">
                Your E-mail
            </label>
            <input
            className='form-control col-sm-6'
            type='email'
            name='email'
            id='email'
            required
            value={email}
            onChange={(e) => handleInputChange(e)}
            />
            
        </div>
        <div className='input-group mb-5'>
            <label
            className='input-group-text'
            htmlFor="department">
                DeptId
            </label>
            <input
            className='form-control col-sm-6'
            type='text'
            name='department'
            id='department'
            required
            value={student.department.id}
            onChange={(e) => handleInputChange(e)}
            />
            
        </div>
        
        <div className='row mb-5'>
            <div className='col-sm-2'>
                <button
                type="submit"
                className='btn btn-outline-success btn-lg'>
                    Save
                </button>

            </div>
            <div className='col-sm-2'>
                <Link to={"/view-students"}
                type="submit"
                className='btn btn-outline-warning btn-lg'>
                    Cancel
                </Link>

            </div>


        </div>
      </form>
    </div>
  )
  }

export default EditStudent
