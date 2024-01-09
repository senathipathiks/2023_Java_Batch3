import React from 'react'
//rafc
export const component = ({count,handleIncrementClick,handleDecrementClick}) => 
 (
    <div>
      <h1>HelloWorld React & Redux! {count}</h1>
      <button onClick={handleDecrementClick}>Decrement</button>
      <button onClick={handleIncrementClick}>Increment</button>

    </div>
  );


