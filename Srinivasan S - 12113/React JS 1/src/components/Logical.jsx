import React from 'react'

function Logical(props) {
    var Car=["Verna","City","Slavia","Ciaz","Virtus"]
  return (
    <div>
      <h1>Logical AND && Operator</h1>
      {
        Car.length > 0 && <h2>Lenght of the array is {Car.length}</h2>
      }
    </div>
  )
}

export default Logical
