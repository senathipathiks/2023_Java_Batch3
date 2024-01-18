import React, {useState } from 'react' 
import ChildComp from "./ChildComp"

function  ParentComp()  {
    const [count,setCount] = useState(0)
  {
    return (
      <  div className="App">
        {console.log("the parent componenet is rendered")}
        <button onClick={()=> setCount(count+1)}>Increment</button>

        <h2>{count}</h2>
        <ChildComp name={"loki"} />
        
      </div>
    )
  }
}

export default ParentComp
