import React, { useState } from 'react'
import { Link } from 'react-router-dom'
import { useNavigate } from 'react-router-dom';
import axios from 'axios';

import AdminService from './Service/AdminService';

function AddUserAdmin() {

    const navigate = useNavigate();
    const [adm, setAdm] = useState({
        adminName: " ",
        adminPhnNo: " ",
        adminAddress: " "


    })

    const { adminName, adminPhnNo, adminAddress,
    } = adm;

    const onInputChange = (e) => {
        setAdm({ ...adm, [e.target.name]: e.target.value });

    }


    const onPost = async (e) => {
        // e.preventDefault();
        // console.log(cus)
        AdminService.CreateAdmin(adm)

        alert("Added Successfully !")
        navigate("/")

    }



    return (

        <div className='container'>

            <div className='row d-flex align-items-center justify-content-center '>
                <div className='col-md-6 dark-md-3 border rounded p-4 mt-2 shadow'>
                    <h2 className="text-center m-4">Insert Admin Details</h2>
                    <form onSubmit={(e) => onPost(e)}>
                        <div className='mb-3'>
                            <label htmlFor='adminName' className='form-label'>Admin Name: </label>
                            <input type={"text"} className='form-control' placeholder='Enter Name' value={adminName} name='adminName' required onChange={(e) => onInputChange(e)} />
                        </div>
                        <div className='mb-3'>
                            <label htmlFor='adminPhnNo' className='form-label'>Admin Phone Number: </label>
                            <input type={"text"} className='form-control' placeholder='Enter Phone Number' value={adminPhnNo} name='adminPhnNo' required onChange={(e) => onInputChange(e)} />
                        </div>
                        <div className='mb-3'>
                            <label htmlFor='adminAddress' className='form-label'>Admin Address: </label>
                            <input type={"text"} className='form-control' placeholder='Enter Address' value={adminAddress} name='adminAddress' required onChange={(e) => onInputChange(e)} />
                        </div>

                        <button type="submit" className='btn btn-outline-primary'>Submit</button>
                        <Link type="submit" to="/" className='btn btn-outline-danger mx-2'>Cancel</Link>
                    </form>
                </div>
            </div>
        </div>
    )
}

export default AddUserAdmin