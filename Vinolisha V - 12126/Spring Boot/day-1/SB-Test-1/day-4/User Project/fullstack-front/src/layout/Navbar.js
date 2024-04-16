import React, { useState } from "react";
import { Link } from "react-router-dom";

export default function Navbar() {

 

  return (
    <div>
      <nav className="navbar navbar-expand-lg navbar-dark bg-dark">
        <div className="container-fluid">
          <div className="me-1 accordion ">
            <a className="navbar-brand" href="#">
              Employee Management System
            </a>
          </div>

         
          <div className="d-flex justify-content-end ">
            <Link
              className="btn btn-outline-light me-2"
              to="/searchuser"
              id="search"
            >
              Search User
            </Link>
            <Link
              className="btn btn-outline-light me-2"
              to="/deleteuser"
              id="DeleteUser"
            >
              Delete User
            </Link>
            <Link
              className="btn btn-outline-light "
              to="/userdetails"
              id="UserDetails"
            >
              User Details
            </Link>
          </div>
        </div>
      </nav>
    </div>
  );
}
