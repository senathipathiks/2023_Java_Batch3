import React from 'react'



export default React.memo(function ChildComponent({name}){
//function ChildComponent({name}) {

console.log("The child component is rendered")
  return (
    <div>
        <div>{name}</div>
      
    </div>
  )
})

