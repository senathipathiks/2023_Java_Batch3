<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%@ page isELIgnored="false" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="Returnform">
 
<lable for="name">User Name </lable><br>
<input type="text" Placeholder="User Name" name="userName" /><br><br>
 
<lable for="password">Password</lable><br>
<input type="text" Placeholder="Password" name="password" /><br><br>
 
<input type="submit" value="Insert" />
</form>
 
<%
 
String msg = (String) request.getAttribute("msg");
if(msg!=null){
	if(msg.equals("Success")){
		out.print("<h1>Login Successfull</h1>");
	}
	else{
		out.print("<h1>Invalid Username or Password</h1>");
	}
}
 
%>
</body>
</html>