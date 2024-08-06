import React, { useEffect, useState } from 'react';
import { MDBCol, MDBContainer, MDBRow, MDBCard, MDBCardText, MDBCardBody, MDBCardImage, MDBTypography, MDBIcon } from 'mdb-react-ui-kit';
import EditNoteIcon from '@mui/icons-material/EditNote';
import AccountCircleIcon from '@mui/icons-material/AccountCircle';
import FacebookIcon from '@mui/icons-material/Facebook';
import TwitterIcon from '@mui/icons-material/Twitter';
import InstagramIcon from '@mui/icons-material/Instagram';
import ArrowLeftIcon from '@mui/icons-material/ArrowLeft';

import { NavLink } from "react-router-dom";
import { IoMdJet } from "react-icons/io";
import axios from 'axios';
export default function UserProfilePage() {

    const [click, setClick] = React.useState(false);

    const handleClick = () => setClick(!click);

    const [book, setBook] = useState([])


    const win = sessionStorage.getItem("userName");
    const winid = sessionStorage.getItem("userId");
    console.log(winid);

    const loadAllUsers = async (e) => {
        await axios
         .get(`http://localhost:8080/GetByUserId/${winid}`)
    
         .then((res) => setBook(res.data))
    
         .catch((err) => console.log(err));
      };
    
    
    
      useEffect(() => {
        loadAllUsers();
      }, []);

    return (

        <> <nav className="navbar">
            <div className="nav-container">
                <NavLink exact to="/" className="nav-logo">
                    <span><IoMdJet />  Tourism Management System
                    </span>
                    <span className="icon">
                    </span>
                </NavLink>

                <ul
                    className={click? "nav-menu active" : "nav-menu"}
                >
                    <li className="nav-item">
                    <NavLink
                            exact
                            to="/viewtour"
                            activeClassName="active"
                            className="nav-links"
                        >
                            <ArrowLeftIcon />Back to Home
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
        <section style={{ backgroundColor: 'whitesmoke' }}>
            <MDBContainer className="py-3 h-100" style={{ height: '100%' }}>
                <MDBRow className="justify-content-center align-items-center h-200"  id='mdb'>
                    <MDBCol lg="6" className="mb-4 mb-lg-3">
                        <MDBCard className="mb-6" style={{ borderRadius: '.8rem' }}>
                            <MDBRow className="g-0">
                                <MDBCol md="4" className="gradient-custom text-center text-black" id='col'
                                    style={{ borderTopLeftRadius: '.5rem', borderBottomLeftRadius: '.5rem' }}>
                                    <MDBCardImage src="https://img.freepik.com/iconos-gratis/usuario_318-875902.jpg"
                                        alt="Avatar" className="my-5" style={{ width: '100px' }} fluid />
                                
                                    <MDBTypography tag="h5"><b>{book.userName}</b></MDBTypography>
                                    <MDBCardText><NavLink  to={`/useredit/${book.userId}`}><EditNoteIcon  /><b> Edit your  Information </b></NavLink> </MDBCardText>
                                    <MDBIcon far /> 
                                </MDBCol>
                                <MDBCol md="14">
                                    <MDBCardBody className="p-4">
                                        <MDBTypography tag="h6"><b> Personal Information</b></MDBTypography>
                                        <hr className="mt-0 mb-4" />
                                        <MDBRow className="pt-1">
                                            <MDBCol size="6" className="mb-3">
                                                <MDBTypography tag="h6"><b>Email</b></MDBTypography>
                                                <MDBCardText className="text-muted">{book.userEmail}</MDBCardText>
                                            </MDBCol>
                                            <MDBCol size="6" className="mb-3">
                                                <MDBTypography tag="h6"><b>Phone</b></MDBTypography>
                                                <MDBCardText className="text-muted">{book.userMobile}</MDBCardText>
                                            </MDBCol>
                                        </MDBRow>


                                            {/* <MDBTypography tag="h6"></MDBTypography> */}
                                            <hr className="mt-0 mb-3" />
                                            <MDBRow className="pt-1" id='rows'>
                                                <MDBCol size="6" className="mb-4">
                                                    <MDBTypography tag="h6"><b>User Location</b></MDBTypography>
                                                    <MDBCardText className="text-muted">{book.userAddress}</MDBCardText>
                                                </MDBCol>
                                              
                                            </MDBRow>

                                            <div className="d-flex justify-content-center">
                                                <a href="#!"><MDBIcon fab icon="facebook me-3" size="lg" /><FacebookIcon/></a>
                                                <a href="#!"><MDBIcon fab icon="twitter me-3" size="lg" /><TwitterIcon/></a>
                                                <a href="#!"><MDBIcon fab icon="instagram me-3" size="lg" /><InstagramIcon/></a>
                                            </div>
                                        </MDBCardBody>
                                    </MDBCol>

                                </MDBRow>
                            </MDBCard>
                        </MDBCol>
                    </MDBRow>
                </MDBContainer>
            </section>
        </>
    );
}