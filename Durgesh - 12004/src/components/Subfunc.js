import React, { useState } from 'react'

function Subfunc() {
    const[before,after]=useState('Welcome')
  return (
    <div>
        
      <button onClick={()=>{after('Thanks for Subscribing')}}>Subscribe</button>
    </div>
  )
}

export default Subfunc
