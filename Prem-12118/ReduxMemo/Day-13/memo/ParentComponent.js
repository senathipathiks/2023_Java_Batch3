import React from 'react'
import { useState } from "react";
import ChildComponent from "./ChildComponent"
function ParentComponent() {
    const [count, setCount]=useState(0)
  return (
    <div className='App'>
        {console.log("The Parrent Component is rendered")}
      <button onClick={()=> setCount(count+1)}>Increment</button>
      <h2>{count}</h2>
      <ChildComponent name={"Prem"}/>
    </div>
  )
}

export default ParentComponent


