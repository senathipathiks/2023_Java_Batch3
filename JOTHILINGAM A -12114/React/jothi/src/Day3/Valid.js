import React, {useState} from 'react'

function Valid() {

    const [inputFields, setInputFields] = useState({
        email:"",
        password:"",
        age:null
    });

    const [errors, setErrors] = useState({});
    const [submitting, setSubmitting] =useState(false);

    const validateValues = (inputValues)=>{
        let errors = {};
        if (inputValues.email.length<15) {
            errors.email = "Email is too short";
        }

        if(inputValues.password.length<5){
            errors.password = "Your Password is too short";

        }

        if(!inputValues.age || inputValues.age<18) {
            errors.age = "Minimum age is 18"
        }
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
      {Object.keys(errors).length === 0 && submitting?(
        <span className="success">Successfully Submitted</span>
      ):null}

      <form onSubmit={handleSubmit}>
        <div>
            <lable  for="email">Email</lable>
            <input type="email" name="email" 
            value={inputFields.email}
            onChange={handleChange}> </input>
        </div>

        <div>
            <lable  for="password">password</lable>
            <input type="password" name="password" 
            value={inputFields.password}
            onChange={handleChange}> </input>
        </div>

        <div>
            <lable  for="age">Age</lable>
            <input type="number" name="age" 
            value={inputFields.age}
            onChange={handleChange}> </input>
        </div>

            <button type="submit">Submit Information</button>
           
        </form>

        {errors.email ?(
            <p className='error'>
                Password should be atleast 5 character long
            </p>
        ):null}

        {errors.password ?(
            <p className='error'>
                Password should be atleast 5 characters long
            </p>
        ):null}

        {errors.age ? <p className='error'>Minimum age is 18</p>:null}
    </div>
  )
};

export default Valid