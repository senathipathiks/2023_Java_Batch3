import React, { useState } from 'react';
import { BrowserRouter, Link, Route, Routes } from "react-router-dom";
import Customer from './Customer';
import Dealer from './Dealer';
import Home from './Home';
import Product from './Product';


const Header = () => {
    const [navbarOpen, setNavbarOpen] = useState(false);
    return (
        <BrowserRouter>
        <div className='container-fluid sticky-top' id="header">
            <nav className="navbar navbar-expand-lg mt-2">
            <div className="navbar-brand fw-bold text-white h3">Inventory Management System</div>
                    <button
                        className="navbar-toggler ms-auto bg-light"
                        type="button"
                        data-bs-toggle="collapse"
                        data-bs-target="#navbarNav"
                        aria-controls="navbarNav"
                        aria-expanded="false"
                        aria-label="Toggle navigation"
                        onClick={() => setNavbarOpen(!navbarOpen)}
                    >
                        <i className="bi bi-list"></i>
                    </button>
                    <div
                        className={`collapse navbar-collapse ms-auto ${navbarOpen ? "show" : ""}`}
                    >
                        <ul className="navbar-nav ms-auto">
                            <li className="nav-item me-3">
                                <Link
                                    className="nav-link btn btn-outline-dark border-0 text-white rounded-pill"
                                    to="/"
                                >
                                <i className="bi bi-house"></i>Home Page
                                </Link>
                            </li>
                            <li className="nav-item me-3">
                                <Link
                                    className="nav-link btn btn-outline-dark border-0 text-white rounded-pill"
                                    to="/product"
                                >
                                <i className="bi bi-backpack"></i>Product Data
                                </Link>
                            </li>
                            <li className="nav-item">
                                <Link
                                    className="nav-link btn btn-outline-dark border-0 text-white rounded-pill"
                                    to="/customer"
                                >
                                <i className="bi bi-file-earmark-bar-graph"></i>Customer Data
                                </Link>
                            </li>
                            <li className="nav-item">
                                <Link
                                    className="nav-link btn btn-outline-dark border-0 text-white rounded-pill"
                                    to="/dealer"
                                >
                                <i className="bi bi-file-earmark-bar-graph"></i>dealer Data
                                </Link>
                            </li>
                        </ul>
                    </div>
            </nav>
            </div>
            <div className='container-fluid'>
    <Routes>
        <Route  path="/" element={<Home />}/>
        <Route  path="/product" element={<Product />}/>
        <Route   path="/customer" element={<Customer />} />
        <Route   path="/dealer" element={<Dealer />} />
    </Routes>
    </div>
    </BrowserRouter>
    );
}

export default Header;
