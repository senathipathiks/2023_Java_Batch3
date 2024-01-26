import React, { useState } from 'react'

function Subsfun() {
    var[message,smessage]=useState("Welcome to my channel!!")
    var Updatemsg=()=>{
      smessage("Welcome Back")
    }
  return (
    
    <div>
      <h1>{message}</h1>
      <button onClick={Updatemsg}>Subscribe</button>
    </div>
  )
}

export default Subsfun
