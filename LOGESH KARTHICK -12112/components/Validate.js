import React, {useState} from 'react'
import { useEffect } from 'react'

function Validate() {
    const [inputFields, setInputFields] = useState({
        email:"", password:"",age:null
    })
    const [errors, setErrors] = useState({});
    const [submitting, setSubmitting] = useState(false);

    const validateValues = (inputValues) => {
        let errors = {};
        if (!inputValues.email || inputValues.email.length < 15 ) {
            errors.email = "Email must be at least 15 characters";
    }
        if(inputValues.password.length < 5) {
            errors.password = "Password must contain at least 5 characters"
        }
        if(!inputValues.age || inputValues.age < 18){
            errors.age = "Age is required and should be above 17 years old"
        }
        return errors;
    };

    const handleChange = (e) => {
        setInputFields({ ...inputFields, [e.target.name]: e.target.value })
    };

    const handleSubmit = (event) => {
        event.preventDefault();
        setErrors(validateValues(inputFields));
        setSubmitting(true);
    };



  return (
    <div>
      {Object.keys(errors).length === 0 && submitting ? (
        <span classname="success">successfully submitted ✓</span>
      ): null}
    <form onSubmit={handleSubmit}>
        <div>
            <label for="email"> Email</label>
            <input type='email' name='email' value={inputFields.email} onChange={handleChange}></input>

        </div>
        <div>
            <label type="password">Password</label>
            <input type='password' name='password' value={inputFields.password} onChange={handleChange}></input>
        </div>
        <div>
            <label for="age"> Age</label>
            <input type='number' name='age' min="16" value={inputFields.age} onChange={handleChange}></input>
        </div>
        <button type='submit'>Submit</button>
    </form>
{errors.email ? (
    <p className='error'>
        Email should be atleast 15 characters long
    </p>
) : null}

{errors.age ? <p className='error'>Minimum age is 18</p> : null}
{errors.password ? <p className='error'> Password must be entered </p> : null}
    </div>
  )
}

export default Validate

