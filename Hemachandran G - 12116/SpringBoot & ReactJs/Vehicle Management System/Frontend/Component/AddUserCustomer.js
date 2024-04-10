import React, { useState } from 'react'
import { Link } from 'react-router-dom'
import { useNavigate } from 'react-router-dom';
import axios from 'axios';
import VehicleService from './Service/VehicleService';
import CustomerService from './Service/CustomerService';

function AddUserCustomer() {

    const navigate = useNavigate();
    const [cus, setCus] = useState({
        customerName: " ",
        customerPhnNo: " ",
        customerAddress: " "
        
       
    })

    const { customerName, customerPhnNo, customerAddress,
        } = cus;

    const onInputChange = (e) => {
        setCus({ ...cus, [e.target.name]: e.target.value });

    }

    // const onPost = async (e) => {
    //     e.preventDefault()
    //     console.log(vehi);
    //     await axios.post("http://localhost:8001/Create", vehi)
    //     window.alert("Record Created Succesfully !")
    //     navigate("/")

    // }

    const onPost = async (e) =>{
        // e.preventDefault();
        console.log(cus)
        CustomerService.CreateCustomer(cus)
        
        alert("Added Successfully !")
        navigate("/")
        
    }

    

    return (

        <div className='container'>

            <div className='row d-flex align-items-center justify-content-center '>
                <div className='col-md-6 dark-md-3 border rounded p-4 mt-2 shadow'>
                    <h2 className="text-center m-4">Insert Customer Details</h2>
                    <form onSubmit={(e) => onPost(e)}>
                        <div className='mb-3'>
                            <label htmlFor='customerName' className='form-label'>Customer Name: </label>
                            <input type={"text"} className='form-control' placeholder='Enter Name' value={customerName} name='customerName' required onChange={(e) => onInputChange(e)} />
                        </div>
                        <div className='mb-3'>
                            <label htmlFor='customerPhnNo' className='form-label'>Customer Phone Number: </label>
                            <input type={"text"} className='form-control' placeholder='Enter Phone Number' value={customerPhnNo} name='customerPhnNo' required onChange={(e) => onInputChange(e)} />
                        </div>
                        <div className='mb-3'>
                            <label htmlFor='customerAddress' className='form-label'>Customer Address: </label>
                            <input type={"text"} className='form-control' placeholder='Enter Address' value={customerAddress} name='customerAddress'required  onChange={(e) => onInputChange(e)} />
                        </div>
                        
                        <button type="submit" className='btn btn-outline-primary'>Submit</button>
                        <Link type="submit" to="/" className='btn btn-outline-danger mx-2'>Cancel</Link>
                    </form>
                </div>
            </div>
        </div>
    )
}

export default AddUserCustomer