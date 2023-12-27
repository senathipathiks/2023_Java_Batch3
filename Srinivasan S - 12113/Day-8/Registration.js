function RegValidation(){
    var emailRegEx ='^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$'; //'[a-z0-9]+@[a-z]+\.[a-z]{2,3}$';
    var usernameRegEx ='^[a-zA-Z0-9]{5,16}$'; 
    var passwordRegEx = '^[a-zA-Z0-9!@#$%^&*]{6,16}$';
   
    var username = document.getElementById("uname").value;
    var email = document.getElementById("email").value;
    var password = document.getElementById("psw").value;
    var repeatpwd=document.getElementById("psw-repeat").value;
    if(username == ""){
        alert("User name can not be empty");
    }
    else if(username.length<5 && ! username.match(usernameRegEx)){
        alert("Enter valid username")
    }
    
    else if(email == ""){
        alert("Email can not be empty");
    }
    else if(! email.match(emailRegEx)){
        alert("Enter valid email address")
    }

    else if(password == ""){
        alert("Password is must");
    }
    else if(password.length <6 && ! password.match(passwordRegEx)){
        alert("Enter Valid Password!")
    }
    else if(password.match(repeatpwd)){
        alert("Enter match password")
    }
    else{
        alert("Regitered")
    }
}
