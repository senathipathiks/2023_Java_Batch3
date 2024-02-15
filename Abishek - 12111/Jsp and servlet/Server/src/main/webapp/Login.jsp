<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
 
function validateform(){  
var user=document.myform.usename.value;  
var pass=document.myform.pass.value;  
  
if (user==""){  
  alert("Name can't be blank");  
  return false;  
}else if(pass.length<6){  
  alert("Password must be at least 6 characters long");  
  return false;  
  }  
}  
</script>



<form action=MyServlet1 method="Post" name= "myform" onsubmit="return validateform()"> 
UserName : <input type = "text" placeholder = "Name"  name="usename">
Password : <input type = "password" placeholder = "Password"  name="pass">
<button> SUBMIT </button>
</form>
</body>
</html>