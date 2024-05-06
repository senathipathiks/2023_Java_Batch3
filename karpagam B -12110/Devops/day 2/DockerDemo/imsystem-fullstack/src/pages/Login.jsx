import React, { useState } from 'react'
import { useNavigate,Link} from 'react-router-dom';
import "bootstrap/dist/css/bootstrap.min.css";

const Login = () => {
    let navigate=useNavigate();
    const [formData,SetFormData]=useState({
        username:'',
        password:'',
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
      
        if(!formData.password.trim()){
            ValidationErrors.password="password is required"
        }else if(formData.password.length >= 6){
            ValidationErrors.password="password must not  be exceed  6 characters long"
        }
       
        setErrors(ValidationErrors)
    //console.log(ValidationErrors);

       if(Object.keys(ValidationErrors).length===0){
       

            // alert("form submitted successfully !!")
            
                           navigate('/home')
                        }
       }

       
return (


    <><div>
          <nav className="navbar navbar-expand-lg navbar-dark bg-secondary"
              id='navbar-custom-i'>
              <div className="container-fluid">
                  <Link className="navbar-brand" to={"/"}><h4><i><b>ONLINE PET SHOP</b></i></h4></Link>
                  
                
              </div>
          </nav>
      </div>
      <div className='container '
          id='Card'>
              <div className='row'>
                  <div className="col-md-6 offset-md-3 border rounded p-4 mt-4 shadow dark ">
                      <h2 className='text-center m-4'><b className='.text-danger'> ADMIN LOGIN</b></h2>

                      <form onSubmit={handleSubmit} >
                          <div className='mb-3'>
                              <label role='users'>Username:</label>
                              <input type='text'
                                  name='username'
                                  placeholder='enter username'
                                  className='user'
                                  autoComplete='off'
                                  onChange={handleChange} />
                              {errors.username && <span>{errors.username}</span>}
                          </div>

                          <div className='mb-3'>
                              <label>Password:</label>
                              <input type='password'
                                  name='password'
                                  className='pass'

                                  placeholder='*******'
                                  onChange={handleChange} />
                              {errors.password && <span>{errors.password}</span>}
                              

                          </div>
                          <button type="submit" className="btn btn-primary" data-toggle="modal" data-target=".bd-example-modal-sm" id="submit">Login</button>

              

                         </form></div>
              </div>
          </div></>
    
  );
};
export default Login
 