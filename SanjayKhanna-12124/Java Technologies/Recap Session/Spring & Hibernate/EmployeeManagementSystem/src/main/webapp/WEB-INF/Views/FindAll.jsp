<%@page import="com.ems.bean.Employee"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Find All</title>
<style type="text/css">
body{
margin-left: 400px;
margin-top: 20px;
}
table{
border: 2px solid;
text-align: center;
padding: 20px 40px;
}
tr{
margin: 30px; 
}
td{
padding:20px 0px 0px 20px;
}
</style>
</head>
<body>
<table border="2">
<tr><th>Employee Id</th><th>Employee Name</th><th>Employee Salary</th><th>Action</th></tr>
<% ArrayList<Employee> list = (ArrayList<Employee>)request.getAttribute("list");
	Employee emp1 = (Employee)request.getAttribute("bean");
	for(Employee emp : list){
		if(emp1 != null && emp1.getEmpId()==emp.getEmpId()){
			out.print("<form action=\"doEdit\" method=\"post\" modelAttribute=\"bean1\">");
			out.print("<tr>");
			out.print("<td><input type=\"text\" name=\"empId\" value=\""+emp.getEmpId()+"\" readonly></td>");
			out.print("<td><input type=\"text\" name=\"empName\" value=\""+emp.getEmpName()+"\" ></td>");
			out.print("<td><input type=\"text\" name=\"empSalary\" value=\""+emp.getEmpSalary()+"\" ></td>");
			out.print("<td><input type=\"submit\" name=\"save\" value=\"save\"><a href=\"back\"><input type=\"button\" name=\"button\" value=\"back\"></a></td>");
			out.print("</tr></form>");
		}else{
			out.print("<tr>");
			out.print("<td>"+emp.getEmpId()+"</td>");
			out.print("<td>"+emp.getEmpName()+"</td>");
			out.print("<td>"+emp.getEmpSalary()+"</td>");
			out.print("<td><a href=\"action?empId="+emp.getEmpId()+"\" ><input type=\"button\" name=\"edit\" value=\"edit\"></a><a href=\"deletenow?empId="+emp.getEmpId()+"\"><input type=\"button\" name=\"button\" value=\"delete\"></a></td>");
			out.print("</tr>");
		}
		
	}

	out.print("<form action=\"doAdd\" method=\"post\" modelAttribute=\"bean1\">");
	out.print("<tr>");
	out.print("<td><input type=\"text\" name=\"empId\"></td>");
	out.print("<td><input type=\"text\" name=\"empName\"></td>");
	out.print("<td><input type=\"text\" name=\"empSalary\" ></td>");
	out.print("<td><input type=\"submit\" name=\"button\" value=\"add\"></td>");
	out.print("</tr></form>");
%>
</table>
</body>
</html>