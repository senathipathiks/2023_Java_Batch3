import React from 'react'
import { Link } from "react-router-dom";

export default function Navbar() {
  return (
    
    <div className="container-fluid" style={{ backgroundColor: 'black',height:150}}>
      <h1 style={{color:'whitesmoke'}}>LIBRARY MANAGEMENT SYSTEM</h1>
        <Link className="btn btn-btn-outline-light me-6  " to="/"><button className='btn btn-warning btn-lg'>User page</button>
       </Link>
      <Link className="btn btn-btn-outline-light me-6 " to="/homelib"><button className='btn btn-info btn-lg'>Library page</button>
       </Link>
      
    </div>
  )
}
