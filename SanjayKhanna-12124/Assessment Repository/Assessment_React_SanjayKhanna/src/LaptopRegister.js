import 'bootstrap/dist/css/bootstrap.css';
import React from 'react';
import { Link } from "react-router-dom";

function LaptopRegister() {
  return (
    <div className='container-fluid'>
    <div className='row d-flex align-items-center justify-content-center vh-100'>
      <div className=' col-sm-8 col-md-7 col-lg-6 col-xl-5'>
        <div className='border bg-white shadow p-5 rounded'>
          <h1>Register</h1>
          <form>
            <div className='mb-2'>
              <label htmlFor='name'>Name</label>
              <input type="text" name='name' className='form-control' placeholder='Enter your Name' />
            </div>
            <div className='mb-2'>
              <label htmlFor='email'>Email</label>
              <input type="email" name='email' className='form-control' placeholder='Enter your email' />
            </div>
            <div className='mb-2'>
              <label htmlFor='password'>Set new Password</label>
              <input type="password" name='newpassword' className='form-control' placeholder='Enter your new password' />
            </div>
            <div className='mb-2'>
              <label htmlFor='confirmpassword'>Confirm Password</label>
              <input type="password" name='confirmpassword' className='form-control' placeholder='Confirm your password' />
            </div>
            <Link to="/" className='btn btn-primary'>Register</Link>
          </form>
        </div>
      </div>
    </div>
    </div>
  )
}

export default LaptopRegister;