import React, { useState } from 'react'

    const DUMMY_HOBBIES=[
        "swimming",
        "cricket",
        "football",
        "Hockey",
        "tennis"
    ];
    const Userdetail=()=>{
        const [enteredUsername, setEnteredUsername]=useState("");
        const [enteredAge, setEnteredAge]=useState("");
        const [selectHobby, setselectHobby]=useState("");

        //event handlers for each form field

        const usernamechangeHandler=(event)=>{
            setEnteredUsername(event.target.value)
        };

        const agechangeHandler=(event)=>{
            setEnteredAge(event.target.value)
        };

        const hobbydropdownHandler=(event)=>{
            setselectHobby(event.target.value)
        };

        //form submission
       const SubmitHandler=(event)=>{
        event.preventDefault();

        //entered details user object
        const user={
            username:enteredUsername,
            age:enteredAge,
            hobby:selectHobby
        };
        //fixme-remove the alert with proper implementation
        alert(JSON.stringify(user))
       }
  return (
    <div align="center">
      <p>Create the Form and enter userdetails using function components:</p>
        <form onSubmit={SubmitHandler} >

            {/* username input field */}

            <label>UserName:</label>
            <input 
            id="username" 
            type='text' 
            value={enteredUsername} onChange={usernamechangeHandler}></input>

            {/* age input field */}

            <br/>
            <br/>
           <label>Age in (years):</label>
            <input 
            id="age"
            type='number' 
            value={enteredAge} onChange={agechangeHandler}></input>

             {/* hobbies dropdown */}

             <br/>
             <br/>
            <label>Hobbies:</label>
            <select 
            id="hobbies"  
            value={selectHobby} onChange={hobbydropdownHandler}>

           {DUMMY_HOBBIES.map((item,idx) =>(
            <option key={idx} value={item}>
                {item}
            </option>
           ))}
           </select>

           {/* form submit button */}

           <br/>
           <br/>
           <button type='submit'>SUBMIT</button>

        </form>
      
    </div>
  );
};

export default Userdetail