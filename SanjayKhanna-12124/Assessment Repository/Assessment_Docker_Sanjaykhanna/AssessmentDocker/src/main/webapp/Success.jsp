
<%@page import="com.btbs.bean.Bus"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<title>Success page</title>
</head>
<body>
<%
	String action = request.getParameter("action");

	if(action.equals("Insert")){
		%>
		<%@include file="Insert.jsp" %>
		<%="<div class=\"card card-body w-50 text-center mt-2\"><h4>Record Inserted Successfully</h4></div>"%>
		<%
	}else if(action.equals("Delete")){
		%>
		<%@include file="Delete.jsp" %>
		<%="<br><div class=\"card card-body w-50 text-center\"><h4>Record Deleted Successfully</h4></div>"%>
		<%
	}else if(action.equals("Update")){
		%>
		<%@include file="Update.jsp" %>
		<%="<div class=\"card card-body w-50 text-center mt-2\"><h4>Record Updated Successfully</h4></div>"%>
		<%
	}else if(action.equals("Search")){
		%>
		<%@include file="Search.jsp" %>
		<%
		Bus b = (Bus)request.getSession().getAttribute("bean");	
		%>
		<%="<br><div class=\"card w-75\"><div class=\"card-header text-center h5\">Record Found</div><div class=\" card-body\"><table class=\"table table-border text-center\"><tr class=\"table-primary\" style=\"font-weight:bold\"><td>Ticket Id</td><td>Boarding point</td><td>Destination point</td><td>Price</td><td>No of Seat</td></tr>" %>
		<%="<tr><td>"+b.getTicketId()+"</td><td>"+b.getBoarding()+"</td><td>"+b.getDestination()+"</td><td>"+b.getPrice()+"</td><td>"+b.getNoOfSeat()+"</td></tr></table></div></div>" %>
		<%	
	}else if(action.equals("DeleteAll")){
		%>
		%>
		<%@include file="DeleteAll.jsp" %>
		<%="<br><div class=\"card card-body w-50 text-center\"><h4>All Record Deleted Successfully</h4></div>"%>
		<%}%>
</body>
</html>