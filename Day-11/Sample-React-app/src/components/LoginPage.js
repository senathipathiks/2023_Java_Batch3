import React, { Component } from 'react'
import "./Login.css"

export class LoginPage extends Component {
  render() {
    return (
      
      <div id="main">
    
      <div class="contain">
        <h1>Login Page</h1>
        
            <div class="input_box">
      
            <label for="Username">Username</label>
            <input type="text" name="username" id="uname"/>
            <br/>
            <label for="Email">Email Id</label>
            <input type="email" name="email" id="email"/>
            <br/>
            <label for="password">Password</label>
            <input type="password" name="password" id="pass"/>

            <br/><br/>
            <button onclick="validate()" id="submit" type="submit">Submit</button>
            <a href="#" onclick="forget()"><center>Forget Password ?</center></a>
            <a href="#" onclick="forget()"><center>New User,Register Now</center></a>
           </div>
            </div>
    </div>

       


    
    )
  }
}

export default LoginPage
