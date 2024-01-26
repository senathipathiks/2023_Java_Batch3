import React, { useState } from 'react'

export default function NewFormHandling() {

    const [inputFields,setinputFields]= useState({
        Uname:"",
        email:"",
        password: "",
        age :null

    });
    const [errors,setErrors] =useState({});
    const [submitting,setSubmitting] = useState(false);

    const validateValues =(inputValues)=>{
        let errors ={};

        if(inputValues.Uname.length === 0){
            errors.Uname ="Please enter value ";
        }
        if(inputValues.email.length <15){
            errors.email="Email should be at least 15 characters";
        }

        if(inputValues.password.length<5){
            errors.password= "Password must be between 8 and 16 characters"
        }
        if(!inputValues.age || inputValues.age <18){
            errors.age ="Age is required and must be above 17 years old.";
        }
        return errors;
    }

    const handleChange =(e)=>{
        setinputFields({...inputFields,[e.target.name]: e.target.value});
    }

    const handleSubmit =(e)=>{
        e.preventDefault();
        setErrors(validateValues(inputFields))
        setSubmitting(true);
    }

  return (
    <div>
        {Object.keys(errors).length === 0 && submitting ? (
            <span className='success'>Successfully Submitted</span>
        ) : null}


        <form onSubmit={handleSubmit}>
            <div>
                <label htmlFor="uname">Enter the UserName :</label>
                <input type='text' name='Uname' value={inputFields.Uname}
                onChange={handleChange}/>
            </div>

            <div>
            <label htmlFor="email">Enter the email :</label>
                <input type='email' name='email' value={inputFields.email}
                onChange={handleChange}/>


            </div>
            <div>
            <label htmlFor="age">Enter the age :</label>
                <input type='age' name='age' value={inputFields.age}
                onChange={handleChange}/>


            </div>

            <div>
            <label htmlFor="password">Enter the Password :</label>
                <input type='password' name='password' value={inputFields.password}
                onChange={handleChange}/>


            </div>

            <button type='submit'>Submit information</button>
        </form>

        {errors.email ? (
            <p className='error'>
                {errors.email}
            </p>
        ) : null}

        {errors.age ? <p className='error'>{errors.age}</p> : null}

        {errors.password ? <p className='error'>{errors.password}</p> : null}

        {errors.Uname ? <p className='error'>{errors.Uname}</p> : null}
      
    </div>
  )
}
