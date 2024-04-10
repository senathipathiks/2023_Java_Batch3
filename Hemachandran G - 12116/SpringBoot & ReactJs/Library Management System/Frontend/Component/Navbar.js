import React from 'react'
import { Link } from 'react-router-dom'


function Navbar() {
  return (
    <div id='nav'>
      <div class="container"  width='100%;'>
  <nav class="navbar">
    <div class="container-fluid">
      <h2 id='h2'>Employee Management Service</h2>
      <Link type="submit" to={`/AddUser`} className='btn btn-outline-success '>AddUser</Link>
    </div>
  </nav>
</div>
    </div>
  )
}

export default Navbar
