import React, { useEffect, useState } from 'react';
import { NavLink } from "react-router-dom";
import { IoMdJet } from "react-icons/io";
import axios from 'axios';
import AccountCircleIcon from '@mui/icons-material/AccountCircle';
import ArrowLeftIcon from '@mui/icons-material/ArrowLeft';
import { Link, useParams } from 'react-router-dom';
import Swal from 'sweetalert2';
import CurrencyRupeeIcon from '@mui/icons-material/CurrencyRupee';
export default function ViewBookings() {
  const [click, setClick] = React.useState(false);
  const handleClick = () => setClick(!click);

  const [book, setBook] = useState([]);
  const winid = sessionStorage.getItem("userId");
  const win = sessionStorage.getItem("userName");

  const loadAllBookings = async (e) => {
    await axios
      .get(`http://localhost:8080/getBookbyUserd/${winid}`)
      .then((res) => setBook(res.data))
      .catch((err) => console.log(err));
  };

  const cancelBooking = async (bookingId) => {
    Swal.fire({
      title: 'Are you sure?',
      text: "You won't be able to revert this!",
      type: 'warning',
      showCancelButton: true,
      confirmButtonColor: '#3085d6',
      cancelButtonColor: '#d33',
      confirmButtonText: 'Yes, delete it!'
    }).then((result) => {
      if (result.value) {
        axios.delete(`http://localhost:8080/deleteBooking/${bookingId}`)
          .then(() => {
            Swal.fire(
              'Deleted!',
              'Your Booking has been deleted.',
              'success'
            );
            loadAllBookings();
          })
          .catch((err) => console.log(err));
      }
    });
  };

  useEffect(() => {
    loadAllBookings();
  }, []);

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
              to="/viewtour"
              activeClassName="active"
              className="nav-links"
              id='back'
            >
              <ArrowLeftIcon /> BACK
            </NavLink>

            <NavLink
              exact
              activeClassName="active"
              className="nav-links"
              to={"/userprofile"}
              onClick={handleClick}
            >
              {win} <AccountCircleIcon />
            </NavLink>

          </ul>

        </div>
      </nav><br/>
      <h3> BOOKING STATUS</h3>

      <div className="table-container">
        <table className="table border shadow table table table-striped " >
          <thead className="table-dark" >
            <tr>
              {/* <th scope="col">User Id</th> */}

              <th scope="col">Booking Date</th>
              <th scope="col">Tour Package Name</th>
              <th scope="col">Booking Status</th>
              <th scope="col">Action</th>

            </tr>
          </thead>
          <tbody>
            {book.map((books, index) => (

              <tr>
                {/* <th scope="row" key={index}>{books.user.userId}</th> */}
                <td>{books.bookingDate}</td>
                <td><Link to={`/userview/${books.bookingId}`}>{books.packagedetails.packageName}</Link></td>
                <td className={` ${books.bookingStatus ==='pending' ? 'red-text' : ''} ${books.bookingStatus === 'approved' ? 'green-text' : ''} ${books.bookingStatus === 'payment done' ? 'blue-text' : ''}`}>
                  {books.bookingStatus}
                </td>
                <td>
                  {/* <Link className="btn btn-secondary mx-2"  id='bookpt' to={`/editTour/${books.bookingId}`}  ><b>Edit</b></Link> */}
                  {books.bookingStatus === 'approved' ? (
                    <Link className="btn btn-success  " id='bookpt' to={`/payment/${books.bookingId}`} ><CurrencyRupeeIcon /> <b>MAKE PAYMENT </b> </Link>
                  ) : (
                    <Link className="btn btn-light  " id='bookpt' ><CurrencyRupeeIcon /> <b>MAKE PAYMENT</b></Link>
                  )}
                </td>
              </tr>
            ))}


          </tbody>
        </table>
      </div>

    </div>
  );
}