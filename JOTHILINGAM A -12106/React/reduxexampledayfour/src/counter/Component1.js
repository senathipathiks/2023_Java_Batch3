import React from "redux-react";


export const Component1=({count, handleIncrementclick,handleDecrementclick})=>{
return(
    <div>
    <h1> Hello jothi!!!!!{count}</h1>
    <button onClick={handleDecrementclick}>decrement"-"</button>
    <button onClick={handleIncrementclick}>Increment"+"</button>
</div>
)
};