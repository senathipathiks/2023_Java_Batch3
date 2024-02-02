import React, { useState } from 'react';
import ChildComponent from './ChildComponent';

function ParentComponent() {
    const[count, setCount] = useState(0);
    return (
        <div>
        {console.log("Parent component is Renderring")}
        <button onClick={() => setCount(count + 1)}>Increment</button>
        <h2>{count}</h2>
        <ChildComponent name={"Sanjay Khanna"} />
        </div>
    );
    }

export default ParentComponent;
