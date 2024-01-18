import React, {useState} from 'react'


function ValidationForm() {
    const[inputFields, setInputFields] = useState({
        email:"",
        password: "",
        age:null
    });

    const [errors,setErrors] = useState({});
    const [submitting, setSubmitting] = useState(false);

    const validateValues = (inputValues) => {
        let errors = {};
        if (inputValues.email.length < 15){
            errors.email = "Email is too short" ;
        }
        if (inputValues.password.length < 7) {
            errors.password = "Password is too short";
        }
        if (inputValues.age || inputValues.age < 18) {  
            errors.age = "Age must be greater than or equal to 18";
        }
        return errors;
    };

    const handleChange = (e) => {
        setInputFields({
            ...inputFields, [e.target.name] : e.target.value
        });
    };
    const handleSubmit = (event) =>{
        event.preventDefault();
        setErrors(validateValues(inputFields));
        setSubmitting(true);
    };

  return (
    <div>
     {Object.keys(errors).length === 0 && submitting ?(
        <span classname="success">Successfully Submitted</span>
     ): null}
     <form onSubmit={handleSubmit}>
        <div>
            <label for="email">Email</label>
            <input type="email" name="email" value={inputFields.email} onChange={handleChange}></input>
        </div>
        <div>
            <label for="password">Password</label>
            <input type="password" name="password" value={inputFields.password} onChange={handleChange}></input>
        </div>
        <div>
            <label for="age">Age</label>
            <input type="number" name="age" min="16" value={inputFields.age} onChange={handleChange}></input>
        </div>

        <button type='submit'>Submit !!</button>
        </form>
        {errors.email ?(
            <p className='error'>
                Email should be atleast 15 characters long !       
            </p>
        ):null}
        {errors.password ?(
            <p className='error'>
                Password should be atleast 7 characters long !       
            </p>
        ):null}
        {errors.age ?
            <p className='error'>
                Age should be atleast 18 !       
            </p>
        :null}
        

    </div>
  )
}

export default ValidationForm
