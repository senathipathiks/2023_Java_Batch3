import React, { useState } from "react";

import './style.css';

function FormValidation() {
    const [name,setName] = useState("");
    const [email, setEmail] = useState("");
    const [ password , setPassword] = useState("");
    const [confirm , setConfirm] = useState("");

    function validate(){
        var emailRegExp = /^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;
        var passRegExp = /^[a-zA-z0-9@$!#]{8,20}$/;
        if( name.length === 0)
        alert('Please enter your Name');
        else if (!emailRegExp.test(email))
        alert('Please provide a valid Email Address')
        else if (!passRegExp.test(password))
        alert('Please provide a Valid Password');
        else
        alert('Login Successful')
    }
    function passwordMatch(){
        if (password !== confirm )
        alert('Confirm password should match the above password');
    }

    function passwordLenght(){
        if(password.length<8){
            alert('Your password must be at least 8 characters long');
        }
    }

    return (
        <div className="div">
            <form>
                <table>
                    <tr>
                        <td><label htmlFor="name">Name:</label></td>
                        <td><input type="text" id="name" name="name" onChange={(e)=>{setName(e.target.value)}}/></td>
                    </tr>
                    <tr>
                        <td><label htmlFor="dob">D.O.B:</label></td>
                        <td><input type="date" id="dob"/></td>
                    </tr>
                    <tr>
                        <td><label htmlFor="gender">Gender</label></td>
                        <td><input type="radio" id="gender" value="male" />Male<input type="radio" id="gender" value="female"/>Female</td>
                    </tr>
                    <tr>
                        <td><label htmlFor="email">Email:</label></td>
                        <td><input type="text" name="email" id="email" onChange={(e)=>{setEmail(e.target.value)}} /></td>
                    </tr>
                    <tr>
                        <td><label htmlFor="password">Password</label></td>
                        <td><input type="password" name="password" id="password" onChange={(e) => { setPassword(e.target.value) }} onBlur={passwordLenght} /></td>
                    </tr>
                    <tr>
                        <td><label htmlFor="confirmPassword">confirm Password</label></td>
                        <td><input type="password" name="confirmPassword" id="confirmPassword" onChange={(e) => { setConfirm(e.target.value) }} onBlur={passwordMatch} /></td>
                    </tr>
                    <tr>
                        <td colSpan='2'>
                            <button onClick={()=>{validate()}}>Click to Submit</button>
                        </td>
                    </tr>

                </table>
            </form>
        
        </div>
    );
}

export default FormValidation

