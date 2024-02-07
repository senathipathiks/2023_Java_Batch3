import React, { useState } from 'react'

function Validationfunc() {
    const [inputValues, setInputFields] = useState({
        email : "",
        password : "",
        age : "",

    })

    const[errors, setErrors] = useState({});
    const [submiting, setSubmiting]= useState(false);

    const validatinValues = (inputValues) => {
        let errors ={};
        if(inputValues.email.length <15) {
            errors.email = "Email is too short";
        }
        if(inputValues.password.length <15) {
            errors.password = "Password is too short";
        }
        if(inputValues.age || inputValues.age > 18) {
            errors.age = "Minimum age should be 18";
        }
        return errors;
    };

    const ref = (e) => {
        setInputFields({...inputValues, [e.target.name]: e.target.value});
    }

    const refSub = (e) => {
        e.preventDefault();
        setErrors(validatinValues(inputValues));
        setSubmiting(true);
    };
  return (
    <div>
      {Object.keys(errors).length === 0 && submiting ? (
        <span className='pass'>Successfully Submitted </span>
      ) :null}

      <form onSubmit={refSub}>
        <div>
            <label for="email">Email</label>
            <input type='email' name='email' value={inputValues.email} onChange={ref}></input>
        </div>

        <div>
            <label for="password">Password</label>
            <input type='password' name='password' value={inputValues.password} onChange={ref}></input>
        </div>

        <div>
            <label for="age">Age</label>
            <input type='number' name='age' value={inputValues.age} onChange={ref}></input>
        </div>
        <button type='submit'>Submit Information</button>

      </form>

      {errors.email ? (
        <p className='error'>Email should be atleast 15 characters long</p>
      ): null}

      {errors.password ? (
        <p className='error'>Password should be atleast 15 characters long</p>
      ): null}

      {errors.age ? (
        <p className='error'>Age should be Minimum 18 years old</p>
      ): null}
    </div>
  )
}

export default Validationfunc
