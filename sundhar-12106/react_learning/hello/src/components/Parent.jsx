import React, { useState } from 'react'
import ChildCom from './ChildCom';

function Parent() {
    let [count,setCount]=useState(0);
  return (
    <div>
        {console.log("parent rendered")}
        <button onClick={()=>setCount(count+1)}>click me</button>
      <h2>{count}</h2>
      <ChildCom name={"sundhar raj s"}/>
    </div>
  )
}

export default Parent
