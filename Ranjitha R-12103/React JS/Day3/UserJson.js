import React, { useState } from 'react'

    const DUMMY_HOBBIES=[
        "Swimming",
        "Cricket",
        "Kabadi",
        "Football",
        "Tennis"
    ];

    const UserJson=()=>{
        //defaults
        const[enteredUsername,setEnteredUsername]=useState("");
        const[enteredAge,setEnteredAge]=useState("");
        const[selectedHobby,setSelectedHobby]=useState("Cricket");

        //event handlers for each form field
        const usernameChangeHandler=(event)=>{
            setEnteredUsername(event.target.value);
        };
        const ageChangeHandler=(event)=>{
            setEnteredAge(event.target.value);
        };
        const hobbydropdownHandler=(event)=>{
            setSelectedHobby(event.target.value);
        };
        //form submission
        const submitHandler=(event)=>{
            event.preventDefault();
        //Entered details user object
            const user={
                username:enteredUsername,
                age:enteredAge,
                hobby:selectedHobby
            };
            //fixme-remove the alert with proper implememtation
            alert(JSON.stringify(user));
        }
    
  return (
    <div>
      <form onSubmit={submitHandler}>
        <label htmlFor="username">UserName</label>
        <input id="username" type="text" value={enteredUsername} onChange={usernameChangeHandler}></input>
        <br/>
        <label htmlFor="age">Age(years)</label>
        <input id="age" type="number" value={enteredAge} onChange={ageChangeHandler}></input>
        <br/>
        <label htmlFor="hobbies">Hobbies</label>
        <select id="hobbies" value={selectedHobby} onChange={hobbydropdownHandler}>

        {DUMMY_HOBBIES.map((item,idx)=>(
            <option key={idx} value={item}>
                {item}
            </option>
        ))};
        </select>

        <br/>
        <button type="Submit">Add User</button>
      </form>
    </div>
  )
        }
export default UserJson
