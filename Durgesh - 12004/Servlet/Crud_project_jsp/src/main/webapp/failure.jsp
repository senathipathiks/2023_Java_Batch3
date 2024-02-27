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

if(action.equals("Insert")){
	%>

	<%@include file="insert.jsp" %>
	<%out.write("<br><h1><font color=darkred> <center> Record Inserted Failed </center> </font></h1>");
} %>
	
	<%  if(action.equals("Update")){ %>
	<%@include file="update.jsp" %>
<%out.write("<br><h1><font color=darkred> <center> Record Updated Failed </center> </font></h1>");
	} %>
	
<%  if(action.equals("Search")){ %>
	<%@include file="search.jsp" %>
<%
	out.write("<br><h1><font color=darkred> <center> Record Cannot be found </center> </font></h1>");
}
%>
<%  if(action.equals("Search All")){  %>
	<%@include file="search.jsp" %>
<%
	out.write("<br><h1><font color=darkred> <center> No Records found </center> </font></h1>");
}
%>

<%   if(action.equals("Delete")){ %>
	<%@include file="delete.jsp" %>
<% 
	out.write("<br><h1><font color=darkred> <center> Record Deletion Failed </center> </font></h1>");
}
%>
</body>
</html>