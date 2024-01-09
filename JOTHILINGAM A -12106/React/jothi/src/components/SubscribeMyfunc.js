import React, { useState } from 'react'

 function SubscribeMyfunc() {
    const [text, setText] = useState('Welcome')
  return (
    <div>
        <h1>{text}</h1>
            <button onClick={()=>{setText('thanks for subscribe')}}>subscribe{setText}</button>
      
    </div>
  )
}
export default SubscribeMyfunc
