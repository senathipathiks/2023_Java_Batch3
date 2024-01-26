import React from "react"
const component=({count,handleIncrementClick,handleDecrementClick})=>{
 
  return(
    <div>
      <h1>HellO! React and Redux</h1>
      <button onClick={()=>handleIncrementClick()}>INCREMENT</button>
      <button onclick={()=>handleDecrementClick()}>DECREMENT</button>
    </div>
  
)
  }
export default component
