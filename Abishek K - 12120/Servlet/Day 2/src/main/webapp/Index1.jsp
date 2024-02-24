<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="Valid">
        <label for="uname">Enter Your Username</label><br>
        <input type="text" id="uname" name="username"><br><br>
        <label for="pword">Enter Your Password</label><br><br>
        <input type="password" id="pword" name="passowrd"><br><br>
        <button onclick="validate()">Submit</button>
    </form>
    
    <script>
       function validate(){
        var username = document.getElementById( "uname" ).value;
        var password = document.getElementById("pword").value; 
        

        if(username == ""){
            alert("Username is required");
       }
        if(password == ""){
        	alert("Password is required");
        }
       

    }
    </script>


</body>
</html>