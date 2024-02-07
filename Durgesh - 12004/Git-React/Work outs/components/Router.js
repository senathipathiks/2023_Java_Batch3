import React, { Component } from 'react'
import {
    BrowserRouter as Routers,
    Routes,
    Route,
    Link
} from "react-router-dom";
import Home from "./Home";
import About from "./About";
import Contact from "./Contact";

export class Router extends Component {
  render() {
    return (
      <Routers>
         <div className='Application'>
          <ul className='App-header'>
            <li>
              <Link to="/">Home </Link>
            </li>
            <li>
              <Link to="/">About us </Link>
            </li>
            <li>
              <Link to="/">Contact us </Link>
            </li>
          </ul>
          <Routes>
            <Route
            exact
            path='/'
            element={<Home></Home>}>
            </Route>

            <Route
            exact
            path='/'
            element={<About />}>
            </Route>

            <Route
            exact
            path='/'
            element={<Contact />}>
            </Route>
          </Routes>
        </div>
      </Routers>
    )
  }
}

export default Router
