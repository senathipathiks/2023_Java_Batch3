import React, {useState} from "react";
// import './style.css'
function Subs() {
    let [message, notimess]=useState("Welcome");
    return (
      <div>
        <h1 id = "text">{message}</h1>
        <button onClick ={()=>{notimess("Thanks for Subscribing");}}>Subscribe</button>
      </div>
    )
  }

  export default Subs
