<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="searchall.jsp" %> 
         <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table><tr style=\"font-weight:bold\" align="center">
<th>Id</th><th>Name</th><th>City</th>
</tr>
<c:forEach items="${idList}" var="bean">

<tr style=\"font-weight:bold\" align="center">

<td>${bean.getSid()}</td>
<td>${bean.getSname()}</td>
<td>${bean.getScity()}</td>
</tr>
</c:forEach>
	
</table>
	
</body>
</html>