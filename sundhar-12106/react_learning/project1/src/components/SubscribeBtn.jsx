import React, { useState } from 'react'

function SubscribeBtn() {
    let [message, nMessage] = useState("Welcome to my page");
  return (
    <div>
        <h1 className='text-primary'>{message}</h1>
        <button 
        className='btn btn-danger'
        onClick={()=>{
            nMessage("thanks for Subscribing");
        }}>
            Subscribe
        </button>
    </div>
  )
}

export default SubscribeBtn
