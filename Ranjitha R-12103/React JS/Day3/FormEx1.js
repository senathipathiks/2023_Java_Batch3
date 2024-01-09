import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import {Button, TextField} from '@mui/material';
import "./Form.css";

export default function FormEx1() {
  return (
    <center>
        <div className="container">
            <div className="form-group">
    <div className="mbsc-grid mbsc-grid-fixed">
        <div className="mbsc-row">
            <h4>Registration Form</h4><br/>
        <div className=" mbsc-col-md-6 mbsc-col-12">
            <TextField id="outlined" label="Email" placeholder="Email" inputStyle="box" labelStyle="floating" ></TextField>
        </div><br/>
        <div className="mbsc-col-md-6 mbsc-col-12">
            <TextField id="text" label="Password" placeholder="Password" inputStyle="box" labelStyle="floating"></TextField>
        </div>
        </div><br/>
        <div className=" mbsc-row">
            <div className="mbsc-col-md-6 mbsc-col-12">
            <TextField id="text" label="Address" placeholder="Address" inputStyle="box" labelStyle="floating"></TextField>
            </div><br/>
            <div className="mbsc-row">
                <div className="mbsc-col-md-6 mbsc-col-12">
                <TextField id="text" label="City" placeholder="City" inputStyle="box" labelStyle="floating"></TextField>
                </div>
                <br/>
                <div className="mbsc-col-md-4" mbsc-col-12>
                <select  label="State" inputStyle="box" labelStyle="floating">
                    <option value="Tamil Nadu">Tamil Nadu</option>
                    <option value="Kerala">Kerala</option>
                    <option value="Karnadaka">Karnadaka</option>
                    <option value="Jargent">Jargent</option>
                </select>
                </div><br/>
                <div className="mbsc-col-md-2 mbsc-col-6">
                <TextField id="text" label="Zip" placeholder="Zip" inputStyle="box" labelStyle="floating" />
                </div>
            </div>
            <br/>
            <Button variant="contained">Sign in</Button>
        </div>
    </div>
    </div>
    </div>
    </center>

  )
}
