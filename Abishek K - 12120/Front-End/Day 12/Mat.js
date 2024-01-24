import React, { useState } from 'react'
import { Button, TextField } from '@mui/material';
import { useForm } from "react-hook-form"
import "./Style.css"



function Mat() {
  const {register,handleSubmit,formState:{errors}} = useForm();
  const [value,setValue] = useState();
  const onSubmit = (data) => {
    setValue(data)
    console.log(data)
  }
  console.log(errors)
  

  return (
    <div id='form'>
    <pre>{JSON.stringify(value)}</pre>
        <div id='fcont'>
        <h1>Login Form</h1>
        <form onSubmit={handleSubmit(onSubmit)}>
          <label htmlFor='name'>Name:</label><br></br>
          <input type='text' {...register("name", {required:"username is required"})} ></input><br></br><br></br>
          {errors.name && <p className='war'>{errors.name.message}</p>}
          <label htmlFor='email'>Email:</label><br></br>
          <input type='email' {...register("email",{required:"Email is required", pattern:{value:/^[^@ ]+@[^@ ]+\.[^@ .]{2,}$/, message:"Email is not valid"}})}></input><br></br><br></br>
          {errors.email && <p className='war'>{errors.email.message}</p>}
          
          <label htmlFor='password'>Password:</label><br></br>
          <input type='password' {...register("password", {required:"Password is required", minLength:{value:8, message:"Password must be atleast 8 characters"}})}></input><br></br><br></br>
          {errors.password && <p className='war'>{errors.password.message}</p>}
          <input type='submit' value='submit'></input>
         
        </form> 
        </div>
      
    </div>
  )
}

export default Mat
