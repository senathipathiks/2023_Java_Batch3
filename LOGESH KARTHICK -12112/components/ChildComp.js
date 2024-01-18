import React from 'react'

export default React.memo(function ChildComp({name}) {
    console.log('Child Comp Rendered')
  return (
    <div>
      {name}
    </div>
  )
}