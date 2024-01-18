import React from 'react'

export const Component = ({count, incrementClick, decrementClick}) => (
    <div>
        <h1>Hello React & Redux - Count: {count}</h1>
        <button onClick={decrementClick}>Decrease</button>
        <button onClick={incrementClick}>Increase</button>
    </div>
);