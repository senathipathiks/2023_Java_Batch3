import * as React from 'react';

import Paper from '@mui/material/Paper';
import PendingActionsIcon from '@mui/icons-material/PendingActions';
import CheckBoxIcon from '@mui/icons-material/CheckBox';
import ThumbDownAltTwoToneIcon from '@mui/icons-material/ThumbDownAltTwoTone';
import styled from '@emotion/styled';
import { Link, NavLink } from "react-router-dom";
import { IoMdJet } from "react-icons/io";
import { useState } from 'react';
import axios from 'axios';
import { useEffect } from 'react';
import AccountCircleIcon from '@mui/icons-material/AccountCircle';
import LibraryAddIcon from '@mui/icons-material/LibraryAdd';
import ArrowLeftIcon from '@mui/icons-material/ArrowLeft';
import EditIcon from '@mui/icons-material/Edit';

const Item = styled(Paper)(({ theme }) => ({
  // backgroundColor: theme.palette.mode === 'dark' ? '#1A2027' : '#fff',
  // ...theme.typography.body2,
  // padding: theme.spacing(2),
  // textAlign: 'center',
  // color: theme.palette.text.secondary,
}));


export default function AdminHome() {
  const [click, setClick] = React.useState(false);

  const handleClick = () => setClick(!click);

  const [pending, setPending] = useState(0)
  const [approve, setApprove] = useState(0)
  const [reject, setReject] = useState(0)
  const [payment, setPayment] = useState(0)


  const win = sessionStorage.getItem("adminName");

  useEffect(() => {
    loadPending()
    loadApproved()
    loadPayment()
    loadRejected()

  }, []);


  const loadPending = () => {
    axios
      .get("http://localhost:8080/getpendingCount")
      .then((res) => {
        setPending(res.data);
        console.log(res.data)
      })
      .catch((err) => console.log(err))
  }

  const loadApproved = () => {
    axios
      .get("http://localhost:8080/getapproveCount")
      .then((res) => {
        setApprove(res.data);
        console.log(res.data)
      })
      .catch((err) => console.log(err))
  }

  const loadRejected = () => {
    axios
      .get("http://localhost:8080/getrejectedCount")
      .then((res) => {
        setReject(res.data);
        console.log(res.data)
      })
      .catch((err) => console.log(err))
  }
  const loadPayment = () => {
    axios
      .get("http://localhost:8080/getpaymentCount")
      .then((res) => {
        setPayment(res.data);
        console.log(res.data)
      })
      .catch((err) => console.log(err))
  }

  return (
    <>

      <nav className="navbar">
        <div className="nav-container">
          <NavLink exact to="/" className="nav-logo">
            <span><IoMdJet /> Tourism Management System
            </span>
            <span className="icon">
            </span>
          </NavLink>

          <ul
            className={click ? "nav-menu active" : "nav-menu"}
          >

            <li className="nav-item">
              <NavLink
                exact
                to="/addpackage"
                activeClassName="active"
                className="nav-links"
                onClick={handleClick}
              >
                <LibraryAddIcon />   Add Tour Packages
              </NavLink>
            </li>
            <li className="nav-item">
              <NavLink
                exact
                to="/adminViewTour"
                activeClassName="active"
                className="nav-links"
                onClick={handleClick}
              >
                <EditIcon />   Edit Tour Packages
              </NavLink>
            </li>

            <li className="nav-item">
              <NavLink
                exact
                to="/"
                id='landing'
                activeClassName="active"
                className="nav-links"
                onClick={handleClick}
              >
                <ArrowLeftIcon />Sign out
              </NavLink>
            </li>

            <li className="nav-item">
              <NavLink
                exact
                activeClassName="active"
                className="nav-links"
                onClick={handleClick}
              >
                {win} <AccountCircleIcon />
              </NavLink>
            </li>


          </ul>

        </div>
      </nav>


      <div className='Containers' >
        <div className='row' id='row'>
          <div className='col-6 col-sm-3'>


            <div className='card' id='card-color' >
              <div className='card-inner' >
                <Link className='link' to={`/pendingbook`} id='pending'><h3> PENDING  BOOKINGS</h3></Link>

                <PendingActionsIcon className='card_icon' />

              </div>
              <h1>{pending}</h1>
            </div>
          </div>


          <div className='col-6 col-sm-3'>

            <div className='card' id='card-color'>

              <div className='card-inner'>
                <Link className='link' to={`/approvedRequest`} id='approved'><h3> APPROVED BOOKINGS</h3></Link>

                <CheckBoxIcon className='card_icon' />
              </div>
              <h1>{approve}</h1>
            </div>
          </div>

          <div className='col-6 col-sm-3'>

            <div className='card' id='card-color'>

              <div className='card-inner'>
                <Link className='link' to={`/paymentRequest`} id='approved'><h3> PAYMENT STATUS</h3></Link>

                <CheckBoxIcon className='card_icon' />
              </div>
              <h1>{payment}</h1>
            </div>
          </div>


          <div className='col-6 col-sm-3'>

            <div className='card' id='card-color'>

              <div className='card-inner'>
                <Link className='link' to={`/rejectedRequest`} id='rejected'><h3> REJECTED BOOKINGS</h3></Link>

                <ThumbDownAltTwoToneIcon className='card_icon' />
              </div>
              <h1>{reject}</h1>
            </div>

          </div>
        </div>
      </div>
      <br />
      <img src="https://static.vecteezy.com/system/resources/previews/001/270/324/large_2x/international-tourist-attractions-black-silhouette-vector.jpg" width={'1300px'} height={'350px'}></img>


    </>




  );
}
