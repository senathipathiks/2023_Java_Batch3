import React, { useState } from 'react'

function ValidationForm() {
    const[inputFields,setInputFields]=useState({
        email:"",
        password:"",
        age:null
    });
    const [errors,setErrors]=useState({});
    const [submitting,setsubmitting]=useState(false);
    
    const validateValues=(inputValues)=>{
        let errors={};
        if(inputValues.email.length<15){
            errors.email="Email is too short";
        }
        if(inputValues.password.length<5){
            errors.password="password is too short";
        }
        if(!inputValues.age || inputValues.age<18){
            errors.email="Minimum is 18";
        }
        return errors;
    };
    const handleChange=(e)=>{
        setInputFields({...inputFields,[e.target.name]:e.target.value});
    };

    const handleSubmit=(event)=>{
        event.preventDefault();
        setErrors(validateValues(inputFields));
        setsubmitting(true);
    };
    return (
    <div>
      {Object.keys(errors).length==0 && submitting?(
        <span className='Success'><b>Successfully submitted &#10003;</b></span>
      ):null}
      <form onSubmit={handleSubmit}>
        <div>
            <label for="email">Email</label>
            <input type="email" name="email" value={inputFields.email} onChange={handleChange}></input>
            </div>
            <div>
            <label for="password">password</label>
            <input type="password" name="password" value={inputFields.password} onChange={handleChange}></input>
            </div>
            <div>
            <label for="age">Age</label>
            <input type="number" name="age" value={inputFields.age} onChange={handleChange}></input>
            </div>
            <br/>
            <button type="submit" >Submit information</button>
            </form>
            
            {errors.email?(
                <p className='error'>
                    Email should be atleast 15 characters long
                </p>
            ):null}
             {errors.password?(
                <p className='error'>
                    password should be atleast 5 characters long
                </p>
            ):null}
             {errors.age?(
                <p className='error'>
                    Minimum age is 18
                </p>
            ):null}
             </div>
  )
}

export default ValidationForm