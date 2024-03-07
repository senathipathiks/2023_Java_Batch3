<%@page import="com.spring.bean.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ include file="find.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

</style>
</head>
<body>



<% 
Student stud=(Student)request.getAttribute("bean");
out.write("<br><br><br>");
out.write("<font size =5px color=purple><table align=center border=2px>"
        				+"<tr>"
        				+"<th> Student ID </th>"
        				+"<th>Student Name </th>"
        				+"<th>Student City</th>"
        				+"</tr>"
        				+"<tr>"
        				+"<td>"+stud.getSid()+"</td>"
        				+"<td>"+stud.getSname()+"</td>"
        				+"<td>"+stud.getScity()+"</td>"
        				+"</tr>"
       				+"</font>");
 %>

</body>
</html>