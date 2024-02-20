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
		<%@include file="Insert.jsp" %>
		<font color="red">
		<%="<br><center><h2>Inseration Failure</h2></center>"%>
		</font>
		<%
	}else if(action.equals("Delete")){
		%>
		<%@include file="Delete.jsp" %>
		<font color="red">
		<%="<br><center><h2>Deletion Failure</h2></center>"%>
			</font>
		<%
	}else if(action.equals("Update")){
		%>
		<%@include file="Update.jsp" %>
		<font color="green">
		<%="<br><center><h2>Updation Sucessfully</h2></center>"%>
			</font>
		<%
	}else if(action.equals("Find")){
		%>
		<%@include file="Find.jsp" %>
		<font color="red">
		<%="<br><center><h2>No record found</h2></center>" %>
			</font>
		<%	
	}else if(action.equals("FindALL")){
		%>
		<font color="red">
		<%@include file="Find.jsp" %>
		<%="<br><center><h2>No record found</h2></center>" %>
			</font>
			<%
		}
			
		%>
</body>
</html>