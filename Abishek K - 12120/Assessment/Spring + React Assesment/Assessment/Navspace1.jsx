import React, { useState } from "react";
import {
  BrowserRouter as Router,
  Route,
  Routes,
  Link,
  BrowserRouter,
} from "react-router-dom";
import "bootstrap/dist/css/bootstrap.min.css";
import { IoHome } from "react-icons/io5";
import { BsDatabaseAdd } from "react-icons/bs";
import { BsDatabaseFillUp } from "react-icons/bs";
import { BsDatabaseFillX } from "react-icons/bs";
import { FaSearch } from "react-icons/fa";
import { BsCollection } from "react-icons/bs";
import { Nav, Navbar, Container } from "react-bootstrap";

import Tinsert from "./Tinsert";
import Tupdate from "./Tupdate";
import Tdelete from "./Tdelete";
import Tfind from "./Tfind";
import Tfindall from "./Tfindall";
import Uinsert from "./Uinsert";
import Uupdate from "./Uupdate";
import Udelete from "./Udelete";
import Ufind from "./Ufind";
import Ufindall from "./Ufindall";
import Home1 from "./Home1";

const Navspace = () => {
  const [navOpt, setnavOpt] = useState("");

  const handleNav = (data) => {
    setnavOpt(data);
  };
  return (
    <>
      <BrowserRouter>
        <Navbar
          expand="lg"
          className="bg-body-tertiry"
          bg="dark"
          variant="dark"
          sticky="top"
        >
          <Container>
            <Navbar.Brand href="#home">
              <img
                alt=""
                src="https://www.shutterstock.com/image-vector/train-ticket-booking-through-mobile-260nw-2251245811.jpg"
                width="100"
                height="70"
                className="d-inline-block align-top"
              />{" "}
            </Navbar.Brand>
            <Navbar.Toggle
              aria-controls="basic-navbar-nav"
              id="nav-toggle-button"
            />
            <Navbar.Collapse id="basic-navbar-nav">
              <Nav className="me-auto">
                <Nav.Link as={Link} to="/">
                  <div className="box">
                    <b className="icon">
                      <IoHome />
                      Home
                    </b>
                  </div>
                </Nav.Link>
                <Nav.Link
                  as={Link}
                  to={navOpt === "Train" ? "/insert" : "/CInsert"}
                >
                  <div className="box">
                    <b className="icon">
                      <BsDatabaseAdd />
                      Insert
                    </b>
                  </div>
                </Nav.Link>
                <Nav.Link
                  as={Link}
                  to={navOpt === "Train" ? "/update" : "/CUpdate"}
                >
                  <div className="box">
                    <b className="icon">
                      <BsDatabaseFillUp />
                      Update
                    </b>
                  </div>
                </Nav.Link>
                <Nav.Link
                  as={Link}
                  to={navOpt === "Train" ? "/search" : "/CFind"}
                >
                  <div className="box">
                    <b className="icon">
                      <FaSearch />
                      Search
                    </b>
                  </div>
                </Nav.Link>
                <Nav.Link
                  as={Link}
                  to={navOpt === "Train" ? "/delete" : "/CDelete"}
                >
                  <div className="box">
                    <b className="icon">
                      <BsDatabaseFillX />
                      Delete
                    </b>
                  </div>
                </Nav.Link>
                <Nav.Link
                  as={Link}
                  to={navOpt === "Train" ? "/findall" : "/CFindall"}
                >
                  <div className="box">
                    <b className="icon">
                      <BsCollection />
                      SinglePage
                    </b>
                  </div>
                </Nav.Link>
              </Nav>
            </Navbar.Collapse>
            <Navbar.Collapse className="justify-content-end">
              <Nav.Link onClick={() => handleNav("Train")}>
                {navOpt === "Train" ? (
                  <button className="btn btn-primary">Train</button>
                ) : (
                  "Train"
                )}
              </Nav.Link>
              <Nav.Link
                onClick={() => {
                  handleNav("user");
                }}
              >
                {navOpt === "user" ? (
                  <button className="btn btn-primary">User</button>
                ) : (
                  "User"
                )}
              </Nav.Link>
            </Navbar.Collapse>
          </Container>
        </Navbar>

        <Routes>
          <Route path="/" element={<Home1 />} />
          <Route path="/insert" element={<Tinsert />} />
          <Route path="/update" element={<Tupdate />} />
          <Route path="/search" element={<Tfind />} />
          <Route path="/delete" element={<Tdelete />} />
          <Route path="/findall" element={<Tfindall />} />
          <Route path="/CInsert" element={<Uinsert />} />
          <Route path="/CFind" element={<Ufind />} />
          <Route path="/CDelete" element={<Udelete />} />
          <Route path="/CUpdate" element={<Uupdate />} />
          <Route path="/CFindall" element={<Ufindall />} />
        </Routes>
      </BrowserRouter>
    </>
  );
};

export default Navspace;
