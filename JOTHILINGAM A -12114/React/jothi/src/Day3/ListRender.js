import React from 'react'

function ListRender() {
    const namearr=['jothi','hema','Abi']

    const myElement=(
        <ul>
            <li>one</li>
            <li>Two</li>
            <li>Three</li>
        </ul>
    )
    const newarr=namearr.map(element => <li>{element}</li>)
  return (
    <div>
        {myElement}
        {newarr }
      
    </div>
  )
}

export default ListRender
