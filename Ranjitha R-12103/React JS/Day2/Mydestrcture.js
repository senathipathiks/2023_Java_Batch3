import React from 'react'

export default function Mydestrcture(props) {
   const{name,topic}=props
  return (
    <div>
      <b>This is my First components{name} created using{topic}</b>
      {props.children}
    </div>
  )
}
