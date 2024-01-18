import React, { Component } from 'react'
import "./Registration.css";

export class Registration extends Component {
  render() {
    return (
      <div>
         <center>
            <h1 id="h1" className="text-center mt-5">Registration</h1>
            <form id="t1">
        <table  >
          <tr>
            <td align="center">
              <b>Username:</b> <input id="tb1" type="text" placeholder="Enter username" />
            </td>            
          </tr>
          <tr>
            <td align="center">
              <b>Password:</b> <input id="tb2"   type="password" placeholder="Enter password" />
            </td>
            </tr>
            <tr>
            <td align="center">
              <b>Re-enter Password:</b> <input id="tb3"   type="password" placeholder="Re-enter password" />
            </td>
          </tr>
          <tr align="center">
            <td  id="b1"><button type="Login" onclick="Validation()" ><b>Login</b></button><br /></td>
          </tr>
          <tr>
            <td align="center">
              <a  id="fpwd" href="forgot password">forgot password?</a>
            </td>
          </tr>
          <tr>
            <td align="center"><a class="newuser"  href="Registration.html">Don't have an account? Reg here!</a>
            </td>
          </tr>
        </table>
      </form>
      <br />
    </center>
      </div>
    )
  }
}

export default Registration
