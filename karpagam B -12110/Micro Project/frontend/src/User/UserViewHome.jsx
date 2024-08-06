import React, { useEffect, useState } from "react";
import axios from "axios";
import ArrowLeftIcon from '@mui/icons-material/ArrowLeft';
import { Link, useNavigate, useParams } from "react-router-dom";
import { NavLink } from "react-router-dom";
import { IoMdJet } from "react-icons/io";
import TimelapseIcon from '@mui/icons-material/Timelapse';
import AccountCircleIcon from '@mui/icons-material/AccountCircle';
import ViewModuleIcon from '@mui/icons-material/ViewModule';
import DeleteForeverIcon from '@mui/icons-material/DeleteForever';
import UpgradeIcon from '@mui/icons-material/Upgrade';

import {
    MDBContainer,
    MDBRow,
    MDBCol,
    MDBCard,
    MDBCardBody,
    MDBCardImage,
    MDBCardTitle,
} from "mdb-react-ui-kit";
import Swal from "sweetalert2";

const Userho = () => {
    const [books, setBooks] = useState({
        user: {

        },
        packagedetails: {

        }
    });
    let navigate = useNavigate();

    const win = sessionStorage.getItem("userName");
    const winid = sessionStorage.getItem("userId");
    console.log(winid);

    const [click, setClick] = React.useState(false);

    const handleClick = () => setClick(!click);

    const { bookingId } = useParams();

    const fetchProducts = async () => {
        try {
            const response = await axios.get(`http://localhost:8080/GetBookingId/${bookingId}`);
            setBooks(response.data);
        } catch (error) {
            console.error(error);
        }
    };

    useEffect(() => {

        fetchProducts();
    }, []);

    const cancelBooking = async (bookingId) => {
        Swal.fire({
            title: 'Are you sure?',
            text: "You won't be able to revert this!",
            type: 'warning',
            showCancelButton: true,
            confirmButtonColor: '#3085d6',
            cancelButtonColor: '#d33',
            confirmButtonText: 'Yes, delete it!'
        }).then((result) => {
            if (result.value) {
                axios.delete(`http://localhost:8080/deleteBooking/${bookingId}`)
                    .then(() => {
                        Swal.fire(
                            'Deleted!',
                            'Your Booking has been deleted.',
                            'success',
                             navigate("/userbookcheck")
                        
                        );
                        fetchProducts();
                    })
                    .catch((err) => console.log(err));
            }
        });
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

                    <ul
                        className={click ? "nav-menu active" : "nav-menu"}
                    >

                        <li className="nav-item">
                            <NavLink
                                exact
                                to="/userbookcheck"
                                activeClassName="active"
                                className="nav-links"
                                onClick={handleClick}
                            >
                                <ViewModuleIcon />  VIEW BOOKINGS STATUS
                            </NavLink>
                        </li>


                        <li className="nav-item">
                            <NavLink
                                exact
                                activeClassName="active"
                                className="nav-links"
                                to="/userprofile"
                                onClick={handleClick}
                            >
                                {win} <AccountCircleIcon />
                            </NavLink>
                        </li>


                    </ul>

                </div>
            </nav>
            <div className="container">
                <br />
                <MDBContainer fluid className="my-6 d-flex justify-content-center">
                    <MDBRow className="justify-content-center">
                        {/* {products.map((book,index) => ( */}

                        <MDBCol md="4" lg="6" xl="10" className="d-flex justify-content-center">                                <MDBCard className="text-black">
                                    <MDBCardImage
                                        className="bg-image rounded hover-zoom"
                                        id="style"
                                        src={`data:image/jpeg;base64,${books.packagedetails.destImage}`}
                                        position="top"
                                        alt="Tourist Images"
                                    />
                                    <MDBCardBody>
                                        <div className="text-center">
                                            <MDBCardTitle><b>Believing is seeing - {books.packagedetails.destinationPlace}</b></MDBCardTitle>
                                            <p className="text-muted mb-4"><i>{books.packagedetails.description}</i></p>
                                        </div>
                                        <div>

                                            <div className="d-flex justify-content-between">
                                                <span><b>PACKAGE NAME </b></span>
                                                <span>{books.packagedetails.packageName}</span>
                                            </div>
                                            {/* <div className="d-flex justify-content-between">
                                                <span><b>PERSONS ALLOWED</b></span>
                                                <span>{product.packagedetails.personsAlllowed}</span>
                                            </div> */}
                                            <div className="d-flex justify-content-between">
                                                <span><b>TOUR COST</b></span>
                                                <span>{books.packagedetails.price}</span>
                                            </div>
                                            {/* <div className="d-flex justify-content-between">
                                                <span><b>TRANSPORT <DriveEtaIcon /></b></span>
                                                <span>{product.packagedetails.travelMode}</span>
                                            </div>  */}
                                            <div className="d-flex justify-content-between">
                                                <span><b>BOOKED DATE </b></span>
                                                <span>{books.bookingDate}</span>
                                            </div>
                                            <div className="d-flex justify-content-between">
                                                <span><b>BOOKING STATUS </b></span>
                                                <span>{books.bookingStatus}</span>
                                            </div>
    
    
    
                                        </div>
    
                                        <br />
                                        <NavLink to={`/editTour/${books.bookingId}`}><button className="btn btn-light btn-outline-dark mx-2"><UpgradeIcon/><b>UPDATE BOOKING</b></button></NavLink>
                                        <button className="btn btn-light btn-outline-danger mx-2" id='bookpt' onClick={() => cancelBooking(books.bookingId)} ><DeleteForeverIcon /><b>CANCEL BOOKING</b></button>
    
    
                                    </MDBCardBody>
                                </MDBCard>
                            </MDBCol>
                        {/* ))} */}
    
                    </MDBRow>
                </MDBContainer>
            </div>
    
        </>
    );
    
};

export default Userho;