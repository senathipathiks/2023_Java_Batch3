
import React, { useState } from 'react'

export default function Subscribefunction() {
    const [message, setMessage] = useState('');

 const handleClick = () => {
   setMessage('Thanks for subscribing!');
 };
  return (
    <div>
      <button onClick={handleClick}>Subscribe</button>
      {message && <p>{message}</p>}
    </div>
  )
}


