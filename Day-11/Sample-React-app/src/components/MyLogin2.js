import React, { Component } from 'react'

export class myLogin2 extends Component {
  render() {
    return(
      <div>
        
        <div class="input_box">
      
            <label for="Username">Username</label>
            <input type="text" name="username" id="uname" />
            <br />
            <label for="Email">Email Id</label>
            <input type="email" name="email" id="email" />
            <br />
            <label for="password">Password</label>
            <input type="password" name="password" id="pass" />

            <br /><br />
            <button onclick="validate()" id="submit" type="submit">Submit</button>
            <a href="#" onclick="forget()"><center>Forget Password ?</center></a>
            
            </div>
            
    
      </div>
    );
  }
}

export default myLogin2
