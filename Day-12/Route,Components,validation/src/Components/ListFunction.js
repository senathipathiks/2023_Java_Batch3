import React from 'react'

export default function ListFunction() {
    const namearr=['arun','prasanth','kumar']


    const myElement=(
    <ul>
    <li >one </li>
    <li> two</li>
    <li>three</li>
    </ul>
    )
    const newarr=namearr.map(element=><h1>{element}</h1>)
    const newarr1=namearr.map(element=><ul><li>{element}</li></ul>)
  return (
    <div>
        {myElement}
        {newarr}
         {newarr1}
      
      
    </div>
  )
}
