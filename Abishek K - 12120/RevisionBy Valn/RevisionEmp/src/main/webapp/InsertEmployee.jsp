<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
td{
height:30px;
}
input{
border-radius: 20px;
height:40px;
width:300px;
}
.button{
border:none;
background-color:green;
color:white;
font-weight:bold;
cursor:pointer;
}

</style>
</head>
<body>
<form action="EMSController" method="post">
<table width="80%" align="center" border="0">
<tr><td>Employee ID</td><td><input type="text" name="empid" /></td></tr>
<tr><td>Employee Name</td><td><input type="text" name="empname" /></td></tr>
<tr><td>Employee Salary</td><td><input type="text" name="empsalary" /></td></tr>
<tr><td colspan="2" align="center" ><input type="submit" value="Insert" class="button" name="emsAction" /></td></tr>

</table>
</form>

<br>
<%
String result = request.getParameter("msg");
if(result!=null){
	
	out.print("<center><font color=green><b>"+result+"</b></font></center>");
}
%>

</body>
</html>