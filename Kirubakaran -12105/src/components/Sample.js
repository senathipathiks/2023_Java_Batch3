import React,{ useState} from 'react'

function Sample() {
    const[msg,setMsg]=useState("Welcome");
    return(

    
    <div>
        {msg}
       <button onClick={()=>
        (setMsg("thanks for subscribing"))}>Click here to subscribe</button>
    </div>
    )
  
}

export default Sample
