    import React from "react";
    import { Link } from "react-router-dom";

    const Header = () => {
    return (
        <div>
        <center>
            <br></br>
            <Link to="/transaction">
            <button className="btn btn-primary px-4">
                Transaction Management System
            </button>
            </Link>
            <Link to="/user">
            <button className="btn btn-warning ms-5 px-4">
                User Management System
            </button>
            </Link>
            <br></br>
        </center>
        </div>
    );
    };

    export default Header;
