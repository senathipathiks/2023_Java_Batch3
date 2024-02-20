<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Failure Page</title>
<style>
.record{
color: red;
}
</style>
</head>
<body>
<%
	String action = request.getParameter("action");
	if(action.equals("Insert")){
		%>
		<%@include file="Insert.jsp" %>
		<%="<br><div class=\"record \"><center><h4>Record Insertion Failure</h4><center></div>"%>
		<%
	}else if(action.equals("Delete")){
		%>
		<%@include file="Delete.jsp" %>
		<%="<br><div class=\"record \"><center><h4>Record Deletion Failure</h4><center></div>"%>
		<%
	}else if(action.equals("Update")){
		%>
		<%@include file="Update.jsp" %>
		<%="<br><div class=\"record \"><center><h4>Record Updation Failure</h4><center></div>"%>
		<%
	}else if(action.equals("Search")){
		%>
		<%@include file="Search.jsp" %>
		<%="<br><div class=\"record \"><center><h4>Record Not Found </h4><center></div>" %>
		<%	
	}else if(action.equals("Veiw ALL")){
		%>
		<%@include file="Search.jsp" %>
		<%="<br><div class=\"record \"><center><h4>No Record Found</h4><center></div>" %>
			<%
		}
			
		%>

</body>
</html>