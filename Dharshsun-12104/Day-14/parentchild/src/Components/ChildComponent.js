import React from 'react'
export default React.memo(function ChildComponent({name}) {
//export default function ChildComponent({name}) {
    console.log("The child component is rendered")
  return (
    <div>
      <div>{name}</div>
    </div>
  )
})
