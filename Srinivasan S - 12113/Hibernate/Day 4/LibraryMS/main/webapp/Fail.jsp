<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fail</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

<style >
#div1{
margin-bottom: 10px;
position: absolute;
left: 38%;
}
</style>
</head>
<body>

<%
String action= (String)request.getAttribute("action");


if(action.equals("Add")){	
%>

<%="<br><div class=\"card card-body w-70\"><h4>Record insertion failed</h4></div>" %>

<%
}
else if(action.equals("Delete")){	
%>

<%="<br><div id=\"div1\" class=\"card card-body w-70\"><h4>Record Deletion failed</h4></div>" %>

<%
}
else if(action.equals("Update")){	
%>

<%="<br><div class=\"card card-body w-70\"><h4>Record Updation failed</h4></div>" %>

<%
}
else if(action.equals("Search")){
%>

<%-- <%@include file="Search.jsp" %>--%>

<%="<br><div class=\"card card-body w-70\"><h4>No Record Found </h4></div>"%>

<%
}
else if(action.equals("FindAll")){
%>

<%="<br><div class=\"card card-body w-570\"><h4>No Record found </h4></div>"%>

<%
}
%>

	
</body>
</html>