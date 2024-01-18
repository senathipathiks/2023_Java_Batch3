import React from 'react'

export default function List() {
    const arr=["Anbu","chandra","rajan"]
    const myEle=(
        <ul>
            <li>one</li>
            <li>two</li>
            <li>three</li>
        </ul>
      )
      const newarr=arr.map(element => <h1>{element}</h1>)
      
  return (
    <div>
      {myEle}
      {newarr}
    </div>
  )
}
