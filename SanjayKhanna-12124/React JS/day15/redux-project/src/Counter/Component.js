import React from 'react';

const Component = ({count,handleIncrementClick,handleDecrementClick}) => (
        <div>
        <h1>Hello World React and Redux!!!</h1>
        <p>{count}</p>
        <button onClick={()=> handleIncrementClick('INCREMENT')}>Increment</button>
        <button onClick={()=> handleDecrementClick('DECREMENT')}>Decrement</button>
        </div>
    );

export default Component;
