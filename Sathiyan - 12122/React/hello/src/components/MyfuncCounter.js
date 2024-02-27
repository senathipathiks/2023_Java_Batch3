import React, { useState } from 'react'

function MyfuncCounter() {
    const[counter,setcounter]=useState(0)
  return (
    <div>
      <button onClick={()=>{setcounter(counter+1)}}>count:{counter}</button>
    </div>
  )
}

export default MyfuncCounter
