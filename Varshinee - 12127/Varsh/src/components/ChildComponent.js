import React from 'react'
export default React.memo(function ChildComponent({name}){
 // export default function ChildComponent() {
    return (
        <div>
          {name}
        </div>
      )
})