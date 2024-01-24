import React from 'react'
import { useState } from 'react'
import Childcomponent from "./Childcomponent"

export default function Parentcomponent(){
    const [count, setCount] = useState(0)
    return (
        <div className='App'>
            {console.log("The Parent Component is Rendered")}
            <button onClick={()=> setCount(count +1)}>Increment</button>
            <h2>{count}</h2>
            <Childcomponent name={"Abishek"} />
        </div>
    )
}


