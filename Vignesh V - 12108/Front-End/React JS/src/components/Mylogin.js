 import React from 'react'
 import "./Login.css"
 function Mylogin(props) {
   return (
     <div>
        <h1>this is my first react js{props.name} created using { props.topic}
        {props.children}
        </h1>
       
        <form >
 <div class="container">
    <label for="uname"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="uname" required />

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" required />

    <button type="submit">Login</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"/> Remember me
    </label>
    </div>
    </form>
  </div>
   )
 }
 
 export default Mylogin
 