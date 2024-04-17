import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { Link, useParams } from 'react-router-dom'
import EmployeeService from  "../service/EmployeeService";

export default function ViewEmployee() {

    const [employee, setEmployee] = useState({
        name: "",
        dept: "",
        salary: ""
    });

    const { id } = useParams();

    useEffect(() => {
        loadEmployee();
    }, []);

    const loadEmployee = async () => {
        const result = await EmployeeService.getEmployeeById(id);
        setEmployee(result.data);
    }

    return (
        <div className='container text-center align-content-center'>
            <div className='row '>
                <div className='col-md-6 offset-md-3 border rounded  p-4 mt-2 shadow '>
                    <h2 className='text-center m-4 '>View Employee Details</h2>
                    <div className='card'>
                        <table>
                            
                            <div className='card-card-header text-center bg-primary text-white '>
                                Details of Employee ID : {employee.id}
                            
                                <ul className='list-group list-group-flush'>
                                    <tr>
                                    <li className='list-group-item'>
                                       <td><b>Name : </b></td> 
                                        <td>{employee.name}</td>
                                    </li>
                                    </tr>
                                    <tr>
                                    <li className='list-group-item'>
                                        <td><b>Department : </b></td>
                                        <td>{employee.dept}</td>
                                    </li>
                                    </tr>
                                    <tr>
                                    <li className='list-group-item'>
                                        <td><b>Salary : </b></td>
                                        <td>{employee.salary}</td>
                                    </li>
                                    </tr>
                                </ul>

                            </div>
                        </table>

                    </div>
                    <Link className='btn btn-primary my-2 ' to={"/"}>Back</Link>
                </div>
            </div>
        </div>
    )
}
