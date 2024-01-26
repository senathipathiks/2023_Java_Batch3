import React,{useState} from 'react'

export default function FunctSubscribe() {
    const[message,setMessage]=useState("");

    function show(){
        setMessage("Thanks for Subscribe");
    }
  return (
    <div>
      <p>Welcome</p>
        <button onClick={show}>
            Subscribe
        </button>
        <p>{message}</p>
    </div>
  )
}
