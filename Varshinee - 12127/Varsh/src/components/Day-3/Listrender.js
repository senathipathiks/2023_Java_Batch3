import React from 'react'

export default function Listrender() {
    const namearr=['Varshinee','Yokesh','Kannan']
    const myElement=(
        <ul>
            <li>One</li>
            <li>Two</li>
            <li>Three</li>
        </ul>
    )
    const newarr=namearr.map(element => <h1>{element}</h1>)
  return (
    <div>
      {myElement}
      {newarr}

    </div>
  )
}
