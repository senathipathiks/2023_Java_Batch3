<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
a{
text-decoration:none;
color:white;


}
th{
heigh:30px;
}
input 
{
height : 30px;
width:300px;
border-radius:5px;
}
.button
{
border : none;
background-color: blue;
color: white;
font-weight: bold;
}

</style>
</head>
<body>
<form action="EMSController" method="post">
<table width=80% align ="center" border="0">
<tr><td>Employee Id</td><td><input type="text" name="id"/></td></tr>
<tr><td>Employee Name</td><td><input type="text" name="name"/></td></tr>
<tr><td>Employee Salary</td><td><input type="text" name="salary"/></td></tr>
<tr><td><colsapan="2" align="center"/></td><td><input class="button" type="submit" name="emsbtn" value="Insert Employee"/></td></tr>
</table>
</form>
<br>
<%
String result = request.getParameter("msg");
if(result != null)
{
	out.print("<font color = green><b>"+result+"</b></font>");
}
%>
</body>
</html>