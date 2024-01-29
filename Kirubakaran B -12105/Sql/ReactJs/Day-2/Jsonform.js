import React, { useState } from 'react'
const Hobbies=[
    "cricket",
    "Reading books",
    "Playing football",
    "playing handball"

]

const Jsonform =()=>{
    const[username,setusername]=useState("");
    const[age,setage]=useState("");
    const[hobby,sethobby]=useState("cricket");

    const usernamehandler =(e)=>
    {
        setusername(e.target.value);
    };
    const agehandler =(e)=>
    {
        setage(e.target.value);
    };
    const hobbyhandler =(e)=>
    {
        sethobby(e.target.value);
    };

    const submithandler= (e)=>
    {
        e.preventDefault();
        const us={
            Name:username,
            Age:age,
            Hobby:hobby
        };
        alert(JSON.stringify(us));
        
    }

     


  return (
    <div>
      <form onSubmit={submithandler}>
        <label >Username</label> <br/>
        <input value={username}
        onChange={usernamehandler} type="text"/><br />
        <label >Age</label> <br/>
        <input value={age}
        onChange={agehandler} type="number"/><br />
        <label >Hobby</label><br/>
        <select
         value={hobby}
        onChange={hobbyhandler}>

           { Hobbies.map((item,idx) => (
                <option key={idx} value={item}>{item}</option>
            ))}
        </select>
        <br />
        <button type='submit'>Submit</button>
      </form>
    </div>
  );
           }
    
           export default Jsonform
