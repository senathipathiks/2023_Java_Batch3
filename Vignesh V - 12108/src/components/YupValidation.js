import { userValidation } from "./Youtube";
import React from "react";


function YupValidatio(){
    const createUser=async(Event)=>{
        Event.preventDefault();
        let formData={
            name:Event.target[0].value,
            mail:Event.target[1].value,
            password:Event.target[2].value,

        }
        console.log(formData)
        const isvalid=userValidation.isvalid(formData)
    }
    return(

        <div className="container">
        <form className="form"onSubmit={createUser}>
        <label htmlFor='name'>Name</label><br/>
        <input type="text" id='name' name='name' placeholder='Enter your Name'/>
        <input type="text" id='mail' name='mail' placeholder='Enter your mail'/>
       < input type="text" id='password' name='password' placeholder='Enter your password'/>
        </form>
        </div>
    )
}

export default YupValidation