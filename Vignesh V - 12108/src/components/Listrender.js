import React from 'react'

export default function Listrender() {
    const namearr=['vignesh','kumar','Relevantz']
    const myElement=(
        <ul>
            <li>one</li>
            <li>two</li>
            <li>three</li>
        </ul>
    )
    const newarr=namearr.map(Element=><h1>{Element}</h1>)

    
  return (
    <div>
      {myElement}
      {newarr}
    </div>
  )
}
