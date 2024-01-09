import React from 'react'

export default React.memo(function ChildComponents({name}){
// export default function ChildComponents({name}) {
    console.log("The child components is rendered")
  return (
    <div>
      {name}
    </div>
)
  })
