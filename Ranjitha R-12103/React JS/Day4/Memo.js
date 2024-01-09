import React,{useState} from 'react'
import ChildComponents from "./ChildComponents"

function Memo() {
    const [count,setCount]=useState(0)
  return (
    <div className="App">
      {console.log("The parent components is rendered")}
      <button onClick={()=>setCount(count+1)}>Increment</button>
      <h2>{count}</h2>
      <ChildComponents name={"Ranjitha"}/>
    </div>
  )
}

export default Memo
