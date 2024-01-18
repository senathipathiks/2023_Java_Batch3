import React from 'react';
import {  Link } from "react-router-dom";
const NavBar= () =>{
  return (
  <div>
    <li>
      <Link to="/NavHome">Home</Link>
    </li>
  </div>
  );
}
export default NavBar;