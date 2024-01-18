import React from 'react'

function Car(props) {
  return (
    <div>
         <Garage/>
      <h1 id="i1">This car is from famous {props.brand}</h1>
    </div>
  )
}
function Garage(){
    return(
        <div>
            <h2>Who is in this garage?</h2>
           
        </div>
    )
}

export default Car
