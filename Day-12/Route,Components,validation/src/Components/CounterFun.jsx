import React from 'react'

function CounterFun() {
    const [count, setCount] = React.useState(0)
  return (
    <div>

        <button onClick={()=>{setCount(count+1)}}>Increse Count : {count}</button>
      
    </div>
  )
}

export default CounterFun
