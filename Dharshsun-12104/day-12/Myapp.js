import React from 'react'

function Myapp(props) {
  
  return (
    <div class="div1">
     <h1>My first react component {props.name} created using {props.topic}</h1> 
     {props.children}
    </div>
  )
}

export default Myapp
