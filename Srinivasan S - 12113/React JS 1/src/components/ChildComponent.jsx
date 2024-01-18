import React from 'react'

// export default function ChildComponent({name}) {
    export default React.memo(function ChildComponent({name}){
    console.log("the child comp")
  return (
    <div>
      {name}
    </div>
  )
})
