
import React , {useState} from 'react'

import Counter from './Counter'


 function MyfuncCounter() {
    const [counter, setCounter] =useState(0)
  return (
    <div>
        <button onClick={()=>{setCounter(counter+1)}}>Count:{counter}</button><br/>
      
    </div>
  )
}
export default MyfuncCounter
