import React, { useState } from 'react'

const Dummy_hobbies =[
    "swimming",
    "criket",
    "football",
    "chess"


];
export default function JsonForm() {
const [enterUname, setUsername] = useState('')
const[enterAge,setAge] = useState('')
const [enterHobby, setHobby]=useState("swimming")

let userHandler =(e)=>{
    
    setUsername(e.target.value);
}

let ageHandler=(e)=> {
    setAge (e.target.value);
}

let hobbyHandler =(e)=>{
    setHobby (e.target.value)
}

let submitHandler=(e)=>{
    e.preventDefault();

    //username stored in object

    const user ={
        username: enterUname,
        age : enterAge,
        hobby : enterHobby
    };

    alert(JSON.stringify(user));

}

  return (
    <div>

        <form onSubmit={submitHandler}>
        <label htmlFor='username'>Enter the User Name :</label>
        <input type="text" id='username' value={enterUname} onChange={userHandler}>

        </input>
        <br></br><br></br>
        
        <label htmlFor='age'>Enter your Age :</label>
        <input type="number" id='age' min="18" max="90" value={enterAge} 
        onChange={ageHandler}/> 
        <br></br><br></br>

        <label htmlFor='hobbies'>Select the Hobbies :</label>
        <select name='hobbies' id='hobbies' value={enterHobby}
        onChange={hobbyHandler}> 

        {Dummy_hobbies.map((item,idx)=>(<option key={idx} value={item}>
            {item}
        </option>))}
        </select>
        <br></br><br></br>

        <button type="submit">Add user</button>

        </form>
        
      
    </div>
  )
}
