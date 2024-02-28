import React from 'react';
import "./Mystyle.css";

function Myapp(props) {
  const{name,topic}=props
  return (
    <div>
      <h1 className='div1'>Hello World {name} created {topic} </h1>
      {props.children}

    </div>
  )
}

export default Myapp
