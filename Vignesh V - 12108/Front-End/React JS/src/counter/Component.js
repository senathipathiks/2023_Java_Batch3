import React from 'react'

export const Component = ({count ,handleIncrementClick,handleDecrementClick}) =>(
  
    <div>
        <h1>Helloworld React & Redux!{count}</h1>
        <button onClick={handleDecrementClick}>handleDecrement</button>
        <button onClick={handleIncrementClick}>handleIncrement</button>
      
    </div>
  );

