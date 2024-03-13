<%@page import="com.ems.bean.Employee"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update page</title>
<style type="text/css">
td{
padding: 18px 36px;
}

input {
	height: 40px;
	width: 300px;
	border-radius: 10px;
	font-size: 24px;
}
body{
font-size: 24px;
margin-left: 320px
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
	width: 250px;
	font-size: 24px;
}
</style>
</head>
<body>
<table>
<tr><td>Select Employee Id </td><td>
<form action="Fetch" method="post" modelAttribute="bean">
<select name="empId" class="select">
<% ArrayList<Integer> list = (ArrayList<Integer>)request.getAttribute("key");
 for(Integer i : list){
	 %>
	 <option value="<%=i%>"><%=i%></option>
	 <%}%>
</select><input type="submit" value="Fetch" name="button"/>
</form></td></tr>
<form action="updateemployee" method="post" modelAttribute="bean">
<% Employee emp = (Employee)request.getAttribute("bean"); 
if(emp != null){
%>
<tr><td>Enter Employee Id </td><td><input type="text" name="empId" value="<%=emp.getEmpId() %>"  readonly/></td></tr>	
<tr><td>Enter Employee Name </td><td><input type="text" name="empName" value="<%=emp.getEmpName() %>" /></td></tr>
<tr><td>Enter Employee Salary </td><td><input type="text" name="empSalary" value="<%=emp.getEmpSalary() %>" /></td></tr>
<tr><td colspan="2" algin="right"><input type="submit" class="button" value="Update" name="button" /></td></tr>
<%}else{ %>
<tr><td>Enter Employee Name </td><td><input type="text" name="empName" /></td></tr>
<tr><td>Enter Employee Salary </td><td><input type="text" name="empSalary" /></td></tr>
<tr><td colspan="2" algin="right"><input type="submit" class="button" value="Update" name="button" /></td></tr>
<%} %>
</form>
</table>
<% String msg = (String)request.getAttribute("msg");
if(msg != null ){
	out.print("<h1>"+msg+"</h1>");
}
%>
</body>
</html>