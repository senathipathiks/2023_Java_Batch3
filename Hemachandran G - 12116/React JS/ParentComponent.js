import {useState} from 'react'
import ChildComponent from './ChildComponent'

export default function ParentComponent() {
    const [count, setCount] = useState(0)

  return (
    <div className='App'>
        {console.log("The Parent component is Rendered !!!")}
        <button onClick={() => setCount(count+1)}> Increment </button>

        <h2>{count}</h2>

        <ChildComponent name = {"Heram :)"}/>
      
    </div>
  )
}

// export default ParentComponent
