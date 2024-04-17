import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { Link, useNavigate, useParams } from 'react-router-dom';
import EmployeeService from  "../../services/EmployeeService";

export default function UpdateEmployee() {

    let navigate = useNavigate();

    const{eid, setid}=useState({});

    const { id } = useParams();

    const [employee, setEmployee] = useState({
        id: "",
        name: "",
        dept: "",
        salary: ""
    })

    const { name, dept, salary } = employee;

    const inputChange = (e) => {
        setEmployee({ ...employee, [e.target.name]: e.target.value })
    };

    useEffect(() => {
        onSet();
    }, []);

    const onSubmit = async (e) => {
        e.preventDefault();
        await EmployeeService.UpdateEmployee;
        navigate("/");
    };

    const onSet = async () => {
        const result = await axios.get("http://localhost:9090/getEmployeeId");
        setid(result.data)
    };

    return (
        <div className='container '>
            <div className='row '>
                <div className='col-md-6 offset-md-3 border rounded  p-4 mt-2 shadow '>
                    <h2 className='text-center m-4 '>Update Employee Form</h2>
                    <form>
                        <div className='mb-3 '>
                            <label htmlFor='id' className='form-label '>Employee ID : </label>
                            <input type='text' className='form-control ' placeholder="Enter the Name" name="name" value={id}></input>
                        </div>
                    </form>
                    <form onSubmit={(e) => onSubmit(e)}>
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
