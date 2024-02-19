<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="view.jsp" %>
    <%@page import="com.sms.bean.Student" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% 

Student stud = (Student) request.getAttribute("bean");

out.write("<br><br><br>");

	out.write("<font size=5px color=blue><table align =center border=2px>"
			+"<tr>"
			+"<th> Stud Id </th>"
			+"<th> Stud Name </th>"
			+"<th> Stud City </th>"
			+"</tr>"
			+"<tr>"
			+"<td>"+stud.getId()+"</td>"
			+"<td>"+stud.getName()+"</td>"
			+"<td>"+stud.getCity()+"</td>"
			+"</tr>"
			+"</font>");

%>


</body>
</html>