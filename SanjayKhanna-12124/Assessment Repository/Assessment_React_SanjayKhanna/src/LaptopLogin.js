import "bootstrap/dist/css/bootstrap.css"
import React from 'react'
import { Link } from "react-router-dom"

function LaptopLogin() {

    const handlecheckEmail = (value) =>{
        let emailRegex = /^[a-zA-Z0-9._]+@[a-z]{2,4}\.[a-z]{2,5}$/
        if(!emailRegex.test(value))
        alert('Enter valid email...!')
    }
    const handlecheckPassword = (value) =>{
        let passwordRegex = /^[a-zA-Z0-9@#.$]{8,14}$/
        if(!passwordRegex.test(value) )
        alert('Enter valid password...!')
    }
  return (
    <div className='container-fluid'>
      <div className='row d-flex align-items-center justify-content-center vh-100'>
        <div className=' col-sm-8 col-md-7 col-lg-6 col-xl-5'>
          <div className='border bg-white shadow p-5 rounded'>
            <h1>Login</h1>
            <form>
              <div className='mb-2'>
                <label htmlFor='email'>Email</label>
                <input type="email" name='email' className='form-control' placeholder='Enter your email' onBlur={(e)=>handlecheckEmail(e.target.value)} required/>
              </div>
              <div className='mb-2'>
                <label htmlFor='password'>Password</label>
                <input type="password" name='password' className='form-control' placeholder='Enter your password' required onBlur={(e)=>{handlecheckPassword(e.target.value)}} />
              </div>
              <Link to="/laptop/listing" className='btn btn-primary w-100'>Login</Link>
            </form>
          </div>
        </div>
      </div>
    </div>
  )
}

export default LaptopLogin