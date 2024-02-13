<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>hello JSP</title>
</head>
<body>
	<%--this is my first jsp page --%>
	
	<%! String name = "Sundhar Raj S"; int i =1 ;%>
	
<%! int square(int a){
	return a * a;
} %>

<%
out.print(square(3));
%>

<%= square(3) %>>
	
	
	
</body>
</html>