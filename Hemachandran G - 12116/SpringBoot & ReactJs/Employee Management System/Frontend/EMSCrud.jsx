import React from 'react'
import { useEffect } from 'react';
import { useState } from 'react';
import axios from 'axios';


function EMSCrud()
{
    const [empId, setId] = useState('');
    const [empName, setName] = useState('');
    const [salary, setSalary] = useState('');
    const [Employee, setEmployee] = useState([]);

useEffect(() => {
    (async ()=> await Load())();
}, []);
 
    async function Load()
    {
        const result = await axios.get(

        )
    }



  return (
    <div>
        <h1>Employee Details</h1>
        <div className='container mt-4 '>
            <form>
                <div className='form-group'>
                    <input type="text" className='form-control' id='empId' 
                    hidden value={empId} onChange={(event) =>
                    {
                        setId(event.target.value);
                    }}/>
                    <label>Employee Name</label>
                    <input type="text" className='form-control' id='empName' 
                    value={empName} onChange={(event) =>
                    {
                        setName(event.target.value);
                    }}/>
                    <label>Employee Salary</label>
                    <input type="text" className='form-control' id='salary' 
                    value={salary} onChange={(event) =>
                    {
                        setSalary(event.target.value);
                    }}/>
                </div>
                <div>
                    <button className='btn btn-primary mt-4' >Insert</button>
                    <button className='btn btn-warning mt-4' >Update</button>
                </div>
            </form>

        </div>
      
    </div>
  )
}

export default EMSCrud
