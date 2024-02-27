
<%@page import="com.emp.bean.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="find1.jsp" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>

<%
Employee emp=(Employee)request.getAttribute("bean");
out.write("<font size =5px color=green><table align=center border=1>"
		+"<tr>"
		+"<th> emp ID </th>"
		+"<th> emp Name </th>"
		+"<th> emp City </th>"
		+"<th> emp Phoneno </th>"
		+"<th> emp Department </th>"
		+"</tr>"
		+"<tr>"
		+"<td>"+emp.getId()+"</td>"
		+"<td>"+emp.getName()+"</td>"
		+"<td>"+emp.getCity()+"</td>"
		+"<td>"+emp.getPhoneno()+"</td>"
		+"<td>"+emp.getDepartment()+"</td>"
		+"</tr>"
		+"</font>");
%>
</body>
</html>