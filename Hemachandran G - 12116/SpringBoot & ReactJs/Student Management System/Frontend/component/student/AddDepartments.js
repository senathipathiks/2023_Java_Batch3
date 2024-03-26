import axios from 'axios';
import React, { useState } from 'react'
import { Link, useNavigate } from 'react-router-dom';
import DepartmentService from '../../service/DepartmentService';


const AddDepartments = () => {
    let navigate = useNavigate();

    const[department,setDepartment] = useState({
        id:"",
        dname: " "

    })
    const{id,dname}= department

    const handleInputChange = (e) =>{
        setDepartment({...department,[e.target.name] : e.target.value});
    };
    const saveDepartment = async(e) => {
        e.preventDefault();
        await DepartmentService.addDepartment(department);
        navigate("/view-departments");
        alert("Department"+" "+dname+" "+"Added Successfully");
    };

  return (
    <div className='col-sm-8 py-2 px-5 offset-2 shadow'>
      <form onSubmit={(e)=> saveDepartment(e)}>
      
        <div className='input-group mb-5'>
            <label
            className='input-group-text'
            htmlFor="dname">
                DeptName
            </label>
            <input
            className='form-control col-sm-6'
            type='text'
            name='dname'
            required
            value={dname}
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

export default AddDepartments
