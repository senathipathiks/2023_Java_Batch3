import React from 'react'

export default React.memo(function ChildComponent({name})  {

    //export default function ChuildComponent({name}){
    console.log("Child component is rendered")
  return (
    <div>
      {name}
    </div>
  )
})
