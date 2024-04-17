import React, { useEffect, useState } from 'react';
import { Link } from 'react-router-dom';
import EmployeeService from '../service/EmployeeService';

export default function Home() {

    const [employees, setEmployees] = useState([])

    useEffect(() => {
        loadEmployees();
    }, []);

    const loadEmployees = async () => {
        const result = await EmployeeService.getAllEmployee();
        setEmployees(result.data);
    };

    const deleteEmployees = async (id) => {
        await EmployeeService.deleteEmployee(id);
        alert("Employee Deleted Successfully");
        loadEmployees()
    }


    return (
        <div className='container' id="con">
            <br></br>
            <div className='container-fluid p-3 shadow' id="ed">
                <h3>Employee Details</h3>
            </div>
            <div className='py-4 '>
                <table className="w-full shadow" id="table1">
                    <thead className='bg-gray-100 border-b-2 border-gray-200 p-4'>
                        <tr>
                            <th scope="col" className='p-3 text-sm tracking-wide text-center'>S.No</th>
                            <th scope="col" className='p-3 text-sm tracking-wide text-center'>Employee ID</th>
                            <th scope="col" className='p-3 text-sm tracking-wide text-center'>Employee Name</th>
                            <th scope="col" className='p-3 text-sm tracking-wide text-center'>Employee Department</th>
                            <th scope="col" className='p-3 text-sm tracking-wide text-center'>Employee Salary</th>
                            <th scope="col" className='p-3 text-sm tracking-wide text-center'>Action</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            employees.map((employee, index) => (
                                <tr>
                                    <th scope="row" key={index}>{index + 1}</th>
                                    <td>{employee.id}</td>
                                    <td>{employee.name}</td>
                                    <td>{employee.dept}</td>
                                    <td>{employee.salary}</td>
                                    <td>
                                        <Link className='btn btn-primary mx-2 ' to={`/view/${employee.id}`}>View</Link>
                                        <Link className='btn btn-outline-primary mx-2 ' to={`/edit/${employee.id}`}>Edit</Link>
                                        <button className='btn btn-danger mx-2 '
                                            onClick={() => deleteEmployees(employee.id)}>Delete</button>
                                    </td>
                                </tr>
                            ))
                        }

                    </tbody>
                </table>

            </div>

        </div>
    )
}
