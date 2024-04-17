import { Grid, TextField } from '@mui/material';
import React, { useState } from 'react'
import { Link, useNavigate } from 'react-router-dom';
import EmployeeService from  "../service/EmployeeService";

export default function AddEmployee() {

    let navigate = useNavigate();

    const [employee, setEmployee] = useState({
        name: "",
        dept: "",
        salary: ""
    })

    const { name, dept, salary } = employee;

    const inputChange = (e) => {
        setEmployee({ ...employee, [e.target.name]: e.target.value })
    };


    const onSubmit = async (e) => {
        e.preventDefault();
        await EmployeeService.insertEmployee(employee);
        alert("Employee Added Successfully");
        navigate("/");
    }


    return (
        <div className='container' id="con2">
            <div className='row '>
                <div className='col-md-6 offset-md-3 border rounded-5 unded p-4 mt-2 shadow'>
                    <h2 className='text-center m-4 '>Add Employee Form</h2>
                    <form onSubmit={(e) => onSubmit(e)}>
                        <div className='mb-3' id="tf">
                            <Grid item xs={12} sm={6}>
                                <TextField
                                    fullwidth
                                    id="outlined-textarea"
                                    label="Name"
                                    placeholder="Enter the Name"
                                    onChange={(e) => inputChange(e)}
                                    required="required"
                                    name="name"
                                    value={name}
                                /></Grid>
                        </div>
                        <div className='mb-3' id="tf">
                            <Grid item xs={12} sm={6}>
                                <TextField
                                    fullwidth
                                    id="outlined-textarea"
                                    label="Department"
                                    placeholder="Enter the Department"
                                    onChange={(e) => inputChange(e)}
                                    required="required"
                                    name="dept"
                                    value={dept}
                                /></Grid>
                        </div>
                        <div className='mb-3 ' id="tf">
                            <Grid item xs={12} sm={6}>

                                <TextField
                                    fullwidth
                                    id="outlined-textarea"
                                    label="Salary"
                                    placeholder="Enter the Salary"
                                    onChange={(e) => inputChange(e)}
                                    required="required"
                                    type="number"
                                    name="salary"
                                    value={salary}
                                /></Grid>
                        </div>
                        <button type='submit' className='btn btn-outline-primary' id="btn">Submit</button>
                        <Link to="/" className='btn btn-outline-danger mx-2' id="btn">Cancel</Link>
                    </form>
                </div>
            </div>
        </div>

    )
}
