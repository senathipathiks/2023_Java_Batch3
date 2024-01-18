import React, { useState } from 'react'

function ValidationForm() {
    const [inputFields, setInputFields]=useState({
        Email:"",
        Password:"",
        Age:null

    });
    const [errors,setErrors]=useState({});
    const [submitting,setSubmitting]=useState(false);

    const validateValues=(inputValues)=>{
        let errors={};
        if (inputValues.email.length<15){
            errors.email="Email is too short";
        }
        if(inputValues.Password.length<5){
            errors.Password="password is too short";
        }
        if(!inputValues.age||inputValues.age<18){
           errors.age="Minimum age is 18";
        }
        return errors;
    };
    const handleChange=(e)=>{
        setInputFields({ ...inputFields,[e.target.name]:e.target.value});
    };
     const handleSubmit=(event)=>{
        event.preventDefault();
        // setErrors(validateValues(inputFields));
        setErrors(validateValues(inputFields));
        setSubmitting(true);
     };
     
  return (
    <div>
      {Object.keys(errors).length===0 && submitting?(
        <span className="success">Successfully submitted (✓) </span>
      ):null}
      <form onSubmit={handleSubmit}>
        <div>
            {/* <label htmlFor="email">Email address</label><br /> */}
            <input
            type="email"
            name="email"
            value={inputFields.email}
            onChange={handleChange}
            />
            </div>
            <div>
                <label htmlFor="password">Password</label><br />
                 <input 
                 type="password"
                 name="password"
                 value={inputFields.Password}
                 onChange={handleChange}
                 />
            </div>
            <div>
                <label htmlFor="age">Age:</label><br />
                <input
                type="number"
                name="age"
                value={inputFields.age}
                onChange={handleChange}
                /><br/>
            </div>
            <button type="submit">Submit information</button>
      </form>
      {errors.email ?(
        <p className="error">
            Email should be at least 15 characters long
        </p>
      ):null}

      {errors.password?(
        <p className="error">
            Password must contain a number and special character
            </p>
      ):null}
      
      {errors.age ? <p classname="error">Minimum age is 18</p>:null}
    </div>
  )
}

export default ValidationForm