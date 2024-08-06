import React, { useEffect, useState } from "react";
import axios from "axios";
import ArrowLeftIcon from '@mui/icons-material/ArrowLeft';
import { Link, useNavigate, useParams } from "react-router-dom";
import { NavLink } from "react-router-dom";
import { IoMdJet } from "react-icons/io";
import TimelapseIcon from '@mui/icons-material/Timelapse';
import AccountCircleIcon from '@mui/icons-material/AccountCircle';

import {
    MDBContainer,
    MDBRow,
    MDBCol,
    MDBCard,
    MDBCardBody,
    MDBCardImage,
    MDBCardTitle,
} from "mdb-react-ui-kit";
import DriveEtaIcon from '@mui/icons-material/DriveEta';
import Swal from "sweetalert2";
const AdminView = () => {


    const [products, setProducts] = useState([]);




    const win = sessionStorage.getItem("adminName");
     const [click, setClick] = React.useState(false);

    const handleClick = () => setClick(!click);

    useEffect(() => {
        const fetchProducts = async () => {
            try {
                const response = await axios.get("http://localhost:8080/getAllPackageDetailsList");
                setProducts(response.data);
            } catch (error) {
                console.error(error);
            }
        };

        fetchProducts();
    }, []);

    const cancelTourPackage = async (packageId) => {
        try {
            await axios.delete(`http://localhost:8080/deletePackage/${packageId}`);
        } catch (error) {
            if (error.response && error.response.status === 500) {
                Swal.fire({
                    title: 'Error',
                    text: 'Package is already booked by someone',
                    icon: 'error',
                    confirmButtonText: 'OK'
                });
            } else {
                console.error(error);
            }
        }
    }
    


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
                                to="/adminhome"
                                activeClassName="active"
                                className="nav-links"
                                onClick={handleClick}
                            >
                                <ArrowLeftIcon />BACK
                            </NavLink>
                        </li>



                        <li className="nav-item">
                            <NavLink
                                exact
                                activeClassName="active"
                                className="nav-links"
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
                <MDBContainer fluid className="my-2">
                    <MDBRow className="justify-content-">
                        {products.map((product) => (

                            <MDBCol md="4" key={product.packageId}>
                                {console.log(product.packageId)}
                                <MDBCard className="text-black">
                                    {/* <MDBIcon fab icon="apple" size="lg" className="px-3 pt-3 pb-2" /> */}

                                    <MDBCardImage
                                        className="bg-image rounded hover-zoom"
                                        // src="https://th.bing.com/th/id/R.6d2d92f8863c1d2bf348b32907ca0fd7?rik=TkKXrjq%2bt7j9qA&riu=http%3a%2f%2fwww.wanderglobe.org%2fwp-content%2fuploads%2f2018%2f07%2fKerala.jpg&ehk=92pMX7K8ylfCgxEIHXWpyuPu%2bM0LmfNB0H5bciNaSZ4%3d&risl=&pid=ImgRaw&r=0"
                                        src={`data:image/jpeg;base64,${product.destImage}`}
                                        width={'300%'}
                                        height={'100%'}
                                        position="top"
                                        alt="Tourist Images"
                                    />
                                    <MDBCardBody>
                                        <div className="text-center">
                                            <MDBCardTitle><b>Believing is seeing - {product.destinationPlace}</b></MDBCardTitle>
                                            <p className="text-muted mb-4"><i>{product.description}</i></p>
                                        </div>
                                        <div>

                                            <div className="d-flex justify-content-between">
                                                <span><b>DURATION <TimelapseIcon /></b></span>
                                                <span>{product.duration}</span>
                                            </div>
                                            <div className="d-flex justify-content-between">
                                                <span><b>PERSONS ALLOWED</b></span>
                                                <span>{product.personsAlllowed}</span>
                                            </div>
                                            <div className="d-flex justify-content-between">
                                                <span><b>TOUR COST</b></span>
                                                <span>{product.price}</span>
                                            </div>
                                            <div className="d-flex justify-content-between">
                                                <span><b>TRANSPORT <DriveEtaIcon /></b></span>
                                                <span>{product.travelMode}</span>
                                            </div>



                                        </div>

                                        <br />
                                        {/* <br/> */}
                                        <NavLink to={`/adminedit/${product.packageId}`}><button className="btn btn-dark mx-2" >UPDATE PACKAGE</button></NavLink>
                                        <button className="btn btn-danger" onClick={() => cancelTourPackage(product.packageId)} >DELETE PACKAGE</button>


                                    </MDBCardBody>
                                </MDBCard>
                            </MDBCol>
                        ))}

                    </MDBRow>
                </MDBContainer>
            </div>

        </>
    );
};

export default AdminView;