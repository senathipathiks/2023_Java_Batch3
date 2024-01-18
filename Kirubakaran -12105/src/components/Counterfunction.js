import React, { useState } from 'react'

export default function Counterfunction() {
    const[counter,setCounter]=useState(0)
  return (
    <div>
        <button onClick={()=>(setCounter(counter+1))}>count :{counter} </button>
    </div>
  )
}
