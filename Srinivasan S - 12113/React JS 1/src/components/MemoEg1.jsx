import React, { useState } from 'react'
import ChildComponent from './ChildComponent';


function MemoEg1() {
    const [count,setCount]=useState(0);
  return (
    <div className='App'>
      {console.log("Parent")}
      <h1><button onClick={()=>setCount(count+1)}>Increase</button></h1>
      <h2>{count} times</h2>
      <ChildComponent name="Srini"></ChildComponent>
    </div>
  )
}

export default MemoEg1
