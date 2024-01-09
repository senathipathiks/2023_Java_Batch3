import React, { useState } from 'react'

function Validform() {

    const [inputFields, setInputFields] = useState({
        username: '',
        password: '',
        age:null
    });

    const [errors,setErrors] = useState({});
    const [submitting,setSubmitting] = useState(false);

    const validateValues = (inputValues) =>{
        let errors = {};
        if (inputValues.email.length<15){
            errors.email = 'Email should be atleast 15 characters';
        }
        if(inputValues.password.length < 5){
            errors.password =  "Password is too short"
        }
        if(!inputValues.age || inputValues.age < 18){
            errors.age = "Age should be atleast 18";
        }
        return errors;
    }

    const handleChange = (e) =>{
        setInputFields({...inputFields,[e.target.name]:e.target.value});
    }
    const handleSubmit = (event) =>{
        event.preventDefault();
        setErrors(validateValues(inputFields))
        setSubmitting(true);
    }
  return (
    <div>
        {Object.keys(errors).length ===0 && submitting ? (
            <span className='success'>Successfully submitted !!</span>
        ) : null }

        <form onSubmit={handleSubmit}>
            <div>
                <label htmlFor='email'>Email</label>
                <input
                type='eamil'
                name='email'
                value={inputFields.email}
                onChange={handleChange}
                ></input>
            </div>
            <div>
                <label htmlFor='password'>Password</label>
                <input
                type='password'
                name='password'
                value={inputFields.password}
                onChange={handleChange}
                ></input>
            </div>
            <div>
                <label htmlFor='age'>Age</label>
                <input
                type='number'
                name='age'
                value={inputFields.age}
                onChange={handleChange}
                ></input>
            </div>
            <button type="submit">Submit information</button>
        </form>
      {errors.email ? (
        <p className='errors'>
            Email should be at least 15 character long
        </p>
      ) : null}
      {errors.password? (
        <p className='errors'>
            Password should be at least 5 character long
        </p>
      ) : null}
      {errors.age? (
        <p className='errors'>
            Age should be atleast 18
        </p>
      ) : null}
    </div>
  )
}

export default Validform
