import React,{useState} from 'react'
import Childcomponent from './Childcomponent'
export default function Parentcomponent() {
    
    const[counter,setCounter]=useState(0);
  return (
    <div>
        {console.log("The parent Component is rendered")}
       <button onClick={()=>(setCounter(counter+1))}>Increment</button>
       <h2>{counter}</h2>
       <Childcomponent name={"Kirubakaran"}/>
    </div>
  )
}
