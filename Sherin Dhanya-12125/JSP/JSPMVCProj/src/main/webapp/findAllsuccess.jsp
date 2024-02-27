<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.emp.bean.Employee" %>
    <%@page import="java.util.LinkedList" %>
    <%@include file="find1.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<% 
LinkedList<Employee> Emp=(LinkedList<Employee>)request.getAttribute("bean");
out.write("<font size =5px color=green><table align=center border=1>"
		+"<tr>"
		+"<th> emp ID </th>"
		+"<th> emp Name </th>"
		+"<th> emp City </th>"
		+"<th> emp Phoneno </th>"
		+"<th> emp Department </th>"
		+"</tr>");
		for (Employee e:Emp)
		out.print(
		"<tr>"
		+"<td>"+e.getId()+" </td>"
	    +"<td>"+e.getName()+" </td>"
	    +"<td>"+e.getCity()+" </td>"
	    +"<td>"+e.getPhoneno()+" </td>"
	    +"<td>"+e.getDepartment()+" </td>"
	    +"</tr>");
	    out.print("</table></font>");
	    
	    %>		

</body>
</html>