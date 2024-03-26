import React from "react";
import {Link} from "react-router-dom";


const Header = () => {
  return (
    <div>
      <br></br>
      <Link to="/customer">
        <button className="btn btn-primary px-4">
          Customer Management System
        </button>
      </Link>
      <Link to="/shop">
        <button className="btn btn-warning ms-5 px-4">
          Shop Management System
        </button>
      </Link>
      <br></br>
    </div>
  );
};

export default Header;
