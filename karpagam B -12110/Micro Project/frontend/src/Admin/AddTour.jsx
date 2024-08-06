import React, { useState, useEffect } from 'react'
import { Link, useNavigate } from 'react-router-dom';
import "bootstrap/dist/css/bootstrap.min.css";
import { NavLink } from "react-router-dom";
import { IoMdJet } from "react-icons/io";
import axios from 'axios';


export default function AddTour() {

    //to navigate to the home page after clicking submit
    let navigate = useNavigate()

    const [tour, setTour] = useState({
        packageId: "",
        packageName: "",
        destinationPlace: "",
        price: "",
        description: "",
        duration: "",
        packageType: "",
        travelMode: "",
        personsAlllowed: "",
        destImage: ""

    })


    //.. for keep on adding new data or objects
    const onInputChange = (e) => {
        setTour({ ...tour, [e.target.name]: e.target.value });
    };

    const handleFileChange = (event) => {
        setTour((prevTour) => ({ ...prevTour, destImage: event.target.files[0] }));
    };



    //to insert the data fetch axios link from postman API
    const onSubmit = async (e) => {
        console.log(tour);
        e.preventDefault();

        const formdata = new FormData();

        formdata.append("packageName", tour.packageName);
        formdata.append("destinationPlace", tour.destinationPlace);
        formdata.append("price", tour.price);
        formdata.append("description", tour.description);
        formdata.append("duration", tour.duration);
        formdata.append("packageType", tour.packageType);
        formdata.append("travelMode", tour.travelMode);
        formdata.append("personsAlllowed", tour.personsAlllowed);
        formdata.append("destImage", tour.destImage);

        try {
            const response = await axios.post(
                "http://localhost:8080/doPackageDetailsInsert",
                formdata
            );
            console.log(response.data);
            // alert("Tour details Added Successfull");
            navigate("/adminhome")
        } catch (error) {
            console.error(error);
        }


    };
    return (

        <>
            <nav className="navbar">
                <div className="nav-container">
                    <NavLink exact to="/" className="nav-logo">
                        <span><IoMdJet />  Tourism Management System
                        </span>
                        <span className="icon">
                        </span>
                    </NavLink>

                    <ul className="nav-item"
                    // className={click ? "nav-menu active" : "nav-menu"}
                    >

                        <NavLink
                            exact
                            to="/adminhome"
                            activeClassName="active"
                            className="nav-links"
                        // onClick={handleClick}
                        >
                            BACK
                        </NavLink>
                    </ul>

                </div>
            </nav>





            <div className='container '
                id='Carder'>
                <div className='row'>
                    <div className="col-md-10 offset-md-3 border rounded p-4 mt-4 shadow dark ">
                        <h2 className='text-center m-4' ><b className='.text-danger'> REGISTER TOUR PACKAGE DETAILS</b></h2>
                        <form onSubmit={(e) => onSubmit(e)}
                        >



                            <div className='mb-8'>
                                <label htmlFor='petName' className='form-label' role="petlabel"><b>Tour Package Name</b></label>
                                <input type={'text'}
                                    className='form-label'
                                    placeholder='Enter Package  Name'
                                    name="packageName"
                                    role='ptname'
                                    id='name'
                                    value={tour.packageName}
                                    onChange={(e) => onInputChange(e)}
                                    required
                                />



                            </div>
                            <div className='mb-8'>
                                <label htmlFor='petType' className='form-label' role="typelabel"><b>Destination Place</b></label>
                                <input type={'text'}
                                    className='form-label'
                                    placeholder='Enter Destination Name'
                                    name="destinationPlace"
                                    id='type'
                                    role='pttype'
                                    value={tour.destinationPlace}
                                    onChange={(e) => onInputChange(e)}
                                    required
                                /></div>
                            <div className='mb-8'>
                                <label htmlFor='petAge' className='form-label' role="agelabel"><b>Tour Cost </b></label>
                                <input type={'text'}
                                    className='form-label'
                                    placeholder='Enter Tour Cost'
                                    name="price"
                                    id='age'
                                    role='ptage'
                                    value={tour.price}
                                    onChange={(e) => onInputChange(e)}
                                    required
                                /></div>
                            <div className='mb-8'>
                                <label htmlFor='petWeight' className='form-label' role="weightlabel"><b>description </b></label>
                                <input type={'text'}
                                    className='form-label'
                                    placeholder='Description about the tour'
                                    name="description"
                                    id='weight'
                                    role='ptweight'
                                    value={tour.description}
                                    onChange={(e) => onInputChange(e)}
                                    required
                                /></div>

                            <div className='mb-8'>
                                <label htmlFor='petPrice' className='form-label' role="pricelabel"><b>Duration </b></label>
                                <input type={'text'}
                                    className='form-label'
                                    placeholder='Enter How many days'
                                    name="duration"
                                    id='price'
                                    role='ptprice'
                                    value={tour.duration}
                                    onChange={(e) => onInputChange(e)}
                                    required
                                /></div>
                            <div className='mb-8'>
                                <label htmlFor='petWeight' className='form-label' role="weightlabel"><b>Tour package Type </b></label>
                                <input type={'text'}
                                    className='form-label'
                                    placeholder='Enter Tour Package Type'
                                    name="packageType"
                                    id='weight'
                                    role='ptweight'
                                    value={tour.packageType}
                                    onChange={(e) => onInputChange(e)}
                                    required
                                /></div>
                            <div className='mb-8'>
                                <label htmlFor='travelMode' className='form-label' role="travelMode"><b>Travel Mode </b></label>
                                <input type={'text'}
                                    className='form-label'
                                    placeholder='Enter Travel Mode'
                                    name="travelMode"
                                    id='weight'
                                    role='ptweight'
                                    value={tour.travelMode}
                                    onChange={(e) => onInputChange(e)}
                                    required
                                /></div>

                            <div className='mb-8'>
                                <label htmlFor='petPrice' className='form-label' role="pricelabel"><b>Persons Allowed </b></label>
                                <input type={'text'}
                                    className='form-label'
                                    placeholder='Enter No of Persons Allowed'
                                    name="personsAlllowed"
                                    id='price'
                                    role='ptprice'
                                    value={tour.personsAlllowed}
                                    onChange={(e) => onInputChange(e)}
                                    required
                                /></div>
                            <div className='mb-8'>
                                <label htmlFor='petPrice' className='form-label' role="pricelabel"><b>Destination Image </b></label>
                                <input
                                    className='form-label'
                                    name="destImage"

    
                                    type="file"
                                    id='price'
                                    role='ptprice'
                                    onChange={handleFileChange}
                                    required
                                /></div>

                            <button type='submit' className='submit btn btn-dark' sx={{ mt: 3, mb: 2, bgcolor: '#1f5156' }}
                                id='insertsubmit' data-testid="pet-submit">SUBMIT</button>
                            <Link type='submit' className='btn btn-danger mx-2' to="/home">CANCEL</Link>


                        </form>
                    </div>
                </div>
            </div></>
    )
}
