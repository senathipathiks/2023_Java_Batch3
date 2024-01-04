import React from 'react'
import "./Mystyle.css";

export default function Mylogin() {
  return (
   <div ><center>
      <div class="form">
        <h2>Login</h2>
        <label for="uname">Username:</label><br />
        <input type="text" id="uname" name="uname" required/></div> <br />
        <label for="pwd">Password:</label><br/>
        <input type="password" id="pwd" name="pwd" required/>
        <button id="btn">Submit</button></center>
        </div> 
  )

}


