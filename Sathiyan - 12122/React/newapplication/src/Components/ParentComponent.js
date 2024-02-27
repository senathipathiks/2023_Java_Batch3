import React, { useState } from 'react'
import ChildComponent from "../../../hello/src/components/ChildComponent"

export default function ParentComponent() {

    const [count,setCount]=useState(0)

  return (
    <div className='App'>
        {console.log("The parent component is rendered")}
        <button onClick={()=>setCount(count+1)}>Increment</button>

        <h2>{count}</h2>

        <ChildComponent name={"Sathya"}/>

    </div>
  )
}
