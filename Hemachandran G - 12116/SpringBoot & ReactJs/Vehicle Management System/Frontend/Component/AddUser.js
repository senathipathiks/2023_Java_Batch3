import React, { useState, useEffect } from 'react'
import { Link } from 'react-router-dom'
import { useNavigate, useParams} from 'react-router-dom';
import VehicleService from './Service/VehicleService';
import axios from 'axios';

function AddUser() {

    const navigate = useNavigate();
    const { customerId } = useParams()
    const [cus, setCus] = useState([]);

    useEffect(() => {

        loadUser();

    }, []);

    const [vehi, setVehi] = useState({
        vehicleName: " ",
        vehicleType: " ",
        vehicleBrand: " ",
        fuelEntity: " ",
        weight: " ",
        customer:
        {
            customerId: " ",
            // customerName: " ",
            // customerPhnNo: " ",
            // customerAddress: " "
        }
    })

    const { vehicleName, vehicleType, vehicleBrand,
        fuelEntity, weight } = vehi;

    const onInputChange = (e) => {
        setVehi({ ...vehi, [e.target.name]: e.target.value });

    }
    const handleChange = (e) => {
        setVehi({ ...vehi, customer: { customerId: e.target.value } })

    }

    const loadUser = async () => {

        const result = await axios.get(`http://localhost:8001/ById`);
        // window.alert("its load user");
        setCus(result.data)

    }



    const onPost = async (e) => {
        // e.preventDefault();
        console.log(vehi)
        VehicleService.DoPost(vehi)

        alert("Added Successfully !")
        navigate("/")

    }



    return (

        <div className='container'>

            <div className='row d-flex align-items-center justify-content-center'>
                <div className='col-md-6 dark-md-3 border rounded p-4 mt-2 shadow'>
                    <h2 className="text-center m-4">Insert Vehicle Details</h2>
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
                        <div className='mb-3'>
                            <select

                                onChange={(e) => handleChange(e)}

                                name="customerId"
                                class="form-control"
                                placeholder="Enter Your Department"
                                required="required"
                                value={vehi.customer.customerId}

                            ><option value=''>Select Customer</option>
                                {cus.map((x) => (
                                    <option key={x} value={x}>
                                        {x}
                                    </option>
                                ))}
                            </select>
                        </div>

                        <button type="submit" className='btn btn-outline-primary'>Submit</button>
                        <Link type="submit" to="/" className='btn btn-outline-danger mx-2'>Cancel</Link>
                    </form>
                </div>
            </div>
        </div>
    )
}

export default AddUser