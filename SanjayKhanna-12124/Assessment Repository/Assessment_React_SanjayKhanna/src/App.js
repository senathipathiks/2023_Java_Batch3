import { useState } from 'react'
import { BrowserRouter, Link, Route, Routes } from 'react-router-dom'
import './App.css'
import Home from './Home'
import LaptopCreate from './LaptopCreate'
import LaptopDetail from './LaptopDetail'
import LaptopEdit from './LaptopEdit'
import LaptopListing from './LaptopListing'
import LaptopLogin from './LaptopLogin'
import LaptopRegister from './LaptopRegister'


function App()
{
  const [navbarOpen, setNavbarOpen] = useState(false)

  return (
    <BrowserRouter>
      <div className="page-container">
        <nav className="navbar navbar-expand-lg bg-body-tertiary ">
          <div className="container"
          >
            <button
              className="navbar-toggler ms-auto"
              type="button"
              data-bs-toggle="collapse"
              data-bs-target="#navbarNav"
              aria-controls="navbarNav"
              aria-expanded="false"
              aria-label="Toggle navigation"
              onClick={() => setNavbarOpen(!navbarOpen)}
            >
              <span className="navbar-toggler-icon"></span>
            </button>
            <div
              className={`collapse navbar-collapse ${navbarOpen ? 'show' : ''}`}
              id="navbarNav"
            >
              <ul className="navbar-nav ms-auto mb-2 mb-lg-0"
              >
                <li className="nav-item"
                >
                  <Link className="nav-link" to="/">Home</Link>
                </li>
                <li className="nav-item"
                >
                  <Link className="nav-link" to="/laptop/login">Login</Link>
                </li>
                <li className="nav-item"
                >
                  <Link className="nav-link" to="/laptop/Register">Register</Link> 
                </li>
              </ul>
            </div>
          </div>
        </nav>
        <div className="container-fluid"
        >
          <Routes>
            <Route path="/" element={<Home />}></Route>
            <Route path="/laptop/login" element={<LaptopLogin />}></Route>
            <Route path="/laptop/listing" element={<LaptopListing/>}></Route>

            <Route path="/laptop/create" element={<LaptopCreate />}></Route>
            <Route path="/laptop/detail/:lapId" element={<LaptopDetail />}></Route>
            <Route path="/laptop/edit/:lapId" element={<LaptopEdit />}></Route>
            <Route path="/laptop/Register" element={<LaptopRegister />}></Route> 
          </Routes>
        </div>
      </div>
    </BrowserRouter>
  )
}

export default App