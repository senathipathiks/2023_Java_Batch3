import React, { Component } from 'react'
import "./Login.css"
export class Login extends Component {
  render() {
    return (
      <div>
        <h2>Login page</h2>
        
        <form  >
  

  <div class="container">
    <label for="uname "><b> Username :</b></label>
    <input type="text" placeholder="Enter Username" name="uname" required />
    <br/><br/>

    <label for="psw"><b>Password :</b></label>
    <input type="password" placeholder="Enter Password" name="psw" required />
    <br/><br/>
    <button type="submit">Login</button>
    <br/><br/>

    <label>
      <input type="checkbox" checked="checked" name="remember" /> Remember me 
    </label>
  </div>

 
  
</form>

      </div>
    )
  }
}

export default Login
