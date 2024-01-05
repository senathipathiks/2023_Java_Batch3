import React from 'react'

export default function Myapp1(props) {
  return (
    <div>
      <b>This is my first componets {props.name} created using {props.topic}</b>
        {props.children}
    </div>
  )
}

// using desturcture method