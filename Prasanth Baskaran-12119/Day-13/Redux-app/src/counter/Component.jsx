import React from "react";

const Component = ({ count, handleIncrementClick, handleDecrementClick }) => (
  <div>
    <h1>Hello React & Redux {count}</h1>
    <button onClick={() => handleDecrementClick("DECREMENT")}>Decrement</button>
    <button onClick={() => handleIncrementClick("INCREMENT")}>Increment</button>
  </div>
);

export default Component;
