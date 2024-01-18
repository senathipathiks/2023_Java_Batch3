import React from 'react'

export default function BUs(props) {
  return (
    <div>
       <h1>This is {props.title} vehicle</h1>
       <Depot/>
    </div>
  )
}
function Depot(){
    return(
        <h1>This is Depot</h1>
        
    );
}
const [, , animal] = ['Horse', 'Mouse', 'Cat'];
console.log(animal);

