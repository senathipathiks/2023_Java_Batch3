<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% %>
    <%@include file="insert.jsp" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>

<% 
	out.print("<h4> record Inserted Successfully </font></h4>");
%>
<table><tr style=\"font-weight:bold\" align="center">
<th>Id</th><th>Name</th><th>City</th>
</tr>

<tr style=\"font-weight:bold\" align="center">

<td>${bean.getSid()}</td>
<td>${bean.getSname()}</td>
<td>${bean.getScity()}</td>
</tr>

	
</table>
</body>
</html>