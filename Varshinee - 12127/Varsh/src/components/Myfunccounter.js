import React, { useState } from 'react'

export default function Myfunccounter() {
    const [counter, setCounter] = useState(0)
  return (
    
    <div>
      
      <button onClick={()=>{setCounter(counter+1)}}>Count: {counter} </button>
    </div>
  )
}

