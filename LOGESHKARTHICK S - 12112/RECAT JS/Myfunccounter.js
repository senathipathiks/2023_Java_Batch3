import React,{useState} from 'react'

export default function Myfunccounter() {
    const [counter, setCounter] = React.useState(0)
  return (
    <div>
    <button onClick={()=>{setCounter(counter+1)}}> count:{counter}</button>
    </div>
  )
}
