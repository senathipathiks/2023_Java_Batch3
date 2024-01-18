import React from 'react'

function Welcome(props) {
  return (
    <div class = "div1">
      <p>This is my First Component{props.name} created using {props.topic}</p>
      
    </div>
  )
}

export default Welcome
