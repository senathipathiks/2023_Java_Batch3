import React, { useState } from 'react'

function Errorfunction() {
    const [inputFields, setInputFields]=useState({
        email:"",
        password:"",
        age:null
    });
    const[errors,setErrors]=useState({});
    const[submitting,setSubmitting]=useState(false);
    const validValues=(inputValues)=>{
        let errors={};
        if(inputValues.email.length<13){
            errors.email="Email must be at least 13 characters long.";
        }
        if(inputValues.password.length<6){
            errors.password="Password must be at least 6 characters long.";
        }
        if(inputValues.age<18){
            errors.age="Age must be greater than or equal to 18.";
        }
        return errors;
    };
    const handleChange =(e)=>
    {
       setInputFields({...inputFields,[e.target.name]:e.target.value}); 
    };
    const handleSubmit =(event)=>{
        event.preventDefault();
        setErrors(validValues(inputFields));
        setSubmitting(true);
    }
  return (
    <div>
      {Object.keys(errors).length ===0 && submitting ? (<span className='success'>Successfully submitted</span>): null}
      <form onSubmit= {handleSubmit}>
        <div>
      <label htmlFor='email'>Email:</label><br/>
      <input type='text' id='email' name='email' value={inputFields.
      email} onChange={handleChange} />
      </div>
      <div>
      <label htmlFor='password'>Password:</label><br/>
      <input type='password' id='password' name='password' value={inputFields.
      password} onChange={handleChange} />
      </div>
      <div>
      <label htmlFor='age'>Age:</label><br/>
      <input type='number' id='age' name='age' value={inputFields.
      age} onChange={handleChange} />

      </div>
      <div>
        <button type='submit'>Submit</button>
      </div>


</form>
{errors.email ? (<p className='error'>Email must be at least 13 characters long</p>):null}
{errors.password ? (<p className='error'>Password must be at least 7 characters long</p>):null}
{errors.age ? (<p className='error'>Age must be greater than or equal to 18</p>):null}

    </div>
  )
}

export default Errorfunction
