import React from 'react'

function Listrender() {
    const namearr=['arun','kumar','govw']
    const myelement=(
        <ul>
            <li>one</li>
            <li>two</li>
            <li>three</li>
        </ul>

    )
    const newarr=namearr.map(e=><h1 key={e}>{e}</h1>)
  return (
    <div>
      {myelement}
      {newarr}
    </div>
  )
}

export default Listrender
