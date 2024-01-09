import {useState}  from 'react'

import ChildComponent from './ChildComponent'
function ParentComponent() {
    const [count ,setCount] =useState(10)
    const [count1 ,setCount1] =useState(10)
  return (
    <div className='App'>
        {console.log("The parent component is rendered")}
        <button onClick={()=> setCount(count+1)}>increament</button>
        <h2>{count}</h2>

        <button onClick={()=> setCount1(count1-1)}>decreament</button>

        <h2>{count1}</h2>
        <ChildComponent name={"Hi jothi!!!!!!!!"}></ChildComponent>
        
      
    </div>
  )
}

export default ParentComponent
