import 'bootstrap/dist/css/bootstrap.min.css';
import React, { Component } from 'react';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import { Link, Route, BrowserRouter as Router, Routes } from 'react-router-dom';
import About from './MyPages/About';
import Contact from './MyPages/Contact';
import Home from './MyPages/Home';
import './logo.png';

class RouterExample extends Component {
    render() {
        return (
        <Router>
            <Navbar bg="light" expand="lg">
                <Navbar.Brand href="#home">
                    <img
                        alt="img"
                        src="./logo.png"
                        width="30"
                        height="30"
                        className="d-inline-block align-top"
                    />
                    {' '}
                    Sanjay Khanna
                </Navbar.Brand>
                <Navbar.Toggle aria-controls="basic-navbar-nav" />
                <Navbar.Collapse id="basic-navbar-nav">
                    <Nav className="mr-auto">
                        <Nav.Link as={Link} to="/">Home</Nav.Link>
                        <Nav.Link as={Link} to="/about">About</Nav.Link>
                        <Nav.Link as={Link} to="/contact">Contact Us</Nav.Link>
                    </Nav>
                </Navbar.Collapse>
            </Navbar>
            <Routes>
                <Route path="/" element={<Home />}/>
                <Route path="/about" element={<About />}/>
                <Route path="/contact" element={<Contact />}/>
            </Routes>
        </Router>
        );
    }
}

export default RouterExample;