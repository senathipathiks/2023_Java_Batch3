import React, { useState } from 'react'

function FuncSubscribe() {
    const[msg,setmsg]=useState('Welcome')
  return (
    <div>
        {msg}
        <button onClick={()=>{setmsg('Thanks for subscribe')}}>click me</button>
      
    </div>
  )
}

export default FuncSubscribe
