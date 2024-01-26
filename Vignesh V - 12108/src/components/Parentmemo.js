import React, { useState } from 'react'
import Childcomponent from "./Childcomponent"

export default function Parentmemo() {

    const[count,setcount]=useState(0)
  return (
    <div className='App'>
        {console.log("the parent component is rendered")}
        <button onClick={()=>setcount(count+1)}>increment</button>
        <h2>{count}</h2>
        <Childcomponent name={"vignesh"}></Childcomponent>
      
    </div>
  )
}
