import React, {useState}from 'react'

export default function Mysubscribe() {
    const [message,setMessage]=useState('');

    const handleClick =()=>{
        setMessage('thanks for subscribing')
    };

  return (
    <div>
        <button onClick={handleClick}>subscribe</button>
        {message && <p>{message}</p>}
        
    </div>
  )
}
