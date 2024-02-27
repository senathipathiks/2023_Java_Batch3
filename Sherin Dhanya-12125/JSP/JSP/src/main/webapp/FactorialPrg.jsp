<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
int fact=1;
int n=8;
%>
<%
for(int i=1;i<=n;i++){
	fact=fact*i;
}
out.print("<h1> Factorial of " + n +" is " + fact + "</h1>");
%>

</body>
</html>