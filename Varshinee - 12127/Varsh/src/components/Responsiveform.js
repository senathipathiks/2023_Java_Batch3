import React, { Component } from 'react'
import {TextField, button} from '@mui/material'
import "./Mystyle.css";

export class Responsiveform extends Component {
  render() {
    return (
        <center> 
            <div class="Responsiveform"> 
         <div className='container'>
        <div className='form-group'>
            <div className='row justify-content-center'>
                <div className="col-12 col-md-10 col-xl-8">
                    <div className='row justify-content-center'>
                        <div className='col-lg-6 col-md-6 col-sm-6'>
    
  <TextField variant='outlined' label="Email" placeholder="Enter your email address" required /> <br/> <br/>
  <TextField variant="outlined" label="Password" placeholder='Enter your Password' required></TextField> <br/><br/>
  <TextField variant='outlined' label="Address" placeholder="Enter your current address" required /> <br/> <br/>
  <TextField variant='outlined' label="City" placeholder="City" required /> <br/> <br/>
  <TextField variant='outlined' label="State" placeholder="Enter your state" required /> <br/> <br/>
  
   <button>SUBMIT</button>
    </div>
    </div>
    </div>
    </div>
    </div>
    </div>
    </div>
    </center>
        
    )
  }
}

export default Responsiveform