<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
	
	body{
		background-color: #383b4f;
		margin-top: 20px;
	}

	input{
	margin:5px;
	background-color: #a4aaba;
	border: 1px solid black;
	border-radius: 50px;
	box-shadow: 3px 3px 10px black;
	width: 50%;
	height: 50px;
	padding:5px 20px 5px 10px;
	
}
::placeholder{
color:black;
}



td{
padding-top: 30px;
color: dark;
align-content: center;

	
}

#button{
	background-color: #eeeeee;
	padding: 5px;
	border: none;
	width: 25%;
	margin-right:220px;
	font-weight: bold;	
}

#button:hover{
background-color: #dff9ba;
color: black;
}

form{
margin:30px;
margin-left:190px;
}
</style>

</head>
<body>
<br>
<br>
<br>
<br>
<br>
<form action="insertemployee" method="post" modelAttribute="bean">
<table border="0" align="center" width="40%">
	<tr><td>ID<input type="text" name="empId" placeholder="Employee ID"></td></tr>
	<tr><td>NAME<input type="text" name="empName" placeholder="Employee Name"></td></tr>
	<tr><td>SALARY<input type="text" name="empSalary" placeholder="Employee Salary"></td></tr>
	<tr><td align="center"><input type="submit" value="InsertEmployee"  id="button"></td></tr>
</table>
</form>

<% String msg = (String)request.getAttribute("msg");
if(msg !=null && msg.equals("success")){
	out.print("<h1>Record inserted Successfully</h1>");
}
	else if(msg !=null){
		out.print("<h1>Record insertion failed</h1>");
	}
%>
</body>
</html>