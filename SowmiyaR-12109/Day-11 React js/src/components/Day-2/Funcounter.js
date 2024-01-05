import React from 'react'


function Funcounter(){
    const [counter, setCount] = React.useState(0)
    return (
        <div>
            <button onClick= {()=> {setCount(counter+1)}}> Count: {counter}</button>
        </div>)
}
export default Funcounter
