import React, { useState } from 'react'

const DUMMY_HOBBIES=[
    "Swimming",
    "Cricket",
    "VolleyBall",
    "Hockey",
    "Football"

];

const Userdefault=() => {
    //default 
    const [enteredUsername, setenteredUsername]=useState("");
    const [enteredAge,setenteredAge]=useState("");
    const [selectedHobby,setselectedHobby]=useState("Cricket");

    //Event Handlers for each fields.
    const usernameChangeHandler = (event) =>{
        setenteredUsername(event.target.value);
    };

    const ageChangeHandler =(event)=>{
        setenteredAge(event.target.value);
    };

    const hobbyDropdownHandler =(event)=>{
        setselectedHobby(event.target.value);
    };

    //form submissions.
    const submitHandler=(event)=>{
        event.preventDefault();
        //entered details user object
        const user={
            username: enteredUsername,
            age: enteredAge,
            Hobby: selectedHobby
        };

        alert(JSON.stringify(user));
    }


  return (
    <div>
      <form onSubmit={submitHandler}>
        {/*Username input field*/}
        <label htmlFor='username'>Username</label>
        <input
            id='username'
            type='text'
            value={enteredUsername}
            onChange={usernameChangeHandler} />

        {/*Age input field*/}
        <br />
        <label htmlFor='age'>Age</label>
        <input
            id='age'
            type='number'
            value={enteredAge}
            onChange={ageChangeHandler} />

        {/*Hobby input field*/}
        <br />
        <label htmlFor='hibbies'>Hobbies</label>
        <select
            id='hobbies'
            value={selectedHobby}
            onChange={hobbyDropdownHandler} >

        {DUMMY_HOBBIES.map((item, idx) => (
            <option key={idx} value={item}>
                {item}
            </option>
        ))}
        </select>

        {/*Submit field*/}
        <br />
        <button type='submit'> Add user </button>
      </form>
    </div>
  )
}

export default Userdefault
