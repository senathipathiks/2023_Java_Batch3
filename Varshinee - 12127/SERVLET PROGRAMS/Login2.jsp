<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script>
function Validation() {
    var userRegEx = '^[A-Za-z]\\w{5,29}$';
    var passwordRegEx = '^[a-zA-Z0-9!@#$%^&*]{6,16}$';
    var name = document.getElementById("name").value;
    var password = document.getElementById("pwd").value;
    if (name == "") {
        alert("Name can not be empty");
    } else if (password == "") {
        alert("Password is must");
    } else if (password.length < 6 && !password.match(passwordRegEx)) {
        alert("Enter Valid Password!")
    }
}
</script>
</head>
<body>
<form action="MyServlet3" method="post">
  
   <b>UserName:</b> <input type="text" name="name" id="name"> <br> <br>
   <b>Password:</b> <input type="text" name="pwd" id="pwd"> <br> <br>
   <button onclick="Validation()">Submit</button>
  
</form>
</body>
</html>