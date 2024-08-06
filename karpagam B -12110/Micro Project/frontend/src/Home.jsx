import React, { useState } from "react";
import { NavLink } from "react-router-dom";
import './Home.css';
import { IoMdJet } from "react-icons/io";
import HomeIcon from '@mui/icons-material/Home';
import AdminPanelSettingsIcon from '@mui/icons-material/AdminPanelSettings';
import SupervisorAccountIcon from '@mui/icons-material/SupervisorAccount';
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
import TimelapseIcon from '@mui/icons-material/Timelapse';
import { useEffect } from "react";
import axios from "axios";
import Swal from "sweetalert2";

function Home() {
  const [click, setClick] = useState(false);

  const handleClick = () => setClick(!click);

  const [products, setProducts] = useState([]);

  const win = null;

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

  const handleBookJourney = () => {
    if (win == null) {
      Swal.fire({
        title: 'Please sign in to book',
        text: 'You need to sign in to book your  Journey, Click Here to signin',
        icon: 'warning',
        confirmButtonText: '<a href="/user" >OK</a>',
        confirmButtonColor: 'black',
        

      });
    } else {
      window.location.href = `/`;
    }
  };

  return (
    <>
      <nav className="navbar">
        <div className="nav-container">
          <NavLink exact to="" className="nav-logo">
            <span><IoMdJet />  Tourism Management System
            </span>
            <span className="icon">
            </span>
          </NavLink>

          <ul className={click? "nav-menu active" : "nav-menu"}>
            <li className="nav-item">
              <NavLink
                exact
                to="/"
                activeClassName="active"
                className="nav-links"
                onClick={handleClick}
              >

                <HomeIcon /> <b>Home</b>
              </NavLink>
            </li>
            <li className="nav-item">
              <NavLink
                exact
                to="/admin"
                activeClassName="active"
                className="nav-links"
                onClick={handleClick}
                id="admin"
              >
                <AdminPanelSettingsIcon /> <b>Admin Login</b>
              </NavLink>
            </li>
            <li className="nav-item">
              <NavLink
                exact
                to="/user"
                id="user"
                activeClassName="active"
                className="nav-links"
                onClick={handleClick}
              >
                < SupervisorAccountIcon /><b>User Login</b>
              </NavLink>
            </li>
          </ul>

        </div>
      </nav>
      <br /><br />
      <img src="https://primeproperties.com.eg/wp-content/uploads/2022/01/who-we-are-1-1.jpg" width={'1480px'}></img>

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
                    <NavLink onClick={handleBookJourney}><button className="btn btn-dark mx-2" >BOOK YOUR NEXT JOURNEY</button></NavLink>


                  </MDBCardBody>
                </MDBCard>
              </MDBCol>
            ))}

          </MDBRow>
        </MDBContainer>
      </div>
    </>
  );
}

export default Home;