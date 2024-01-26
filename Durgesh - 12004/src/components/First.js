import React from 'react'
import "./Style.css"

function First(props) {
  return (
    <div className='first'>
      <h1>Hi, This is Durgesh living in {props.place} studied in {props.clg} </h1>
      {props.children}
    </div>
  )
}

export default First
