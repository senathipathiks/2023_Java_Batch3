import React, { useState } from 'react'
//rfc
import ChildComponent from './ChildComponent'
export default function ParentComponent() {
    const [count,setCount]=useState(0)
  return (
    <div className="App">
        {console.log("The parent component is render")}
        <button onClick={()=> setCount(count+1)}>Increment</button>
      <h2>{count}</h2>
      <ChildComponent name={"Sowmiya"}/>
      {/* <ChildComponent name1={"Hari"}/> */}
    </div>
  )
}
