import React from 'react'

function MapEg1() {
    const arr=["Sri","Kav","Nit"]

    const Listmap=(
        <ol>
            <li>one</li>
            <li>two</li>
            <li>three</li>
            
        </ol>
    )
     const Newlistmap=arr.map(item =><h1>{item}</h1>)   
     var Newlistmap1=arr.map(item=><ol><li>{item}</li></ol>)
    
  return (
    <div>
       {Listmap}
       {Newlistmap}
       {Newlistmap1}
    </div>

  )
}

export default MapEg1
