import React, { useState } from 'react'
import { useNavigate,Link } from 'react-router-dom';

const Registration = () => {
    let navigate=useNavigate();
    const [formData,SetFormData]=useState({
        username:'',
        email:'',
        password:'',
        ConfirmPassword:''
    })

    const[errors,setErrors]=useState({})

    const handleChange =(e)=>{
        const{name,value}=e.target;
        SetFormData({
            ...formData,[name]:value
    })
    }
    const handleSubmit=(e)=>{
        e.preventDefault()  
        const ValidationErrors={}
        if(!formData.username.trim()){
            ValidationErrors.username="Username is required"
        }
        if(!formData.email.trim()){
            ValidationErrors.email="email is required"
        }
        else if(!/\S+@\S+\.\S+/.test(formData.email)){
            ValidationErrors.email="Email should be valid"
        }
        if(!formData.password.trim()){
            ValidationErrors.password="password is required"
        }else if(formData.password.length >= 6){
            ValidationErrors.password="password must not  be exceed  6 characters long"
        }
        if(formData.ConfirmPassword!== formData.password){
            ValidationErrors.ConfirmPassword="Passwords do not match"
        }
        setErrors(ValidationErrors)
       // console.log(ValidationErrors);
       if(Object.keys(ValidationErrors).length===0){
        alert("form  submitted successfully")
        navigate('/home')

       }
       }

    
  return (

    <div className='container '
    id='Card'>
        <div className='row'> 
        <div className="col-md-6 offset-md-3 border rounded p-4 mt-4 shadow dark ">
            <h2 className='text-center m-4' ><b className='.text-danger'> ADMIN REGISTRATION</b></h2>
   
    <form onSubmit={handleSubmit}>
    <div className='mb-3'>
        <label>Username:</label>
        <input type='text'
         name='username'
         placeholder='enter username'
         autoComplete='off'
         onChange={handleChange}/>
         {errors.username && <span>{errors.username}</span> }
         </div>
         <div className='mb-3'>
         <label>Email:</label>
        <input type='email'
         name='email'
         placeholder='kp@gmail.com'
         autoComplete='off'
         onChange={handleChange}/>
         {errors.email && <span>{errors.email}</span> }

         </div>
         <div className='mb-3'>
         <label>Password:</label>
        <input type='password'
         name='password'
         placeholder='*******'
         onChange={handleChange}
         />
       {errors.password && <span>{errors.password}</span> }

         </div>
         <div className='mb-3'>
         <label>Confirm Password:</label>
        <input type=' Confirm password'
         name='ConfirmPassword'
         placeholder='*******'
         onChange={handleChange}
         />
        {errors.ConfirmPassword && <span>{errors.ConfirmPassword}</span> }

         </div>
            
         <button type='submit' className='btn btn-info'  >Submit</button>
         <Link type='submit' className='btn btn-danger mx-2' to="/home">CANCEL</Link>

        



    </form>
    </div>
    </div>
    </div>
    
  );
};
export default Registration
