
import React from 'react'

 export const Component = ({count,handleIncrementClick,handleDecrementClick}) => {
  return (
    <div>
     <h1>Helloworld React & Redux! {count}</h1> 
     <button onClick={handleDecrementClick}>Decrement</button>
     <button onClick={handleIncrementClick}>Increment</button>
    </div>
  )
}

//export component

