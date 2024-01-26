import React from 'react'
import './style.css'
import 'bootstrap/dist/css/bootstrap.min.css';
function ValidateForm() {
  return (
    <div id="form">
        <div class="form-floating mb-2">
  <input type="username" class="form-control" id="floatingInput" placeholder="username" />
  <label for="floatingInput">User Name</label>
</div>
        <div class="form-floating ">
  <input type="email" class="form-control" id="floatingInput" placeholder="name@example.com" />
  <label for="floatingInput">Email address</label>
</div>
<div class="form-floating">
  <input type="password" class="form-control" id="floatingPassword" placeholder="Password" />
  <label for="floatingPassword">Password</label>
</div>
<button class="btn btn-primary">Submit</button>
        </div>
    
  )
}

export default ValidateForm