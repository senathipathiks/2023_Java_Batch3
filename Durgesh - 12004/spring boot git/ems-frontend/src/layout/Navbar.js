import React from 'react'
import {Link} from "react-router-dom";

export default function Navbar() {
    return (
        <div >
            <nav class="navbar navbar-expand-lg" id="navbar">
                <div class="container-fluid">
                    <Link className='navbar-brand' to="/" id="link">
                       <h4>EMPLOYEE MANAGEMENT SYSYTEM</h4> 
                    </Link>
                    <Link className='btn btn-outline-light ' to="/add" id="btn1">
                        Add Employee
                    </Link>
                    {/* <Link className='btn btn-outline-light ' to="/update/:id" id="btn1">
                        Update Employee
                    </Link>                     */}
                </div>
            </nav>
        </div>
    )
}
