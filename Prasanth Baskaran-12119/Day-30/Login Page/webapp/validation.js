function validate(){
	
	let uname = document.getElementById("uname").value;
	let Password = document.getElementById("pass").value;
	
    var passwordRegEx = "^[a-zA-Z0-9!@#$%^&*]{6,16}$";
	
	 if (uname == "" || !isNaN(uname)) {
    alert("Name can't be blank");
    return false;
  } 
  
  else if(!Password.match(passwordRegEx)){
	  alert("enter correct password size");
	  return false;
  }
    
    else{
		alert("Login Successfully !!!")
	}
}