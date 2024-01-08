import React, { useState } from 'react'

function FuCount() {
    let [counter,setCounter]=useState(0)
  return (
    <div>
      <span className="badge bg-primary m-5 ">{counter}</span>
      <button
        onClick={() => {
          setCounter(counter+1)
        }}
        className="btn btn-primary "
      >
        click
      </button>
    </div>
  );
}

export default FuCount
