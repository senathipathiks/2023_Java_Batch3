import React, { useState } from 'react';
//usestate 
const DUMMY_HOBBIES=[
 "Skating",
 "cricket",
 "cycling",
 "golf",
 "athletics",
 "body building",
 "Dancer"
];

const UserJson = () =>
{
    const [enteredUsername,setEnteredUsername] = useState("") ;
    const[enteredAge,setEnteredAge] = useState("");
    const[enteredHobby,setSelectedHobby] = useState("");


const usernameChangeHandler = (event) =>{
    setEnteredUsername(event.target.value);
}
const ageChangeHandler = (event)=>{
    setEnteredAge(event.target.value);
}

const HobbydropdownHandler = (event)=>{
    setSelectedHobby(event.target.value);
}

const submitHandler = (event)=>{
    event.preventDefault();  //to prevent page refresh on form submission
    const user = {
        username: enteredUsername,
        age : enteredAge,
        hobby : enteredHobby
    };
    alert(JSON.stringify(user));
};




    return (
      <div>
        <form onSubmit={submitHandler}>
            <label htmlFor="username">UserName</label>
            <input id="username" type="text" value={enteredUsername} onChange={usernameChangeHandler}></input>
            <br/><br/>
            <label htmlFor="age">Age</label>
            <input id="age"type="number" value={enteredAge} onChange={ageChangeHandler}></input>
            <br/><br/>
            <label htmlFor="Hobbies">Select Hobby</label>
            <select id="hobbies" value={enteredHobby} onChange={HobbydropdownHandler}>
                {DUMMY_HOBBIES.map((item,idx) =>(
                    <option key={idx} value={item}>{item}</option>
                ))}

            </select>
            <br/>
            <button type='submit'>Add user</button>
        </form>
      </div>
    )
    }
                


export default UserJson
