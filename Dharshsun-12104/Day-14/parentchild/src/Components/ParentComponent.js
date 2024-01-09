import React, { useState } from 'react'
import ChildComponent from './ChildComponent'

 function ParentComponent() {
  const [count,setCount] = useState(0)
    return (
      <div>
        <div className='App'>
            {console.log("the parent component is rendered")}
            <button onClick={()=> setCount(count+1)}>Increment</button>
            <h2>{count}</h2>
            <ChildComponent name ={"Senathipathi"}/>
        </div>
      </div>
    )
  }


export default ParentComponent
