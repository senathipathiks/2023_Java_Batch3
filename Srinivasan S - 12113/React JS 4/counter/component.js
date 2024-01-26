import React from 'react'


const component = ({count,handleIncrementClick,handleDecrementClick}) => (
    <div>
      <h1>Hello! React & Redux {count}</h1>
      <button onClick={handleIncrementClick}>Increment</button>
      <button onClick={handleDecrementClick}>Decrement</button>
    </div>
)

export default component
