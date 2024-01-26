import React, { useState } from 'react'

export default function Myform() {
    const [name,setName]= useState('');
    const [date,setdate]= useState('');
    const [password,setpassword]= useState('');
    // const [submit,setsubmit]= useState('');

   let validation=()=>{
    
    var passwordRegEx = '^[a-zA-Z0-9!@#$%^&*]{6,16}$';

    if(name==="" || date ===""|| password === "" ||!isNaN(name,date,password)){
        alert("Please fill out all fields")
        return false
    }
    else if (password.length<6 || password.length> 16){
        alert("Password must be between 6 and 16 characters")
        return false
    }
    else if(!new RegExp(passwordRegEx).test(password)) {
        alert("Invalid Password!");
        return false;
    }else{
        return true;
    }   
   }

   let submition = ()=>{
    if(!validation()){
        alert("Invalid Details")
    }
    else {
        alert("Login sucessfully")
    }
}


  return (
    <div>
      <form>
        <table>
            <tr>
                <td>
      <label >
           Enter the name :
           <input type="text" 
           value={name}
           onChange={(e)=>{setName(e.target.value)}}/>
      </label>
      </td>
      </tr>


      <tr>
                <td>
      <label >
           Date of Birth:
           <input type="date" 
           value={date}
           onChange={(e)=>{setdate(e.target.value)}}/>
      </label>
      </td>
      </tr>

      <tr>
                <td>
      <label >
           Password:
           <input type="password" 
           value={password}
           onChange={(e)=>{setpassword(e.target.value)}}/>
      </label>
      </td>
      </tr>


      <tr>
                <td>
      <label >
           Conform Password:
           <input type="password" 
           value={password}
           />
      </label>
      </td>
      </tr>

      <tr>
                <td>
                    
      <button type="submit" value='submit'className='btn bg-info '
       onClick={(e)=>{e.preventDefault();
        submition();
     
       }}>Submit</button>
      </td>
      </tr>
      </table>

      
    </form>
    </div>
  )
}
