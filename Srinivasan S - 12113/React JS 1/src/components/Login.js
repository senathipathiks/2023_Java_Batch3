import React, { Component } from 'react'

export class Login extends Component {
    constructor(props) {
      super(props)
    
      this.state = {
         date:new Date()
      }
    }
    
  render() {
    return (
        <div>
        <center>
      <h1 style={{color:"red"}}>Login</h1>
        
      <form>
        <table  id="t1">
          <tr>
            <td align="center" style={{padding:"5px"}}>
              <b>Username:</b> <input id="tb1" type="text" placeholder="Enter username" required  style={{padding:"10px"}}/>
            </td>            
          </tr>
          <tr>
            <td align="center" style={{padding:"5px"}}>
              <b>Password:</b> <input id="tb2"   type="password" placeholder="Enter passwd" required style={{padding:"10px"}}/>
            </td>
          </tr>
          <tr align="center"style={{padding:"10px"}}>
            <td  id="b1"><button type="Login" onclick="Validation()" ><b>Login</b></button><br /></td>
          </tr>
          <tr>
            <td align="center" style={{padding:"10px"}}>
              <a  id="fpwd" href="forgot password">forgot password?</a>
            </td>
          </tr>
          <tr>
            <td align="center"><a class="newuser"  href="Registration.html">Don't have an account? Reg here!</a>
            </td>
          </tr>
          <p >{this.state.date.toLocaleDateString()}</p>
          <p >{this.state.date.toLocaleTimeString(  )}</p>
        </table>
        
      </form>
      <br />
    </center>
      </div>
    )
  }
}

export default Login
