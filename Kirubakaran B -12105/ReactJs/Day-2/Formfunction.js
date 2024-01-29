import React, { useState } from 'react'
import "./Myclassapp.css"
export default function Formfunction() {
    const[name,setname]=useState("");
    const[email,setemail]=useState("");
    const[password,setPassword]=useState("");

    let valid=()=>{
        if(name.length===0||email.length===0||password.length===0
            ||!email.includes('@')||!/[.]/.test(email)) return false
            else return true;
            };
        let submit=()=>{
            
                if(!valid()) alert("Invalid Details!");
                else
                alert("Registered Successfully")
            }
        
               
    
  return (
    <div>
        <center>
      <form>
        <h1>Login page </h1>
        <label htmlFor="name">Name:</label>
        <input type="text" id="name" name="name" value={name} onChange={(event)=>{
            setname(
                event.target.value
            )
            }}/><br /><br />
        <label htmlFor="email">Email:</label>
        <input type="email" id="email" name="email"   value={email} onChange={(event)=>{
           
           setemail(
               event.target.value
               )
               }}/><br /><br />
               <label htmlFor="passwor">Password:</label>
               <input type="password" id="pass" value={password} onChange={(event)=>{
               
               setPassword(
                event.target.value
                )
               }}/><br /><br />
        <input type="submit" value="submit"  onClick={(event)=>{
            event.preventDefault();
            submit()}}/>

        </form>
        </center>
    </div>
  )
}
