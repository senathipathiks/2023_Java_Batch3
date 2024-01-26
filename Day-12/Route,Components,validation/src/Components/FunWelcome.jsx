import React, { useState } from 'react'

export default function FunWelcome() {
    var[init,setEnd] = useState("Welcome");
  return (
    <div>
        <h1>{init
        }</h1>
        <button type='button' onClick={()=>{setEnd(init="Thanks for Subscribing!!!")}}>Subscribe</button>
      
    </div>
  )
}

