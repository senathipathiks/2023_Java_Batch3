import React, { useEffect, useState } from 'react'
import BookingService from '../Services/BookingService';
import { Link, useParams } from 'react-router-dom';
import { NavLink } from "react-router-dom";
import { IoMdJet } from "react-icons/io";
import axios from 'axios';
import Swal from 'sweetalert2';

export default function PendingBooking() {

  const [book, setBook] = useState([])


  const { bookingId } = useParams()

  useEffect(() => {
    loadAllBookings();
  }, []);


  const loadAllBookings = async () => {
    const result = await BookingService.getPendingBookings();
    setBook(result.data);
    console.log(result.data)

  };

  const approveBooking = async (bookingId) => {
    await axios.put(`http://localhost:8080/updatebooking/${bookingId}`)
    Swal.fire({
      title: 'Booking Approved',
      text: 'An approved email has been sent to the concerned person',
      icon: 'success',
      confirmButtonText: 'OK'
    });

    loadAllBookings()
  }

  const rejectBooking = async (bookingId) => {

    await axios.put(`http://localhost:8080/rejectBooking/${bookingId}`)
    Swal.fire({
      title: 'Booking Rejected',
      text: 'Rejection email has been sent to the concerned person',
      icon: 'warning',
      confirmButtonText: 'OK'
    });

    loadAllBookings()

  }




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
              id='backk'
              activeClassName="active"
              className="nav-links"
            // onClick={handleClick}
            >
              Back to Home
            </NavLink>
          </ul>

        </div>
      </nav>

      <div className="table-container">
        <table className="table border shadow table table table-striped " >
          <thead className="table-dark" >
            <tr>
              <th scope="col">Booking Id</th>
              <th scope="col">Booking Date</th>
              <th scope="col">User Name</th>
              <th scope="col">Destination Name</th>

              <th scope="col">Actions</th>
            </tr>
          </thead>
          <tbody>
            {book.map((books, index) => (

              <tr>
                <th scope="row" key={index}>{books.bookingId}</th>
                <td>{books.bookingDate}</td>
                <td>{books.user.userName}</td>
                <td>{books.packagedetails.destinationPlace}</td>
                <td><Link className="btn btn-success btn-outline-dark mx" id='bookpt' onClick={() => approveBooking(books.bookingId)}><b>APPROVE</b></Link>
                  <Link className="btn btn-danger btn-outline-dark mx-2" id='bookpt' onClick={() => rejectBooking(books.bookingId)}><b>REJECT</b></Link></td>
              </tr>
            ))}

          </tbody>
        </table>
      </div>

    </div>
  );
}

