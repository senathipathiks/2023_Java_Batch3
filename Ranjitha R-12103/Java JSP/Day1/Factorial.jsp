<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Factorial</title>
</head>
<body>
<%--Factorial number --%>


<%!
int fact=1;
int n=6;
%>
<%

for(int i=1;i<=n;i++){
	 fact=fact*i;
}
out.println(fact);
%>

</body>
</html>