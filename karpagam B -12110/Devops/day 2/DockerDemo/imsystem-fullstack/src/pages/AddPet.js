import React, { useState, useEffect } from 'react'
import { Link, useNavigate } from 'react-router-dom';
import "bootstrap/dist/css/bootstrap.min.css";
import PetService from '../Services/PetService';

export default function AddPet() {

    //to navigate to the home page after clicking submit
    let navigate = useNavigate()

    const [pet, setPet] = useState({
        petId: "",
        petName: "",
        petType: "",
        petAge: "",
        petWeight: "",
        petPrice: ""

    })


    //.. for keep on adding new data or objects
    const onInputChange = (e) => {
        setPet({ ...pet, [e.target.name]: e.target.value });
    };



    //prevent default is to stop the unwanted url loading when clicking submit
    //to insert the data fetch axios link from postman API
    const onSubmit = async (e) => {
        console.log(pet);
        e.preventDefault();
        await PetService.AddPet(pet);
        // alert('Pet Details Added Successfully !!')
        navigate("/home");


    };








    return (

        <><div>
            <nav className="navbar navbar-expand-lg navbar-dark bg-secondary"
                id='navbar-custom-i'>
                <div className="container-fluid">
                    <Link className="navbar-brand" to={"/"}><h4><i><b>ONLINE PET SHOP</b></i></h4></Link>


                </div>
            </nav>
        </div>




            <div className='container '
                id='Carder'>
                <div className='row'>
                    <div className="col-md-6 offset-md-3 border rounded p-4 mt-4 shadow dark ">
                        <h2 className='text-center m-4' ><b className='.text-danger'> REGISTER PET DETAILS</b></h2>
                        <form onSubmit={(e) => onSubmit(e)}
                        >



                            <div className='mb-8'>
                                <label htmlFor='petName' className='form-label' role="petlabel"><b>PET NAME :</b></label>
                                <input type={'text'}
                                    className='form-label'
                                    placeholder='Enter Pet Name'
                                    name="petName"
                                    role='ptname'
                                    id='name'
                                    value={pet.petName}
                                    onChange={(e) => onInputChange(e)}
                                    required
                                />



                            </div>
                            <div className='mb-8'>
                                <label htmlFor='petType' className='form-label' role="typelabel"><b>Pet Type :</b></label>
                                <input type={'text'}
                                    className='form-label'
                                    placeholder='Enter Pet type'
                                    name="petType"
                                    id='type'
                                    role='pttype'
                                    value={pet.petType}
                                    onChange={(e) => onInputChange(e)}
                                    required
                                /></div>
                            <div className='mb-8'>
                                <label htmlFor='petAge' className='form-label' role="agelabel"><b>Pet age :</b></label>
                                <input type={'text'}
                                    className='form-label'
                                    placeholder='Enter Pet Age'
                                    name="petAge"
                                    id='age'
                                    role='ptage'
                                    value={pet.petAge}
                                    onChange={(e) => onInputChange(e)}
                                    required
                                /></div>
                            <div className='mb-8'>
                                <label htmlFor='petWeight' className='form-label' role="weightlabel"><b>Pet Weight:</b></label>
                                <input type={'text'}
                                    className='form-label'
                                    placeholder='Enter Pet Weight'
                                    name="petWeight"
                                    id='weight'
                                    role='ptweight'
                                    value={pet.petWeight}
                                    onChange={(e) => onInputChange(e)}
                                    required
                                /></div>

                            <div className='mb-8'>
                                <label htmlFor='petPrice' className='form-label' role="pricelabel"><b>Pet Price:</b></label>
                                <input type={'text'}
                                    className='form-label'
                                    placeholder='Enter Pet Price'
                                    name="petPrice"
                                    id='price'
                                    role='ptprice'
                                    value={pet.petPrice}
                                    onChange={(e) => onInputChange(e)}
                                    required
                                /></div>





                            <button type='submit' className='submit btn btn-info' id='insertsubmit' data-testid="pet-submit">SUBMIT</button>
                            <Link type='submit' className='btn btn-danger mx-2' to="/home">CANCEL</Link>


                        </form>
                    </div>
                </div>
            </div></>
    )
}
