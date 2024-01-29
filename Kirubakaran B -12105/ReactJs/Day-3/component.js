import React from 'react'

export const component=({count,handleIncrementClick,handleDecrementClick})=>
(


  
    <div>
        <h1>Hello world {count}</h1>
       <button onClick={handleIncrementClick}>Increment</button>
       <button onClick={handleDecrementClick}>Decrement</button>

    </div>
  
);
