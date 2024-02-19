<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Multiplication Table</title>
</head>
<body>

<%!
int num=10;
int table=5;
%>

<%
for(int i=0;i<=num;i++){
	int y=i*table;
	out.println(i+"*"+table+"="+y+"</br>");
}
%>


</body>
</html>