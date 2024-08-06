import React, { useEffect, useState } from 'react'
import BookingService from '../Services/BookingService';
import { Link, NavLink } from "react-router-dom";
import { IoMdJet } from "react-icons/io";
import axios from 'axios';

export default function PaymentBookings() {

    const [book, setBook] = useState([])



    useEffect(() => {
        loadAllBookings();
    }, []);


    const loadAllBookings = async () => {
        const result = await BookingService.getPaymentBookings();
        setBook(result.data);
        console.log(result.data)

    };

    return (
        <div>
            <nav className="navbar">
                <div className="nav-container">
                    <NavLink exact to="/" className="nav-logo">
                        <span><IoMdJet />  Tourism Management System
                        </span>
                        <span className="icon">
                        </span>
                    </NavLink>

                    <ul className="nav-item"
                    // className={click ? "nav-menu active" : "nav-menu"}
                    >

                        <NavLink
                            exact
                            to="/adminhome"
                            id='backTo'
                            activeClassName="active"
                            className="nav-links"
                        // onClick={handleClick}
                        >
                            Back to Home
                        </NavLink>
                    </ul>

                </div>
            </nav><br/>
            <h3>PAYMENT STATUS</h3>

            <div className="table-container">
                <table className="table border shadow table table table-striped " >
                    <thead className="table-dark" >
                        <tr>
                            <th scope="col">Booking Id</th>
                            <th scope="col">Booking Date</th>
                            <th scope="col">User Name</th>
                            <th scope="col">Destination Name</th>
                            <th scope="col">Paid Amount</th>


                        </tr>
                    </thead>
                    <tbody>
                        {book.map((books, index) => (

                            <tr>
                                <th scope="row" key={index}>{books.bookingId}</th>
                                <td>{books.bookingDate}</td>
                                <td>{books.user.userName}</td>
                                <td><Link to={`/adminPay/${books.bookingId}`}>{books.packagedetails.destinationPlace}</Link></td>
                                <td>{books.packagedetails.price}</td>


                            </tr>
                        ))}

                    </tbody>
                </table>
            </div>

        </div>
    );
}

