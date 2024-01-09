import React from 'react'

 function ChildCom({name}) {
  return (
    <div>
        {console.log("child rendered")}
      {name}
    </div>
  )
}
export default React.memo(ChildCom)

