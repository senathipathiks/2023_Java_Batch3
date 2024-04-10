import React from 'react'
import { useState } from 'react'

function Welcomefunction() {
    const [txt,setTxt] = useState('welcome')
    const change = () =>{
        setTxt(()=>{return "Thanks for Subscribers"})
    }


  return (
    <div>
        <h1>Functional component </h1>
        <span>{txt}</span>
      <button onClick={()=>change()}>Subscribe!!</button>
    </div>
  )
}

export default Welcomefunction

