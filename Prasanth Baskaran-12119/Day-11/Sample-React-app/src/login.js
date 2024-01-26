// create a login component in React js
// import react and useState hooks
import React, {useState} from 'react';
const Login = () =>{
    const [username, setUsername] = useState("");
    const [password, setPassword] = useState("");
    let submitForm = (e) => {
        e.preventDefault();
        console.log(username + " " + password);
        }
        return(
            <div>
            <form onSubmit={submitForm}></form>
            <label>UserName:
                <input type="text" value={username}
                onChange={(e)=>{setUsername(e.target.value)}}/>
                </label><br /><br />
                <label>Password:
                    <input type="password"
                    value={password}
                    onChange={(e)=>{setPassword(e.target.value)}}/>
                    </label><br /><br />
                    <input type="submit" value="Login"/>
                    </div>
                    );
                    };
                    export default Login;
    
