import React, { useState } from 'react'


const Dummy_Hobbies =[
    "swimming", " playing" ," ksdkjjsjs"

];

const User2= () => {
    // defaults
    const [uname , setuname]= useState(" ");
    const [age , setage] = useState( " ");
    const [selecthobby , sethobby] =useState("swimming");


// event handler fields

const unamechangeHandler =(event) =>{
    setuname(event.target.value);
};

const agechangeHandler =(event) =>{
    setage(event.target.value);
};

const hobbychangeHandler =(event) =>{
    sethobby(event.target.value)
};


// form submission
const submitHandler =(event) =>{
    event.prventDefault();
    // enter user detail object
    const user = {
        uname1: uname, 
        age1 : age,
        selecthobby1 : selecthobby
    };
    alert(JSON.stringify(user));
}

  return (
    <div>
        <form onSubmit = {submitHandler}>
        {/* username input field */}
        <label htmlFor="username">Username</label>
        <input id="username" type ="text" value={uname} onChange={unamechangeHandler}></input>
        {/* age input field*/}
        <br/>
        <label htmlFor="age">Age (years): </label>
        <input id='age' type='number' value={age} onChange={agechangeHandler}></input>
        {/* hobbies select field */}
        <br/><br/>
        <label htmlFor='hobbies'>Select a Hobby:</label>
        <select id='hobbies' value={selecthobby} onChange={hobbychangeHandler}>
        {Dummy_Hobbies.map((item, idx) => (
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


export default User2
