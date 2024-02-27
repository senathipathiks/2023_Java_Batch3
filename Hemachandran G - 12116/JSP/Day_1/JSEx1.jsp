<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%-- This is my First JSP Page --%>
<%! String name ="Heram";  %> <%-- It is considered as global variable, which means it is accesible anywhere in the program. --%>
<%


String name="Hema";


out.print("<h1> Welcome "+name);
%><%-- It is considered as local variable, which means it is accesible only within
 the program. --%>
</body>
</html>