import React, { Component } from 'react'
import {
    BrowserRouter as Router,
    Routes,
    Route,
    Link,
  } from "react-router-dom";

  import Home from "./Home";
  import About from './About';
  import Contact from './Contact';


export class Rout extends Component {
  render() {
    return (
        <Router>
          <div>
            <ul>
              <li>
                <Link to="/">Home</Link>
              </li>
              <li>
                <Link to="/about">About</Link>
              </li>
              <li>
                <Link to="/contact">Contact</Link>
              </li>
            </ul>
            <Routes>
              <Route path="/" element={<Home />} />
              <Route path="/about" element={<About />} />
              <Route path="/contact" element={<Contact />} />
            </Routes>
          </div>
        </Router>
      
        
      
    )
  }
}

export default Rout
