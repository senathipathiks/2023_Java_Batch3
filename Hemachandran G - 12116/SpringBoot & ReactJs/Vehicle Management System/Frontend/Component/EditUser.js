import React, { useEffect, useState } from 'react'
import { Link, useParams } from 'react-router-dom'
import { useNavigate } from 'react-router-dom';
import axios from 'axios';
import VehicleService from './Service/VehicleService';

function EditUser() {

    const { vehicleId } = useParams()

    const navigate = useNavigate();
    const [vehic, setVehic] = useState({
        vehicleName: " ",
        vehicleType: " ",
        vehicleBrand: " ",
        fuelEntity: " ",
        weight: " "
    })

    const { vehicleName, vehicleType, vehicleBrand,
        fuelEntity, weight } = vehic;



    const onInputChange = (e) => {
        setVehic({ ...vehic, [e.target.name]: e.target.value });

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
        VehicleService.DoPut(vehicleId, vehic)
            alert("Update Successfull !")
            navigate("/")

    }


    const loadUser = async () => {

        const result = await axios.get(`http://localhost:8001/GetVehicleById/${vehicleId}`);
        // window.alert("its load user");
        setVehic(result.data)

    }
    return (

        <div className='container'>

            <div className='row d-flex align-items-center justify-content-center'>
                <div className='col-md-6 dark-md-3  border rounded p-4 mt-2 shadow'>
                    <h2 className="text-center m-4">Edit Employee</h2>
                    <form onSubmit={(e) => onPost(e)}>
                        <div className='mb-3'>
                            <label htmlFor='vehicleName' className='form-label'>Vehicle Name: </label>
                            <input type={"text"} className='form-control' placeholder='Enter Name' value={vehicleName} name='vehicleName' required onChange={(e) => onInputChange(e)} />
                        </div>
                        <div className='mb-3'>
                            <label htmlFor='vehicleType' className='form-label'>Vehicle Type: </label>
                            <input type={"text"} className='form-control' placeholder='Enter Type' value={vehicleType} name='vehicleType' required onChange={(e) => onInputChange(e)} />
                        </div>
                        <div className='mb-3'>
                            <label htmlFor='vehicleBrand' className='form-label'>Vehicle Brand: </label>
                            <input type={"text"} className='form-control' placeholder='Enter Brand' value={vehicleBrand} name='vehicleBrand' required onChange={(e) => onInputChange(e)} />
                        </div>
                        <div className='mb-3'>
                            <label htmlFor='fuelEntity' className='form-label'>Fuel Entity: </label>
                            <input type={"text"} className='form-control' placeholder='Enter Fuel Entity' value={fuelEntity} name='fuelEntity' required onChange={(e) => onInputChange(e)} />
                        </div>
                        <div className='mb-3'>
                            <label htmlFor='weight' className='form-label'>Vehicle Weight: </label>
                            <input type={"text"} className='form-control' placeholder='Enter Weight' value={weight} name='weight' required onChange={(e) => onInputChange(e)} />
                        </div>
                        <button type="submit" className='btn btn-outline-primary'>Submit</button>
                        <Link type="submit" to="/" className='btn btn-outline-danger mx-2'>Cancel</Link>
                    </form>
                </div>
            </div>
        </div>
    )
}

export default EditUser