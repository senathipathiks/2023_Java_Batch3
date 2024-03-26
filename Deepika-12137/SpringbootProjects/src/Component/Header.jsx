import React from "react";
import {Link} from "react-router-dom";


const Header = () => {
  return (
    <div>
      <br></br>
      <Link to="/brand">
        <button className="btn btn-primary px-4">
          Brand Management System
        </button>
      </Link>
      <Link to="/inventory">
        <button className="btn btn-warning ms-5 px-4">
          Inventory Management System
        </button>
      </Link>
      <br></br>
    </div>
  );
};

export default Header;
