import React from 'react'

// create a login page using react functional components
function MyLogin() {
  return (
    <div className='MyDivClass'>
        <h1>Login Page</h1>
        <form action="/login" method="post"></form>
        <label for="username">Username: </label><br />
        <input type="text" id="username" name="username" placeholder="Enter Username
        Here..." required/><br />
        <label for="password">Password: </label><br />
        <input type="password" id="password" name="password" placeholder="Enter Password
        Here..."/><br />
        <input type="submit" value="Submit"/>
        
        
      
    </div>
  )
}

export default MyLogin
