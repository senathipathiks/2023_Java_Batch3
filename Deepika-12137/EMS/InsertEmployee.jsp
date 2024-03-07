<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<form action="EMSController" method="post">
<table border="0" align="center" width="40%">
	<tr><td><input type="text" name="eid" placeholder="Employee ID"></td></tr>
	<tr><td><input type="text" name="ename" placeholder="Employee Name"></td></tr>
	<tr><td><input type="text" name="esalary" placeholder="Employee Salary"></td></tr>
	<tr><td align="center"><input type="submit" value="InsertEmployee" name="emsAction" id="button"></td></tr>
</table>
</form>

<%
String result=request.getParameter("msg");
if(result != null){
	out.print("<center><font color=green><b>"+result+"</b></font></center>");
}
%>

</body>
</html>