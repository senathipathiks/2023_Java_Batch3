import React from 'react'
 
export default React.memo(function ChildComponent({name}){
    console.log("The Child Component is Rendered !!!!")
    return (
        <div>{name}</div>
        )
})

