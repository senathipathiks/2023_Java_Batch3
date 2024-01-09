import React, { Component } from 'react'
import{
    BrowserRouter as Router,
    Routes,
    Route,Link
}
from "react-router-dom";
import Home from "./Home";
import About from "./About";
import Contact from "./Contact";
class RouterEx extends Component {
  render() {
    return (
        <Router>
            <div className="App">
                <ul className="App-header">
                    <li>
                        <Link to ="/">Home</Link>
                    </li>
                    <li>
                        <Link to="/About">About</Link>
                    </li>
                    <li>
                        <Link to="/Contact">Contact</Link>
                    </li>
                </ul>
            </div>

            <Routes>
                        <Route exact path="/"element={<Home />}></Route>
                        <Route exact path="/About"element={<About />}></Route>
                        <Route exact path="/Contact" element={<Contact />}></Route>
                    </Routes>
        </Router>
        
      
    )
  }
}
export default RouterEx;
