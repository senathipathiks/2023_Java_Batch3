import React from 'react'

export default React.memo(function Childcomponent({name}){
    //export default function Childcomponent({name}){}
    console.log("The child Component is rendered")
    return(
        <div>
            <h2>{name}</h2>
        </div>
    )
})