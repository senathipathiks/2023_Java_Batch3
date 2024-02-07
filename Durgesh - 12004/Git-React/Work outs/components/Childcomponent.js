import React from 'react'

export default React.memo(function Childcomponent({name}) {

    console.log("Child is rendered")
  return (
    <div>
      {name}
    </div>
  )
})

