import React from 'react'
//rafc
export const Component = ({count,handleIncrementClick,handleDecrementClick}) => (
<div>
    <h1>Helloworld React & Redux ! {count} </h1>
    <button onClick={handleDecrementClick}>Decrement</button>
    <button onClick={handleIncrementClick}>Increment</button>
</div>
);
 export default Component
