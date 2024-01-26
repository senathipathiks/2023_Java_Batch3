import React from 'react'

function Functioncounter(){
    const [count, setCounte] = React.useState(0)
    return (
        <div>
            <button onClick={()=>{setCounte(count+1)}}>count:{count}</button>
        </div>
    );
}

export default Functioncounter