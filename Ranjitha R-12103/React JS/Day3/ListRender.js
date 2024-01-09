import React from 'react'

export default function ListRender() {
    const namearr=['Arun','Kumar',"Ram"]
   const myElement=(
    <ul>
        <li>One</li>
        <li>Two</li>
        <li>Three</li>
    </ul>
   )
    const newarr=namearr.map(element=><h1>{element}</h1>)
  return (
    <div>
      {myElement}
      {newarr}
    </div>
  )
}
