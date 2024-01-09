import React, {Component} from 'react'
import './Style.css'
import { BrowserRouter as Router,
    Routes,
    Route,
    Link

} from "react-router-dom"
import "./About"
import "./Contact"
import "./Home"
import Home from './Home'
import Contact from './Contact'
import About from './About'

function Navigation() {
  return (
    <div>
        <Router>
            <div id='nav'>
            <nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container-fluid">
    <a class="navbar-brand" href="#"><Link to="/">HOME</Link></a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#"><Link to="/Contact">CONTACT</Link></a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#"><Link to="/About">ABOUT</Link></a>
        </li>
        
        
        
      </ul>
      <form class="d-flex" role="search">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search" />
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
    </div>
  </div>
</nav>
            
            
            </div>
            <Routes>
                <Route path='/' element={<Home />}></Route>
                <Route path='/Contact' element={<Contact />}></Route>
                <Route path='/About' element={<About />}></Route>
            </Routes>
        </Router>

      
    </div>
  )
}

export default Navigation
