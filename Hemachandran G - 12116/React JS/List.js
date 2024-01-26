import React from 'react'

function List() {
    const namearr=['Heram','Abi','Jothi']
  const myElement=(
    <ul>
        <li>First item</li>
        <li>Second item</li>
        <li>Third item </li>
    </ul>  
    
  )
  const newarr=namearr.map(element => <li>{element}</li>
  )

  return(
    <div>
        {myElement}
        {newarr}
    </div>
  )
}

export default List
