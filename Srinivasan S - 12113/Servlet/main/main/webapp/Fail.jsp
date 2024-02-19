<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Failure</title>

<style >
#div1{
margin-bottom: 10px;
}
</style>
</head>
<body>

<%
String action= (String)request.getAttribute("action");


if(action.equals("Add")){	
%>

<%-- <%@ include file="Add.jsp" %>--%>	

<%="<br><div class=\"card card-body w-20\"><h4>Record insertion failed</h4></div>" %>

<%
}
else if(action.equals("Delete")){	
%>
<%-- <%@include file="Delete.jsp" %>	--%>

<%="<br><div id=\"div1\" class=\"card card-body w-50\"><h4>Record Deletion failed</h4></div>" %>

<%
}
else if(action.equals("Update")){	
%>

<%-- <%@include file="Update.jsp" %>	--%>	

<%="<br><div class=\"card card-body w-50\"><h4>Record Updation failed</h4></div>" %>

<%
}
else if(action.equals("Search")){
%>

<%-- <%@include file="Search.jsp" %>--%>

<%="<br><div class=\"card card-body w-50\"><h4>No Record Found </h4></div>"%>

<%
}
else if(action.equals("FindAll")){
%>

<%@include file="Search.jsp" %>

<%="<br><div class=\"card card-body w-50\"><h4>No Record found </h4></div>"%>

<%
}
%>

	
</body>
</html>