import React from 'react'

export default function Lg(props) {
    const cars = props.cars;
  return (
    <div>
         <div>
        <h2>Logical AND Operator</h2>
        {
            cars.length > 0 &&
            <h1>The car array length is {cars.length}</h1>
        }
      
    </div>
      
    </div>
  )
}
