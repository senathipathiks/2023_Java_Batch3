import { Button, TextField } from '@mui/material';
import 'bootstrap/dist/css/bootstrap.min.css';
import React, { useState } from 'react';
import './formStyle.css';

function NewForm() {
    const [inputFields , setInputFields] = useState({
        email: "",
        password: "",
        address: "",
        city: "",
        state: "",
        zipCode: ""
    });

    const [flag , setFlag] = useState(false);
    const [error, setError] = useState("");

    const validate = (val) =>{
        var emailRegExp = /^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;
        var passRegExp = /^[a-zA-z0-9@$!#]{8,20}$/;
        
        let err = {};

        switch(val){
            case "email": if(!emailRegExp.test(inputFields.email)){err.email = "Email can be consist of Alpha-Numeric values and Only {. , _ } is allowed in Special Character ";}break;
            case "password": if(!passRegExp.test(inputFields.password)){err.password = "Password must be at least 8 characters long and Maximum of 20 Character.";}break;
            case "address" : if(inputFields.address.length === 0){err.address = "Address should not be Empty";}break;
            case "city": if(inputFields.city.length === 0){err.city = "City should not be Empty";}break;
            case "state": if(inputFields.state.length === 0){err.state = "State should not be Empty";}break;
            case "zipCode": if(inputFields.zipCode.length === 0){err.zipCode = "Zip code should not be Empty";}break;
            default : ;
        }

        if(err) {
            setError(err[val]);
        } else {
            setError('');
        }
    }

    const handleChange = (e) =>{
        setInputFields({...inputFields, [e.target.name]: e.target.value});
    }

    const typeFunction = () =>{
        if(Object.keys(inputFields).length === 6) {
            setFlag(true);
        } else {
            setError('Please fill out all the fields.');
        }
    }
    const handleSubmit = (e) => {
        e.preventDefault();
        typeFunction();
    }

    const display = {
        email : inputFields.email,
        password : inputFields.password,
        address : inputFields.address,
        city : inputFields.city,
        state : inputFields.state,
        zipCode : inputFields.zipCode
    };
    return (
        <div>
            {flag ? alert("Submitted Successfully\n"+JSON.stringify(display)): null}
            <form onSubmit={handleSubmit}>
                <div className='container'>
                    <div className='row'><h1>Registration page</h1></div>
                        <div className='form-group'>
                            <div className='row'>
                                <div className='col-lg-6 col-md-6 col-sm-6 col-xs-6' >
                                    <TextField variant="outlined" className="form-control" label="Email" placeholder='Email' type="email" name='email' onChange={handleChange} value={inputFields.email} onBlurCapture={(e)=>{validate(e.target.name)}}/>
                                </div>
                                <div className='col-lg-6 col-md-6 col-sm-6 col-xs-6' >
                                    <TextField variant='outlined' className='form-control' label='Password' type="password" placeholder="Password" name='password' onChange={handleChange} value={inputFields.password} onBlur={(e)=>{validate(e.target.name)}}/>
                                </div>
                            </div>
                            <div className='row '>
                                <div className='col-12 col-md-12 col-xl-12 col-xs-12 w-100'>
                                    <TextField variant='outlined'label='Address' type="text" className='form-control' placeholder='Address' name='address' onChange={handleChange} value={inputFields.address} onBlur={(e)=>{validate(e.target.name)}}/>
                                </div>
                            </div>
                            <div className='row '>
                                <div className='col-lg-4 col-md-4 col-sm-4 col-xs-4'>
                                    <TextField variant='outlined' label='City' type="text" className='form-control'placeholder='City'name='city' onChange={handleChange} value={inputFields.city} onBlur={(e)=>{validate(e.target.name)}}/>
                                </div>
                                <div className='col-lg-4 col-md-4 col-sm-4 col-xs-4'>
                                    <TextField variant='outlined' label='State' type="text" className='form-control' placeholder='State' name='state' onChange={handleChange} value={inputFields.state}onBlur={(e)=>{validate(e.target.name)}} />
                                </div>
                                <div className='col-lg-4 col-md-4 col-sm-4 col-xs-4'>
                                    <TextField variant='outlined'label="Zip Code" type="text" className='form-control' placeholder='Zip Code' name='zipCode' onChange={handleChange} value={inputFields.zipCode} onBlur={(e)=>{validate(e.target.name)}}/>
                                </div>
                            </div>
                            <div className='row '>
                                <div className='col-lg-3 col-md-3 col-sm-3 col-xs-3'><Button variant='contained' type='submit' className='btn btn-primary'>Register</Button></div>
                            </div>
                        </div>
                    </div>
            </form>
            {error && <p className="error"><i>{error}</i></p>}
        </div>
    );
}

export default NewForm;