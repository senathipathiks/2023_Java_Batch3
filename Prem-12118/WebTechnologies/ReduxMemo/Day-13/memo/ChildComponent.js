import React from 'react'

export default React.memo(function ChildComponent({name}) {
    console.log("The Child componenrt is rendered")
  return (
    <div>
        {name}
      
    </div>
  )
})

 
