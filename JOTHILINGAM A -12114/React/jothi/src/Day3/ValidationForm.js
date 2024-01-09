import React, { useState } from 'react'

function ValidationForm() {
    const[inputFields,setInputFields ] = useState({
        email: "",
        password:"",
        age: null
    });

    const [errors , seterrors]= useState({ });
    const [Submitting , setSubmitting] =useState(false);

    const validateValues =(inputvalues) =>{
        let errors={};
        if(inputvalues.email <15){
            errors.email="Email should be at least 15 characters";
        }
        if(inputvalues.password.length < 5){
            errors.password= "Password must be at least 5 characters" ;
        }
        if(!inputvalues.age || inputvalues.age <18){
            errors.age ="Age is required and should be above 18 years"
        }
        return errors;
    };

    const handlechange =(event) =>{
        setInputFields({...inputFields,[event.target.name] : event.target.value});
    };

    const handlesubmit = (event) =>{
        event.preventDefault();
        seterrors(validateValues(inputFields));
        setSubmitting(true);
    };




  return (
    <div>
        {Object.keys(errors).length ==0 && Submitting ? (
            <span className='success'>success</span>

        ):null }
      <form onSubmit={handlesubmit}>
        
        <div>
            <label for="email">Email</label>
            <input type="email" name="email" value={inputFields.email} onChange={handlechange}></input><br/>

            <label for="password">password</label>
            <input type="password" name="password" value={inputFields.password} onChange={handlechange}></input><br/>

            <label for="age">age</label>
            <input type="number" name="age" min="16" value={inputFields.age} onChange={handlechange}></input><br/>
        </div>
        <button type='submit'>Submit !!</button>




      </form>
      {errors.email ?(
        <p className='error'> Email should be at least 15 characters</p>
      ):null}

{errors.password ?(
        <p className='error'>Password must be at least 5 characters</p>
      ):null}

{errors.age ?(
        <p className='error'>Age is required and should be above 18 years</p>
      ):null}
    </div>
  )
}

export default ValidationForm
