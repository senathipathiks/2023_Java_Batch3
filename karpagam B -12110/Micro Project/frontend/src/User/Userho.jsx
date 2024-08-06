import React, { useEffect, useMemo, useState } from "react";
import axios from "axios";
import { Link, useNavigate, useParams } from "react-router-dom";
import { NavLink } from "react-router-dom";
import { IoMdJet } from "react-icons/io";
import TimelapseIcon from '@mui/icons-material/Timelapse';
import AccountCircleIcon from '@mui/icons-material/AccountCircle';
import ViewModuleIcon from '@mui/icons-material/ViewModule';
import ArrowLeftIcon from '@mui/icons-material/ArrowLeft';

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
const Userho = () => {

    const [click, setClick] = useState(false);

    const handleClick = () => setClick(!click);
    const [products, setProducts] = useState([]);


    const win = sessionStorage.getItem("userName");
    const winid = sessionStorage.getItem("userId");
    console.log(winid);



    // const handleSubmit = (e) => {
    //     setSearch(e.target.value);
    // };

    // const onSearch = async () => {
    //     await axios
    //         .get(`http://localhost:8080/getdestination?destinationPlace=${search}`)
    //         .then((result) => {
    //             console.log(result.status);
    //             setProducts(result.data);
    //         })
    //         .catch((err) => console.log(err));
    // };

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

    const [search, setSearch] = useState("");

    const filterdestination = useMemo(() => {
        return products.filter((index) => {
            return index.destinationPlace.toUpperCase().includes(search.toUpperCase());
        });
    }, [products, search]);

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
                                id="book"
                            >
                                <ViewModuleIcon />  VIEW BOOKINGS STATUS
                            </NavLink>
                        </li>

                        <li className="nav-item">
                            <NavLink
                                exact
                                to="/userhome"
                                activeClassName="active"
                                className="nav-links"
                                onClick={handleClick}
                                id="viewback"
                            >
                                <ArrowLeftIcon />  BACK
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

            <div className='container '>
                <input
                    class="form-control mr-sm-2"
                    type="search"
                    placeholder="Places to go, things to do.."
                    aria-label="Search"
                    id="search"
                    onChange={(e) => setSearch(e.target.value)} />
            </div>

            <div className="container">
                <br />
                <MDBContainer fluid className="my-2">
                    <MDBRow className="justify-content-">
                        {filterdestination.map((product) => (

                            <MDBCol md="4" key={product.packageId}>
                                <MDBCard className="text-black">

                                    <MDBCardImage
                                        className="bg-image rounded hover-zoom"
                                        id="style"
                                        src={`data:image/jpeg;base64,${product.destImage}`}
                                        // style={{ display: "flex", flexDirection: "column", alignItems: "center" }}
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
                                        <NavLink to={`/userbook/${product.packageId}`}><button className="btn btn-dark"  id="button">Book Your Vacation with Us</button></NavLink>

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
export default Userho;

