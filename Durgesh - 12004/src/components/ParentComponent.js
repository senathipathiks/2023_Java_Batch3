import React, { useState } from 'react'
import Childcomponent from './Childcomponent'

export default function ParentComponent() {
    const [count, setCount] = useState(0)
  return (
    <div className='rigid'>
        {
            console.log("Parent is rendered")
        }
        <button onClick={()=> setCount(count+1)}>Increse</button>
        <h3>Count: {count} </h3>

        <Childcomponent name={"Durgesh"}/>
    </div>
  )
}

