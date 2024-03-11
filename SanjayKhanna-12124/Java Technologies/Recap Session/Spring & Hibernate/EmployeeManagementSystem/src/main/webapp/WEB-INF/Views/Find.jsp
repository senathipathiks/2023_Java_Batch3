<%@page import="com.ems.bean.Employee"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search page</title>
<style type="text/css">

table{
border: 3px double;
width: 500px;
height: auto;
}

body{
font-size: 24px;
margin-left: 400px
}

input {
	height: 40px;
	width: 300px;
	border-radius: 10px;
	font-size: 24px;
}
.button{
border:none;
background-color: gray;
color: black;
font-size: 30px;
margin-left: 300px
}

.button:hover {
	background-color: blue;
	color:red;
}
.select{
	height: 40px;
	width: 300px;
	font-size: 24px;
}
</style>
</head>
<body>
<form action="findemployee" method="post" modelAttribute="bean">
<table>
<tr><td>Select Employee Id </td><td><select name="empId" class="select">
<option value="-1" selected >Choose</option>
<% ArrayList<Integer> list = (ArrayList<Integer>)request.getAttribute("key");
 for(Integer i : list){
	 %>
	 <option value="<%=i%>"><%=i%></option>
	 <%}%>
</select></td></tr>
<tr><td colspan="2" algin="right"><input type="submit" class="button" value="Search" name="button" /></td></tr>
</table>
</form>
<% Employee emp = (Employee)request.getAttribute("bean"); 
	if(emp != null){
%>
<table border="2">
<tr><th>Employee Id</th><th>Employee Name</th><th>Employee Salary</th></tr>
<tr><td><%=emp.getEmpId()%></td><td><%=emp.getEmpName()%></td><td><%=emp.getEmpSalary()%></td></tr>
</table>
<%}else{
	String msg = (String)request.getAttribute("msg");
	if(msg != null){
		out.print("<h1>"+msg+"</h1>");
	}
}
%>
</body>
</html>