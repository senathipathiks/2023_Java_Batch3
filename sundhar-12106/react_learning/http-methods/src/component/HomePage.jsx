import React from "react";
import img from "./bg_prev_ui.png";
import {
  Route,
  NavLink,
  Routes,
  BrowserRouter as Router,
} from "react-router-dom";
import Form from "./Form";
import LoginForm from "./LoginForm";

const HomePage = () => {
  return (
    <Router>
      <div>
        <div className="conatiner-fluid border-bottom  m-2 ">
          <div className="container d-flex justify-content-between ">
            <div>
              <img src={img} alt="logo" style={{ height: "40px" }} />
            </div>
            <div className="conatainer">
              <ul className="list-unstyled list-group list-group-horizontal gap-3 ">
                <li>
                  <NavLink to={"/LoginForm"} className="nav-link ">
                    Login
                  </NavLink>
                </li>
                <li>
                  <NavLink to={"/register"} className="nav-link ">
                    Register
                  </NavLink>
                </li>
                <li>
                  <NavLink>
                    <button className="btn btn-primary">Get Users</button>
                  </NavLink>
                </li>
              </ul>
            </div>
          </div>
        </div>
      </div>
      <div>
        <Routes>
          <Route path="/" exact element={<HomePage />} />
          <Route path="/register" element={<Form />} />
          <Route path="/LoginForm"  element={<LoginForm />} />
        </Routes>
      </div>
    </Router>
    
  );
};

export default HomePage;
