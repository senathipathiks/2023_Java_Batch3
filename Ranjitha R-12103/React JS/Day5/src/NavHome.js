import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import {Button, Input, TextField} from '@mui/material';
import "./Form.css";


const NavHome = () =>{
  return (
    <div>
      <h3>Home</h3>
      <div class="MyDivClass">
    <center>
    <h1>Login to our site</h1>
    <h4>Please fill in the form below</h4>   
    <table>
            <tr>
        <td>Name</td>
        <td><TextField id="outlined"  label="Name"  type="Text" placeholder="Enter your Name" /></td> 
        </tr>
        <tr>
        <td>E-Mail Id</td>
        <td> <TextField label="E-Mail" type="Text" placeholder="Enter E-Mail Id" id="outlined"/></td>
        </tr>
        <tr>
       <td>Enter Password</td> 
       <td><TextField label="Password" type="password" placeholder="Enter Password" id="outlined"/></td> 
        </tr>
        <tr>
            <td><Input type="checkbox"/>Remember me</td>
            <td> <a href="#">Forget Password?</a></td>
        </tr>
        <tr align="center">
       <td><Button id="outlined" type ="Submit" >Submit</Button>
        </td> </tr>
       <tr>
           
           <td>Don't have an account?<a href="Registrationpage.html"> Sign Up here!!!</a>
        </td>
    </tr>
</table>
</center>
</div>
    </div>
  );
}
export default NavHome;