import React, { useState } from 'react'

export default function LoginHander() {

    const[uname,setuname] = useState('');
    const[password,setpassword] = useState('');

    const[submitted,setsubmitted] = useState(false);
    const[error1,seterror] = useState(false);

    // handler for username

    let UserHandler=(e)=>{

        setuname(e.target.value);
        setsubmitted(false);

    }

    // handler for password
    let PassHandler=(e)=>{
        setpassword(e.target.value);
        setsubmitted(false);
    }

    // handler for submitted
    let SubmitHandler= (e) =>{

        if(uname===""||password===""||password<6||password>16){
            seterror(true)
        }
        else{
            seterror(false)
            setsubmitted(true)
        }
    }

    // handler for submitted
    let submittedHandler=()=>{
        return(
            <div
            
            class="success"
            style={{
                display: submitted ? "" : "none",
            }}
            >

           
            

            <h2>Congratulations! Your account has been created.</h2>
            <h3 class="text">Logging in...Successfully</h3>
            </div>
        )

    }

    let errorHandler=()=>{
        return(
            <div
                class="error"
                style={{
                    display: error1 ? "" : "none",
                }}
            >
                <h1>Please enter all the fields</h1>
            </div>
        )

    }


  return (
    <div>

        <h1>User Login Page</h1>
        <div>
            {
               submittedHandler()

            }
            {
                errorHandler()
            }
        </div>
        <label htmlFor="uname">Enter the Username :
        <input type="text" value={uname} onChange={UserHandler}></input>
        </label>
        <br/><br/>

        <label htmlFor="password">Enter the Password :
        <input type="password" value={password} onChange={PassHandler}></input>
        </label>
        <br/><br/>
        <button type='button' className='btn btn-success' value="submit"
        onClick={SubmitHandler}>Submit</button>


      
    </div>
  )
}
