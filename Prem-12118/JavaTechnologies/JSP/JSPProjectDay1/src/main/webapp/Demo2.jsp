<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Factorial</title>
</head>
<body>
<%!

int fact=1;// Methods and  Variables declared in the declaration tag...
 public int factorial(int n)
{
	 
	for (int i=1; i<=n;i++){
		fact=fact*i;
	}
	
	 return fact;
}
%>
<%   
  int n=10;
 out.println(factorial(n));// using script tag
 
%>

<%=
"<h1>"+ factorial(n)+"</h1>"//using expression tag
%>

</body>
</html>