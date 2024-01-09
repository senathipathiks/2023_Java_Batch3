import React, { useState } from "react";

const hobbyList = [
    "Select Hobby",
    "Sport",
    "Reading",
    "Coding",
    "Swimming",
    "Cycling",
    "Singing",
    "Dancing"
];

const User = () =>{
    const [name,setName] = useState("");
    const [age, setAge] = useState(0);
    const [hobby, setHobbies]=useState("Select Hobby");

    const nameChangeHandler = (e) =>{
        setName(e.target.value);
    }

    const ageChangeHandler = (e) =>{
        setAge(e.target.value);
    }

    const hobbyChangeHandler = (e) =>{
        setHobbies(e.target.value);
    }

    const submitHandler = (e) =>{
        e.preventDefault();
        const val = {
            username : name,
            age: age,
            hobby: hobby
        }
        alert(JSON.stringify(val));
    }

    return(
        <div>
            <form onSubmit={submitHandler}>
                <table>
                    <tr>
                        <td><label htmlFor="name">Name : </label></td>
                        <td><input type="text" id="name" value={name}  onChange={nameChangeHandler}/></td>
                    </tr>
                    <tr>
                        <td><label htmlFor="age">Age : </label></td>
                        <td><input type="number" id="age" value={age} onChange={ageChangeHandler}/></td>
                    </tr>
                    <tr>
                        <td><label htmlFor="hobby">Hobby : </label></td>
                        <td>
                            <select id="hobby" value={hobby} onChange={hobbyChangeHandler}>
                                {hobbyList.map((value,index) =>(
                                    <option key={index} value={value}>{value}</option>
                                ))}
                            </select>   
                        </td>
                    </tr>
                    <tr>
                        <td colSpan="2"><button type="submit">Add User</button></td>
                    </tr>
                </table>
            </form>
        </div>
    );
}
export default User;