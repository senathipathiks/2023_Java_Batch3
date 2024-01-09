import React from 'react'
import "./login.css"

function Login(props) {
  return (
    <html>
      <body>
        <div className="container">
    <div class = "MyDivCLass">
        <center>
            <h1 class="lg">Login Page</h1>
            <form action="/login" method="post">
                <label for="username">Username: </label>
                <input  type="text" id="username" name="username"/><br/><br
                        />
                        <label for="password">Password: </label>
                         <input type="password" id="password" name="password"/><br/>
                        
                            <input class="btn " type="submit" value="Submit"/> <br/> <br/>
                            
                            <a href='homepage-'>new user?Create new Account</a> <br/>
                            
                  
                            </form>
                            <p> This is my first React {props.name} and it is elegant {props.topic}</p>

        </center>
      </div>
    </div>
    </body>
    </html>
  );
}
export default Login
