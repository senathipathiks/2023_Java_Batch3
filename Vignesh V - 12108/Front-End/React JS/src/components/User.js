import React, {useState} from 'react'

const DUMMY_HOBBIES = [
    "swimming", "football", "tennis", "hockey", "archery"
];
const User =() => { 
    //defaults
    const [enteredUsername, setEnteredUsername] = useState("");
    const [enteredAge, setEnteredAge] = useState("");
    const [selectedHobby, setSelectedHobby]= useState("archery");
// event handlers for each form field 
const usernameChangeHandler = (event) =>
{
    setEnteredUsername(event.target.value);
};
const ageChangeHandler= (event)=> {
    setEnteredAge(event.target.value);
};
const hobbyChangeHandler=(event)=>{
    setSelectedHobby(event.target.value);

};

//form submission
const submitHandler = (event) => {
    event.preventDefault();
    const user = {
        username : enteredUsername,
        age : enteredAge,
        hobby : selectedHobby
    };
    //fixme - remove the alert with proper implementation 
    alert(JSON.stringify(user));
};


  return (
    <div>
      <form onSubmit = {submitHandler}>
        {/* username input field */}
        <label htmlFor="username">Username</label>
        <input id="username" type ="text" value={enteredUsername} onChange={usernameChangeHandler}></input>
        {/* age input field*/}
        <br/>
        <label htmlFor="age">Age (years): </label>
        <input id='age' type='number' value={enteredAge} onChange={ageChangeHandler}></input>
        {/* hobbies select field */}
        <br/><br/>
        <label htmlFor='hobbies'>Select a Hobby:</label>
        <select id='hobbies' value={selectedHobby} onChange={hobbyChangeHandler}>
        {DUMMY_HOBBIES.map((item, idx) => (
            <option key={idx} value={item}>{item}</option>
        ))}
        </select>
        {/* form submit button */}
        <br/>
        <button type ="submit"> Add user</button>



      </form>
    </div>
  )
}

export default User

