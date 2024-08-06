import React, { useState, useEffect } from 'react'
import { Link, useNavigate, useParams } from 'react-router-dom';
import "bootstrap/dist/css/bootstrap.min.css";
import { NavLink } from "react-router-dom";
import { IoMdJet } from "react-icons/io";
import axios from 'axios';
import ArrowLeftIcon from '@mui/icons-material/ArrowLeft';
import { Grid,TextField } from '@mui/material';

export default function AddBooking() {

    //to navigate to the home page after clicking submit
    let navigate = useNavigate()

    const winId = sessionStorage.getItem("userId");
    console.log("userId:" + winId);

    const [booking, setBooking] = useState({
        bookingId: '',
        bookingDate: "",
        bookingType: "",
        bookingStatus: "",
        user: {
            userId: winId
        },
        packagedetails: {
            packageId: useParams().packageId,
        }

    });

    useEffect(() => {
        console.log(booking);
    }, [booking]);

    const { packageId } = useParams();

    useEffect(() => {
        setBooking({
           ...booking,
            packagedetails: {
                packageId: packageId
            }
        });
    }, [])

    console.log(booking)

    const [bookingDateError, setBookingDateError] = useState("");

    const onInputChange = (e) => {
        if (e.target.name === "bookingDate") {
            const selectedDate = new Date(e.target.value);
            const today = new Date();
            if (selectedDate <= today) {
                setBookingDateError("You can't book the journey on or before Today");
            } else {
                setBookingDateError("");
            }
            setBooking({
               ...booking,
                [e.target.name]: e.target.value,
            });
        } else {
            setBooking({
               ...booking,
                [e.target.name]: e.target.value,
            });
        }
    };

    const onSubmit = async (e) => {
        e.preventDefault();

        setBooking({...booking, packagedetails: { packageId: packageId } })

        try {
            const response = await axios.post("http://localhost:8080/bookinginsert", booking);
            console.log(response.data);
            navigate("/userbookcheck")
        } catch (error) {
            alert("error")

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
                    // className={click? "nav-menu active" : "nav-menu"}
                    >

                        <NavLink
                            exact
                            to="/userhome"
                            activeClassName="active"
                            className="nav-links"
                        // onClick={handleClick}
                        >
                            <ArrowLeftIcon />  Back to Home
                        </NavLink>
                    </ul>

                </div>
            </nav>
            <br /><br /><br />   
            <div className='container '
                id='Carder'>
                <div className='row'>
                    <div className="col-md-6 offset-md-3 border rounded p-4 mt-4 shadow dark ">
                        <h2 className='text-center m-4' ><b className='.text-danger'> BOOK YOUR NEXT JOURNEY!!</b></h2>
                        <form onSubmit={(e) => onSubmit(e, booking)}
                        >
                            <Grid item xs={12} md={6}>
                                <label htmlFor='petName' className='form-label' role="petlabel"><b>Enter Booking Date</b></label>

                                <TextField
                                    required
                                    name="bookingDate"
                                    type="date"
                                    fullWidth
                                    margin="normal"
                                    size="medium"
                                    id='date'
                                    InputLabelProps={{ shrink: true }}
                                    inputProps={{ min: new Date().toISOString().split("T")[0] }}
                                    onChange={(e) => onInputChange(e)}
                                    helperText={bookingDateError}
                                    error={!!bookingDateError}
                                />
                            </Grid>

                            <button type='submit' className='submit btn btn-dark' sx={{ mt: 3, mb: 2, bgcolor: '#1f5156' }}
                                id='insertsubmit' data-testid="pet-submit">BOOK</button>
                            <Link type='submit' className='btn btn-danger mx-2' to="/viewtour">CANCEL</Link>


                        </form>
                    </div>
                </div>
            </div></>
    )
}