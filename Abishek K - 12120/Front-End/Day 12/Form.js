import React from 'react'
import './Style.css'

function Form() {
  return (
    <div id='form'>
   <div id='fcont'>
  <div className="form-floating">
  <input type="text" class="form-control" id="floatingInput" placeholder="Name" />
  <label for="floatingInput">UserName</label>
</div>
<div className="form-floating">
  <input type="email" class="form-control" id="email" placeholder="email" />
  <label for="floatingPassword">Password</label>
</div>
<div className="form-floating">
  <input type="password" class="form-control" id="floatingPassword" placeholder="Password" />
  <label for="floatingPassword">Password</label>
</div>
</div>
    </div>
  )
}

export default Form
