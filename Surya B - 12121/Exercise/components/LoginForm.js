import React, {useState} from "react";
import './style.css'

const DUMMY_HOBBIES = [
    "Swimming",
    "Cricket",
    "Reading",
    "Singer Dharshun",
    "Dancing Dharshun",
    "Boxing",
    "Drawing"
];

const User = () => {
    const[enteredUsername, setEnteredUsername] = useState("");
    const[enteredAge, setEnteredAge] = useState("");
    const[selectedHobby, setSelectedHobby] = useState("Select Hobby");


const usernameChange = (event) => {
    setEnteredUsername(event.target.value);
}
const ageChange = (event) => {
    setEnteredAge(event.target.value);
}

const hobbySelect = (event) => {
    setSelectedHobby(event.target.value);
}

const submitHandler = (event) =>{
    event.preventDefault();

    const user = {
        username: enteredUsername,
        age: enteredAge,
        hobby: selectedHobby
    };
    alert(JSON.stringify(user));
}

return(
    <div>
        <form onSubmit={submitHandler}>
            
            <label htmlFor="username" >Username</label>
            <input id = "username" type="text" onChange={usernameChange} value = {enteredUsername}></input>
            <br></br>
            <label htmlFor="userage" >Age</label>
            <input id = "userAge" type="number" onChange={ageChange} value = {enteredAge}></input>
            <br></br>
            <label htmlFor="hobby" >Hobby</label>
            <select id = "hobby" onChange={hobbySelect} value = {selectedHobby}>
                {DUMMY_HOBBIES.map((item, idx) => (
                    <option key={idx} value={item}>{item}</option>
                ))}
            </select>
            <br/>
            <button type="submit">Add User</button>

        </form>
    </div>
);
}

export default User