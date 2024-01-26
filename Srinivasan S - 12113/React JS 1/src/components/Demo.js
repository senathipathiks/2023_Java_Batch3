import React from 'react'
import "./MyStyle.css"
function Demo(props) {
  return (
    <div id="d1" >
      <b>My name is {props.name},Now I am styding {props.topic}</b>
      <p>{props.children}</p>
      
    </div>
  )
}

export default Demo;
