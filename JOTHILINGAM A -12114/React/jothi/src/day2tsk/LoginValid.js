import React, { useState } from 'react'
import "../components/login.css"

function LoginValid() {
    const[uname,setuname ] =useState("")
    const[pwd,setpwd]=useState("")

   function valid()
    {
        if (uname==="" || pwd===""){
           alert('Username should not be empty or contain numbers only')
            return false;
        }
        else if (pwd.length<6 || pwd.length>16){
            alert('Password length must be between 6 and 16 characters')
            return false
        
        }
        else{
            return true;
        }

    }

    let submition=()=>{
        if(!valid()){
            alert('Login failed!');
        }
        else{
            alert(" login sucessfully")
        }
    }
  return (
    <html>
    <body>
      <div className="container">
  <div class = "MyDivCLass">
      <center>
          <h1 class="lg">Login Page</h1>
          <form action="/login" method="post">
              <label for="username">Username: </label>
              <input  type="text" id="username" name="username" onChange={(event)=>{
                setuname(event.target.value)
              }}/><br/><br
                      />
                      <label for="password">Password: </label>
                       <input type="password" id="password" name="password" onChange={(event)=>{
                        setpwd(
                            event.target.value
                            )
                       }} /> <br/>
                      
                          <input class="btn " type="submit" value="Submit" onClick={(e)=>{e.preventDefault();
                        submition()}}/> <br/> <br/>
                         <a href='homepage-'>new user?Create new Account</a> <br/>
                                        
                          </form>
                         

      </center>
    </div>
  </div>
  </body>
  </html>
  )
}

export default LoginValid
