import react from 'react'

export default function Mylogin(){
    return(<div id="login">
        <form>
            <label for="email">Email:</label><br/>
            <input type="text" id="email"/><br/>
            <label for="password">Password:</label><br/>
            <input type="password" id="password"/><br/>
            <input type="submit"id="button" value= "Login"/>
            
            </form>
        
    </div>
    )
}