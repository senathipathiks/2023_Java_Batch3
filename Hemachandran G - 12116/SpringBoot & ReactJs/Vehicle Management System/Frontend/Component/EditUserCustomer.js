import React, { useEffect, useState } from 'react'
import { Link, useParams } from 'react-router-dom'
import { useNavigate } from 'react-router-dom';
import axios from 'axios';
import VehicleService from './Service/VehicleService';
import CustomerService from './Service/CustomerService';

function EditUserCustomer() {

    const { customerId } = useParams()

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

    useEffect(() => {
        loadUser()
        // window.alert("load user executed");
    }, []);



    // const onPost = async (e) => {
    //     e.preventDefault()
    //     console.log(vehic);
    //     await axios.put(`http://localhost:8001/Update/${vehicleId}`, vehic)
    //     window.alert(" Details Updated  Succesfully !")
    //     navigate("/")

    // }

    const onPost = (e) =>{
        e.preventDefault();
        CustomerService.UpdateCustomer(customerId, cus)
            alert("Update Successfull !")
            navigate("/")

    }


    const loadUser = async () => {

        const result = await axios.get(`http://localhost:8001/GetCustomerByID/${customerId}`);
        // window.alert("its load user");
        setCus(result.data)

    }
    return (

        <div className='container'>

            <div className='row d-flex align-items-center justify-content-center'>
                <div className='col-md-6 dark-md-3  border rounded p-4 mt-2 shadow'>
                    <h2 className="text-center m-4">Edit Customer</h2>
                    <form onSubmit={(e) => onPost(e)}>
                        <div className='mb-3'>
                            <label htmlFor='customeName' className='form-label'>Customer Name: </label>
                            <input type={"text"} className='form-control' placeholder='Enter Name' value={customerName} name='customeName' required onChange={(e) => onInputChange(e)} />
                        </div>
                        <div className='mb-3'>
                            <label htmlFor='customerPhnNo' className='form-label'>Custome Phone Number: </label>
                            <input type={"text"} className='form-control' placeholder='Enter Type' value={customerPhnNo} name='customerPhnNo' required onChange={(e) => onInputChange(e)} />
                        </div>
                        <div className='mb-3'>
                            <label htmlFor='customerAddress' className='form-label'>Customer Address : </label>
                            <input type={"text"} className='form-control' placeholder='Enter Brand' value={customerAddress} name='customerAddress' required onChange={(e) => onInputChange(e)} />
                        </div>
                        
                        <button type="submit" className='btn btn-outline-primary'>Submit</button>
                        <Link type="submit" to="/" className='btn btn-outline-danger mx-2'>Cancel</Link>
                    </form>
                </div>
            </div>
        </div>
    )
}

export default EditUserCustomer