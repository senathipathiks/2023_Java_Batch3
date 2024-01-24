import React from 'react';

export const Component = ({count, handleIncrementClick, handleDecrementClick}) => (
    <div>
        <h1> Helloworld {count}</h1>
        <button onClick={handleIncrementClick}>Increment</button>
        <button onClick={handleDecrementClick}>Decrement</button>
    </div>
);