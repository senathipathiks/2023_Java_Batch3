import React, {useState} from 'react'

function ValidationForm() {

    const [inputFields, setInputFields] = useState({
        email: "",
        password: "",
        age:null
    });

    const [errors, setErrors] = useState({});
    const [submitting, setSubmitting] = useState(false);

    const validateValues = (inputFields) => {
        let errors = {};
        if(inputFields.email.length < 15)
            errors.email = "Email is too short";
        
        if(inputFields.password.length < 5)
            errors.password = "password is too short";
        
        if(!inputFields.age || inputFields.age < 18)
            errors.age = "Minimum age is 18";
        
        return errors;
    };

    const handleChange = (e) => {
        setInputFields({...inputFields, [e.target.name]: e.target.value});
    };

    const handleSubmit = (event) => {
        event.preventDefault();
        setErrors(validateValues(inputFields));
        setSubmitting(true);
    };

  return (
    <div>
      {Object.keys(errors).length === 0 && submitting? (
        <span className='succes'>Successfully submitted</span>
      ):null}

        <form onSubmit={handleSubmit}>
            
            <label htmlFor="email" >Email</label>
            <input type="email" onChange={handleChange} name="email" value = {inputFields.email}></input>
            <br></br>
            <label htmlFor="password" >Password</label>
            <input type="password" onChange={handleChange} name = "password" value = {inputFields.password}></input>
            <br></br>
            <label htmlFor="Age" >Age</label>
            <input type="number" onChange={handleChange} name="age" value = {inputFields.age}></input>
            <br></br>
            
            <button type="submit">Submt Information</button>

        </form> 

        {errors.email ? (<p className='error'>MAIL Should be at least 15 characters long</p>) : null}
        {errors.password ? (<p className='error'>Password Should be at least 5 characters long</p>) : null}
        {errors.age ? (<p className='error'>Minimum age is 18</p>) : null}
        </div>
  );
}
export default ValidationForm

