import React, { useEffect, useState } from 'react';
import axios from "axios";
import { Link, useNavigate, useParams } from 'react-router-dom';
import DepartmentService from '../../service/DepartmentService';

const EditDepartment = () => {
    
    let navigate = useNavigate();

    const{id} = useParams();

    const[department,setDepartment] = useState({
        dname: "",
       
    })
    const{dname}= department;

    useEffect(() => {
        loadDepartment();
    }, []);


    const loadDepartment = async()=> {
        // console.log(id);
        await DepartmentService.findDepartment(id).then((response)=>{
        setDepartment(response.data);
    
});
    }

    const handleInputChange = (e) =>{
        setDepartment({...department,[e.target.name] : e.target.value});
    };
    const updateDepartment = async(e) => {
        e.preventDefault();
        await DepartmentService.updateDepartment(department);
        navigate("/view-departments");
    };
    
  return (
    <div className='col-sm-8 py-2 px-5 offset-2 shadow'>
        <h2 className='mt-5'>Edit Department</h2>
      <form onSubmit={(e)=> updateDepartment(e)}>
        <div className='input-group mb-5'>
            <label
            className='input-group-text'
            htmlFor="dname">
                Department Name
            </label>
            <input
            className='form-control col-sm-6'
            type='text'
            name='dname'
            id='dname'
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
                <Link to={"/view-departments"}
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

export default EditDepartment
