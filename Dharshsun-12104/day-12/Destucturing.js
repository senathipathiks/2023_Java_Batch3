import React from 'react'

function Destructuring(props) {
  const{name,topic}=props
  return (
    <div class="div1">
     <h1>My first react component {name} created using {topic}</h1> 
     {props.children}
    </div>
  )
}

export default Destructuring