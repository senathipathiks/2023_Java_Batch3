import React, { useState } from 'react'

function Loginvalidation() {

    const[inputField, setInputFields]=useState({
        email:"",
        password:"",
        age:null
    });

    const[error,setErrors]=useState({});
    const[submitting,setSubmitting]=useState(false);

    const validateValues = (inputValues) => {
        let errors={};
        if (inputValues.email.length < 15){
            error.email="Email is too short";
        }

        if (inputValues.password.length < 8) {
            error.password="Password is too short";
        }

        if (!inputValues.age || inputValues.age < 18) {
            error.age ="Minimum age is 18";
        }
        return error;
    };

    const handlechange =(e)=>{
        setInputFields({...inputField, [e.target.name]: e.target.value });
    };

    const handleSubmit = (event) =>{
        event.preventDefault();
        setErrors(validateValues(inputField));
        setSubmitting(true);
    };

    return (
    <div>
        {Object.keys(error).length === 0 && submitting ? (
            <span className='success'>Successfully Submitted </span>

        ):null}

        <form onSubmit={handleSubmit}>
            <div>
                <label for="email">Email</label>
                <input
                    type='email'
                    name='email'
                    value={inputField.email}
                    onChange={handlechange} />
            </div>

            <div>
                <label for="password">Password</label>
                <input 
                    type='password'
                    name='password'
                    value={inputField.password}
                    onChange={handlechange} />
                </div>

                <div>
                <label for="age">Age</label>
                <input 
                    type='number'
                    name='age'
                    value={inputField.age}
                    onChange={handlechange} />
                    
                </div>

            <button type='submit'>Submit Information</button>            
        </form>

        {error.email? (
            <p className='error'>Email should be atleast 18 character</p>
        ):null}

        {error.password? (
            <p className='error'>Password should be atleast 8 character</p>
        ):null}

        {error.age? (
            <p className='error'>Minimum age is 18</p>
        ):null}


    </div>
  )
}


export default Loginvalidation
