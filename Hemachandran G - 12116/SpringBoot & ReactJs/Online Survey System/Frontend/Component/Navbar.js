import React from 'react'
import { Link } from 'react-router-dom'


function Navbar() {
    return (
        <div id='nav' className='w-75  '>

            <nav class="navbar  ">
                <div className="container-fluid  ">
                    <h4 id='h2'>Online Survey System</h4>
                    <Link type="submit" to={`/AddUser`} className='btn btn-outline-success '>AddUser</Link>
                </div>
            </nav>

        </div>
    )
}

export default Navbar
