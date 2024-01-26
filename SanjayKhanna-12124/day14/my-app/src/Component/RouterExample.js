import React, { Component } from 'react';
import { Link, Route, BrowserRouter as Router, Routes } from 'react-router-dom';
import About from './MyPages/About';
import Contact from './MyPages/Contact';
import Home from './MyPages/Home';

class RouterExample extends Component {
    render() {
        return (
        <Router>
            <div className="App">
                <ul className="App-header">
                    <li><Link to="/">Home</Link></li>
                    <li><Link to="/about">About</Link></li>
                    <li><Link to="/contact">Contact Us</Link></li>
                </ul>
                <Routes>
                    <Route path="/" element={<Home />}/>
                    <Route path="/about" element={<About />}/>
                    <Route path="/contact" element={<Contact />}/>
                </Routes>
            </div>
        </Router>
        );
    }
}

export default RouterExample;
