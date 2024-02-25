<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Failure Page</title>
</head>
<body>
<%
	String action = request.getParameter("action");
	if(action.equals("Insert")){
		%>
		<%@include file="Insert.jsp" %>
		<%="<br><div class=\"card card-body w-50\"><h4>Insertion Failure</h4></div>"%>
		<%
	}else if(action.equals("Delete")){
		%>
		<%@include file="Delete.jsp" %>
		<%="<br><div class=\"card card-body w-50\"><h4>Deletion Failure</h4></div>"%>
		<%
	}else if(action.equals("Update")){
		%>
		<%@include file="Update.jsp" %>
		<%="<br><div class=\"card card-body w-50\"><h4>Updation Failure</h4></div>"%>
		<%
	}else if(action.equals("Search")){
		%>
		<%@include file="Search.jsp" %>
		<%="<br><div class=\"card card-body w-50\"><h4>No Record Found</h4></div>" %>
		<%	
	}else if(action.equals("Veiw ALL")){
		%>
		<%@include file="Search.jsp" %>
		<%="<br><div class=\"card card-body w-50\"><h4>No Record Found</h4></div>" %>
			<%
		}
			
		%>

</body>
</html>
