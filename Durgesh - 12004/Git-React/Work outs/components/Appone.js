import React, { Component } from 'react'
import "./Appone.css"

export class Appone extends Component {
  render() {
    return (
      <div className='container'>
      <div className='form-group'>
          <div className='row justify-content-center'>
              <div className="col-12 col-md-10 col-xl-8">
                <center><h3>Registration Form</h3></center>
                  <div className='row justify-content-center'>
                      <div className='col-lg-6 col-md-6 col-sm-6'>
                            <input variant="outlined" className="form-control" label="Email" placeholder='Email' type="email" />
                      </div>
                      <div className='col-lg-6 col-md-6 col-sm-6'>
                            <input variant='outlined' className='form-control' label='Password' type="password" placeholder="Password" labelstyle="floating" />
                      </div>
                  </div>
                  <div className='row justify-content-center'>
                        <div className='col-12 col-md-10 col-xl-8 w-100'>
                            <input variant='outlined'label='Address' type="text" className='form-control' placeholder='Address'  labelstyle="floating" />
                        </div>
                  </div>
                  <div className='row justify-content-center'>
                        <div className='col-lg-4 col-md-4 col-sm-4'>
                            <input variant='outlined' label='city' type="text" className='form-control'placeholder='City'  labelstyle="floating" />
                        </div>
                        <div className='col-lg-4 col-md-4 col-sm-4'>
                            <input variant='outlined' label='state' type="text" className='form-control' placeholder='State'  labelstyle="floating" />
                        </div>
                        <div className='col-lg-4 col-md-4 col-sm-4'>
                            <input variant='outlined'label="zip" type="text" className='form-control' placeholder='Zip'  labelstyle="floating" />
                        </div>
                        <div className='row justify-content-center'>
                        <div className='col-lg-3 col-md-3 col-sm-3'><button variant='contained' type='submit' className='btn btn-primary'>Register</button></div>
                        </div>
                    </div>
              </div>
            </div>
          </div>
        </div>
    )
  }
}

export default Appone
