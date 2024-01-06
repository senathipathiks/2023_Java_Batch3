import React, { useState } from 'react';

function ValidationForm() {
    const [inputFields , setInputFields] = useState({
        email: "",
        password: "",
        age: null
    });

    const [errors , setErrors] = useState({});
    const [flag , setFlag] = useState(false);

    const validate = (inputFields) =>{
        let err = {};
        if(inputFields.email.length<8)
        err.email = "Email must be at least 8 characters long.";
        
        if(inputFields.password.length<8)
        err.password = "Password must be at least 8 characters long.";
        
        if(!inputFields.age || inputFields.age<18)
        err.age="Age should not be empty and should be above 18.";
        
        return err;
    }

    const handleChange = (e) =>{
        setInputFields({...inputFields, [e.target.name]: e.target.value});
    }

    const handleSubmit = (e) => {
        e.preventDefault();
        setErrors(validate(inputFields));
        setFlag(true);
    }
    return (
        <div>
            {Object.keys(errors).length===0 && flag ? (<span className='success'>Successfully Submitted</span>) : null}
            <form onSubmit={handleSubmit}>
            <table>
                    <tr>
                        <td><label htmlFor="email">Email : </label></td>
                        <td><input type="email" id="email" name='email' onChange={handleChange} value={inputFields.email}/></td>
                    </tr>
                    <tr>
                        <td><label htmlFor="password">Password : </label></td>
                        <td><input type="password" id="password" name='password' onChange={handleChange} value={inputFields.password}/></td>
                    </tr>
                    <tr>
                        <td><label htmlFor="age">Age : </label></td>
                        <td><input type="age" id="age" name='age' onChange={handleChange}  value={inputFields.age}/></td>
                    </tr>
                    <tr>
                        <td colSpan="2"><button type="submit">Add User</button></td>
                    </tr>
                </table>
            </form>
            {errors.email ?(<p className="error">{errors.email}</p>):null}
            {errors.password ?(<p className="error">{errors.password}</p>):null}
            {errors.age ?(<p className="error">{errors.age}</p>):null}
        </div>
    );
}
export default ValidationForm;