import React from 'react'
import { useState } from 'react'

const DUMMY_HOBBIES = ["Footbal","Cricket","Hockey","Tennis"];

function User() {
    //defaults
    const[enteredUsername,setEnterUsername] = useState("");
    const[entertedAge,setEnteredAge] = useState("");
    const[selectedHobby, setSelectedHobby] = useState("archery");

    //event handler for each form field
    const UsernameChangeHandler = (event) => {
        setEnterUsername(event.target.value);
    };
    const AgeChangeHandler = (event) => {
        setEnteredAge(event.target.value);
    };
    const HobbydropdownChangeHandler = (event) => {
        setSelectedHobby(event.target.value);
    };
    
    //form submission
    const submitHandler = (event) =>{
        event.preventDefault();
        //entered details user object
        const user = {
            username:enteredUsername,
            age:entertedAge,
            hobby:selectedHobby
        }
        //fixme - remove the alert with proper implementation
        alert(JSON.stringify(user));
    }
  return (
    <div>
      <form onSubmit={submitHandler}>
        {/* username input field */}
        <label htmlFor='username'>Username:</label>
        <input
          id='username'
          type="text"
          value={enteredUsername}
          onChange={UsernameChangeHandler}
        />
        {/* age input field */}
        <br />
        <label htmlFor='age'>Age:</label>
        <input
          type="text"
          value={entertedAge}
          onChange={AgeChangeHandler}
        />
        {/* hobbies dropdown */}
        <br />
        <label htmlFor='hobbies'>Hobby:</label>
        <select
          value={selectedHobby}
          onChange={HobbydropdownChangeHandler}
        >
          {DUMMY_HOBBIES.map((item,idx) => (
            <option key={idx} value={item}>
            {item}
            </option>
          ))}
        </select>
        {/* submit submit button */}
        <br />
        <button type='submit'>Submit</button>-\      </form>
    </div>
  )
}

export default User
