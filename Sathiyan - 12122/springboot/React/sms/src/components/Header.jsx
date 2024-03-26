import React from "react";
import { BrowserRouter, Link, Route, Routes } from "react-router-dom";
import Department from "./Department";
import Home from "./Home";

const Header = () => {
  return (
    <div>
      <br></br>
      <Link to="/employee">
        <button className="btn btn-primary px-4">
          Student Management System
        </button>
      </Link>
      <Link to="/department">
        <button className="btn btn-warning ms-5 px-4">
          Department Management System
        </button>
      </Link>
      <br></br>
    </div>
  );
};

export default Header;
