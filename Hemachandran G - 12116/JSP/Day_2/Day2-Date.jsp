
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
Date date = new Date();

out.print("The Day of this month is : "+new Date().getDay()+" <br> " );

out.print(" <br/> " );

out.print("Today's Date is" + new Date().getDay());



%>
</body>
</html>