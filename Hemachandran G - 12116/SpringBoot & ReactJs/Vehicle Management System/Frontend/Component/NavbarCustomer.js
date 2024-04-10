import React from 'react'
import { Link } from 'react-router-dom'


function NavbarCustomer() {
  return (
    <div id='nav'>
      <div  width='100%;'>
  <nav class="navbar">
    <div class="container-fluid">
      <h2 id='h2'>Customer Management Service</h2>
      <Link type="submit" to={`/AddUserCustomer`} className='btn btn-outline-success '>AddUser</Link>
    </div>
  </nav>
</div>
    </div>
  )
}

export default NavbarCustomer
