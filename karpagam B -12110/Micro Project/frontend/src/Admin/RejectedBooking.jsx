import React, { useEffect, useState } from 'react';
import BookingService from '../Services/BookingService';
import { NavLink } from "react-router-dom";
import { IoMdJet } from "react-icons/io";

export default function RejectedBooking() {
  const [book, setBook] = useState([]);

  useEffect(() => {
    loadAllBookings();
  }, []);

  const loadAllBookings = async () => {
    const result = await BookingService.getRejectBookings();
    setBook(result.data);
    console.log(result.data);
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

          <ul className="nav-item">
            <NavLink
              exact
              to="/adminhome"
              activeClassName="active"
              className="nav-links"
              id='home'
            >
              Back to Home
            </NavLink>
          </ul>

        </div>
      </nav><br />
      <h3>REJECTED BOOKINGS</h3>
      <div className="table-container">
        {
          book.length === 0? (
            <h4>
              No rejected Bookings !!</h4>
          ) : (
            <table className="table border shadow table table table-striped ">
              <thead className="table-dark">
                <tr>
                  <th scope="col">Booking Id</th>
                  <th scope="col">Booking Date</th>
                  <th scope="col">User Name</th>
                  <th scope="col">Destination Name</th>
                </tr>
              </thead>
              <tbody>
                {book.map((books, index) => (
                  <tr key={index}>
                    <th scope="row">{books.bookingId}</th>
                    <td>{books.bookingDate}</td>
                    <td>{books.user.userName}</td>
                    <td>{books.packagedetails.destinationPlace}</td>
                  </tr>
                ))}
              </tbody>
            </table>
          )
        }
      </div>
    </div>
  );
}