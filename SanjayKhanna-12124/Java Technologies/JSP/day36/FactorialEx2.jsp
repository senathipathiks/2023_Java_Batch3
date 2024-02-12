<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Factorial</title>
</head>
<body>
<%! int fact(int x){
	if(x<=1)
		return 1;
	else
		return x*fact(x-1);
	}
	%>
	
	<%="Factorial of 6 : "+fact(6) %>
</body>
</html>