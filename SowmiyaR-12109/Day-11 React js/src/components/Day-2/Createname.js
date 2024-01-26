// import React, { Component } from 'react'
import "./Mystyle.css";
function Createname(props) {
 
    return (
      <div class="div1">
        <b>This is my first Components{props.name} created using {props.topic} 
        {props.children}</b>
      </div>
    )
  }


export default Createname
