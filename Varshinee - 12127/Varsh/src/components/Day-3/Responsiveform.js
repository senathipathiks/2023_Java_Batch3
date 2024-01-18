import React, { Component } from 'react'
import {TextField} from '@mui/material'
import "./Mystyle.css";

export class Responsiveform extends Component {
  render() {
    return (
        <center>
        <div className="Responsiveform" align="center">
       <div>
    
  <TextField variant='outlined' label="Email" placeholder="Enter your email address" required /> <br/> <br/>
  <TextField variant="outlined" label="Password" placeholder='Enter your Password' required></TextField> <br/><br/>
  <TextField variant='outlined' label="Address" placeholder="Enter your current address" required /> <br/> <br/>
  <TextField variant='outlined' label="City" placeholder="City" required /> <br/> <br/>
  <TextField variant='outlined' label="State" placeholder="City" required /> <br/> <br/>
  
   <button>SUBMIT</button>
    </div>
    </div>
    </center>
        
    )
  }
}

export default Responsiveform