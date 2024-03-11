<%@page import="com.ems.bean.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<style>
h1{
background-color: lime;

}
table{
font-weight: bold;
background-color: silver;
margin:auto;
margin-bottom:50px;

}
td{
padding:20px;
}
input{
padding:10px;
border-radius:20px;
}
</style>
</head>
<body>
<h1>Employee List</h1>

<%

List<Employee> list = (List<Employee>) request.getAttribute("EmpList");

	out.print
	("<br><br><br><br>"+
	"<table border=2 width=80% >"+
	"<thead>"+
	"<tr>"+
	"<td>Employee ID</td>"+
	"<td>Employee Name</td>"+
	"<td>Employee Age</td>"+
	"<td>Action</td>"+
	"<td>Delete</td>"+
	"</tr>");
	for(Employee emp : list){
		
	out.print("<tr><form action='EMSController' method='post'>"+
	"<td><input type='text' name='empid' value='"+emp.getEmpid()+"' readonly='readonly'>"+"</td>"+
	"<td><input type='text' name='empname' value='"+emp.getEmpname()+"' >"+"</td>"+
	"<td><input type='text' name='empsalary' value='"+emp.getEmpsalary()+"' >"+"</td>"+
	"<td><input type='submit' value='Save/Edit' name='emsAction' class='btn btn-success'>"+"</td>"+
	"<td><input type='submit' value='Remove' name='emsAction' class='btn btn-danger'>"+"</td>"+
	"</tr></form>");
	}
	out.print(
	"<tr><form action='EMSController' method='post'>"+
	"<td><input type='text' name='empid' placeholder='EmpID' >"+"</td>"+	
	"<td><input type='text' name='empname' placeholder='EmpName' >"+"</td>"+	
	"<td><input type='text' name='empsalary' placeholder='EmpSalary' >"+"</td>"+	
    "<td><input type='submit' value='Save' name='emsAction' class='btn btn-warning'>"+"</td>"+
	"</tr></form>"+
	"</thead>"+
	"</table>"
	);

%>

</body>
</html>