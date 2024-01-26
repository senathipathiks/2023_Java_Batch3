import React,{useState} from 'react'
import ChildComponent2 from './ChildComponent2';

function MemoFunc() {

    const [count, setCount] = useState(0);
  return (
    <div className='App'>
        {console.log("The Parent component is rendered")}
        <button onClick={()=> setCount (count+1)}>Increment</button>
        <h2>{count}</h2>
        <ChildComponent2 name={"Prashanth"}></ChildComponent2>
      
    </div>
  )
}






export default MemoFunc
