import React from 'react'

function Listrender() {
    const namearr=['Papa','Sathya']
    const myElement=(
        <ul>
            <li>One</li>
            <li>Two</li>
            <li>Three</li>
        </ul>
    )

    const newarr=namearr.map(element => <h1> {element} </h1>)
        
  return (
    <div>
      {myElement}
      {newarr}
    </div>
  )
}

export default Listrender