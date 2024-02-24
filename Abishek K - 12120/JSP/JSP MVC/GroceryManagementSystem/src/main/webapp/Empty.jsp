<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String action = request.getParameter("action");

if(action.equals("Insert"))
{
	%>
	<%@ include file="Insert.jsp" %>
	<% 
	
	out.print("<h1><font color=green>Fields Cannot be Empty</font></h1>");
	
}
else if(action.equals("Find")){
	
%>
<%@ include file="Find.jsp" %>
<% 
out.print("<h1><font color=red>Fields Cannot be Empty</font></h1>");
}
else if(action.equals("Delete")){
%>
	<%@ include file="Delete.jsp" %>	
<%

out.print("<h1><font color=red>Fields cannot be Empty</font></h1>");
}
else if(action.equals("Update")){
%>
	<%@ include file="Update.jsp" %>	
<%

out.print("<h1><font color=red>Fields cannot be Empty</font></h1>");
}
%>
</body>
</html>