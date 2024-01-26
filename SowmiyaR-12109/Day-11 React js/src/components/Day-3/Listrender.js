import React from 'react'
//rfce
function Listrendering() {
     const namearr=['Sowmi','Hari']
    const myElement=(
        <ul>
            <li>One</li>
            <li>two</li>
            <li>threee</li>
        </ul>
    )
    const newarr=namearr.map(element=><h1>{element}</h1>) //
  return (
    <div>
      {myElement}
      {newarr}
    </div>
  )
}

export default Listrendering
