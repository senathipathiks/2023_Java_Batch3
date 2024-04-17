import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { Link, useNavigate, useParams } from 'react-router-dom';
import EmployeeService from  "../service/EmployeeService";

export default function EditEmployee() {

    let navigate = useNavigate();

    const {id} =useParams();

    const [employee, setEmployee] = useState({
        name: "",
        dept: "",
        salary: ""
    })

    const { name, dept, salary } = employee;

    const inputChange = (e) => {
        setEmployee({ ...employee, [e.target.name]: e.target.value })
    };

    useEffect(()=>{
        loadEmployee();
    },[]);

    const onSubmit = async (e) => {
        e.preventDefault();
        await EmployeeService.updateEmployee(employee);
        alert("Employee Updated Successfully");
        navigate("/");
    };


    const loadEmployee = async () => {
        const result = await EmployeeService.getEmployeeById(id);
        setEmployee(result.data);
    };

    return (
        <div className='container' id="con2">
            <div className='row '>
                <div className='col-md-6 offset-md-3 border rounded  p-4 mt-2 shadow '>
                    <h2 className='text-center m-4 '>Edit Employee Form</h2>
                    <form onSubmit={(e)=> onSubmit(e)}>
                        <div className='mb-3 '>
                            <label htmlFor='Name' className='form-label '>Employee Name : </label>
                            <input type='text' className='form-control ' placeholder="Enter the Name" name="name" value={name}
                                onChange={(e) => inputChange(e)}></input>
                        </div>
                        <div className='mb-3 '>
                            <label htmlFor='Department' className='form-label '>Employee Department : </label>
                            <input type='text' className='form-control ' placeholder="Enter the Deaprtment" name="dept" value={dept}
                                onChange={(e) => inputChange(e)}></input>
                        </div>
                        <div className='mb-3 '>
                            <label htmlFor='Salary' className='form-label '>Employee Salary : </label>
                            <input type='number' className='form-control ' placeholder="Enter the salary" name="salary" value={salary}
                                onChange={(e) => inputChange(e)}></input>
                        </div>
                        <button type='submit' className='btn btn-outline-primary' id="btn">Submit</button>
                        <Link to="/" className='btn btn-outline-danger mx-2' id="btn">Cancel</Link>
                    </form>
                </div>
            </div>
        </div>

    )
}
