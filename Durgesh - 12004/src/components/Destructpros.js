import React from 'react'

function Destructpros(props) {
    const{place,clg}=props
  return (
    <div>
        <h1>Hi, This is Durgesh living in {place} studied in {clg} </h1>
        {props.children}
    </div>
  )
}

export default Destructpros
