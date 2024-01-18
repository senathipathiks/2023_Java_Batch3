import React from 'react'
import "./Register.css";

function Registationform() {
  return (
    <form id="">

<label for="firstName">First Name:</label><br></br>
        <input type="text" id="firstName" name="firstName" required/><br></br>
        <label for="lastName">Last Name:</label><br></br>
        <input type="text" id="lastName" name="lastName" required/><br></br>
        <label for="email">Email:</label><br></br>
        <input type="email" id="email" name="email" required></input><br></br>
        <label for="password">Password:</label><br></br>
        <input type="password" id="password" name="password" required /><br></br>
        <label for="confirmPassword">Confirm Password:</label><br></br>
        <input type="password" id="confirmPassword" name="confirmPassword" required/><br></br>
        <input type="submit" value="Submit"/>
    </form>
  )
}
export default Registationform
