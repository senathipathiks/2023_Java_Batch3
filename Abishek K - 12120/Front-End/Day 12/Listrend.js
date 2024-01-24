import React from 'react'

function Listrend() {
    const namearr = ['Abishek','kumar', 'Mohanur']
    const myElement = (
        <ul>
            <li>one</li>
            <li>Two</li>
            <li>Three</li>
        </ul>
    )
    const newarr = namearr.map((element) =>  <ul><li>{element}</li></ul>)
  return (
    <div>
      {myElement}
      {newarr}
      
    </div>
  )
}

export default Listrend
