<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>success</title>
</head>
<body>
<h1>Registration was Successful</h1>
<h4>Details:</h4>
<table border="1">
<% ArrayList<Object> list = (ArrayList<Object>)request.getAttribute("list"); %>
<tr><td>Name</td><td><%=list.get(0)%></td></tr>
<tr><td>Age</td><td><%=list.get(1)%></td></tr>
<tr><td>Gender</td><td><%=list.get(2)%></td></tr>
</table>
</body>
</html>