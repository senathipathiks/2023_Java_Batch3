import React, { Component } from "react";
import {
    BrowserRouter as Router,
    Routes,
    Route,
    Link,
} from "react-router-dom";
import Login from "./Login";
import Welcome from "./Welcome";
import State from "./State";



 
class RouterExample extends Component {
    render() {
        return (
            <Router>
                <div className="App">
                    <ul className="App-header">
                        <li>
                            <Link to="/">Login</Link>
                        </li>
                        <li>
                            <Link to="/about">
                                Welcome page
                            </Link>
                        </li>
                        <li>
                            <Link to="/contact">
                                Time
                            </Link>
                        </li>
                    </ul>
                    <Routes>
                        <Route
                            exact
                            path="/"
                            element={<Login />}
                        ></Route>
                        <Route
                            exact
                            path="/about"
                            element={<Welcome/>}
                        ></Route>
                        <Route
                            exact
                            path="/contact"
                            element={<State />}
                        ></Route>
                    </Routes>
                </div>
            </Router>
        );
    }
}
 
export default RouterExample;