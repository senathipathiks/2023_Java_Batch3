import React from "react";

const CounderRedux = ({ count, handleIncrement, handleDecrement }) => {
  return (
    <div>
      <h1>Hello the counter value is : {count}</h1>
      <button onClick={handleIncrement}>Increment</button>
      <button onClick={handleDecrement}>Decrement</button>
    </div>
  );
};

export default CounderRedux;
