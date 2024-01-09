import React from 'react'

 const  component = ({count,handleIncrementClick,handleDecrementClick}) =>(
    <div>
        <h1>Helloworld React and Redux!{count}</h1>
         {/* convert handleincrementclick and handledecrementclick to arrow function */}
        <button onClick={()=>handleIncrementClick('INCREMENT')}>+</button>
        <button onClick={()=>handleDecrementClick('DECREMENT')}>-</button>
      </div>
 )
  


export default component;

