import React from 'react'

export default React.memo( function Childcomponent({name}) {
    console.log("the child component is rendered")
  return (
    
    <div>
      {name}
    </div>
  )
})
