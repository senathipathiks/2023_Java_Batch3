import React, { useState } from 'react';
import './MyStyle.css';

function MyLogin() {
    const [username, setUsername] = useState('');
    const [password, setPassword] = useState('');

    function validate(){
        let emailRegExp = /^[a-z0-9]+@[a-z]+\.[a-z]{2,3}$/;
        let passRegExp = /^[a-zA-z0-9@.$#]{8,20}$/;

        if(username === "" || password === ""){
            alert("Username or Password cannot be empty");}
            else if(!emailRegExp.test(username)){
                alert(`Email is not valid`); }
                else if (!passRegExp.test(password)) {
                    alert(`Password should contain minimum 8 characters and maximum 20 characters\nIt should also include at least one uppercase letter,one lowercase letter,\na digit,and one special character.`);
                    }else{alert("Login Successful");
                window.open("http://www.google.com")}
        }
    return (
        <div class='Form'>
            <center>
            <table>
                <tr>
                    <td><label htmlFor="username">Username:</label></td>
                    <td><input type="email" name="username" id="username" value={username} onChange={e => setUsername(e.target.value)} placeholder='Enter your Email ID'/></td>
                </tr>
                <tr>
                <td><label htmlFor="Password">Password:</label></td>
                <td><input type="password" id="Password" value={password} onChange={e => setPassword(e.target.value)} placeholder='Enter your Password'/></td>
                </tr>
                <tr>
                    <td colSpan={2}>
                        <button onClick={() => validate()}>Click to Login</button>
                    </td>
                </tr>
            </table>
            </center>
        </div>
    );
}

export default MyLogin;