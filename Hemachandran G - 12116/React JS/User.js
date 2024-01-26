import React, { useState } from 'react'

const DUMMY_HOBBIES = [
    "Photography",
    "Editing",
    "Coding",

];

const User =() => {
    const [enteredUsername, setEnteredUsername] = useState("");
    const [enteredAge, setEnteredAge] = useState("");
    const[selectedHobby,setSelectedHobby] = useState("Editing");
    const usernameChangeHandler = (event) =>
    {
        setEnteredUsername(event.target.value);
    };
    const ageChangeHandler = (event) =>
    {
        setEnteredAge(event.target.value);
    };
    const hobbyChangeHandler= (event)=>
    {
        setSelectedHobby(event.target.value);
    };


    const submitHandler = (event) => {
        event.preventDefault();
        const user ={
            username : enteredUsername,
            age : enteredAge,
            hobby : selectedHobby
        };

        alert(JSON.stringify(user));
    };

    return (
        <div>
            <center >
            <form onSubmit = {submitHandler}>
                <label>username: </label>
                <input type="text"  value={enteredUsername} onChange={usernameChangeHandler}/>
                <br />
                <label>age: </label>
                <input type ="number" value={enteredAge} onChange={ageChangeHandler}/>
                <br />
                <label>Select Hobby</label>
                <select onChange={hobbyChangeHandler} value={selectedHobby}>
                {DUMMY_HOBBIES.map((item, idx) => (
                <option key={idx} value={item}>{item}</option>
                   ))}
                  </select>
                  {/* form submit button */}
        <br/>
        <button type ="submit"> Add user</button>

            </form>
            </center>
        </div>
    )


}

export default User
