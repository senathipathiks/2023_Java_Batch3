import React, { useState } from 'react'

export default function Myfunccounter() {
    const [message, setMessage] = useState('Welcome')
  return (
    
    <div>
      {message}
      <button onClick={()=>{setMessage('Thanks for subscribing')}}>Subscribe</button>
    </div>
  )
}
