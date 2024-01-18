import React from 'react'

 const Component = ({count,handleIncrementClick,handleDecrementClick}) => 
   (
    <div>
      <h1>helloworld React & redux! {count }</h1>
      <button onClick={()=> handleIncrementClick('INCREMENT')}>+</button>
      <button onClick={()=> handleDecrementClick('DECREMENT')}>-</button>

    </div>
    );
    
    export default Component;