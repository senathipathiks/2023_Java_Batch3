<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.obs.bean.*"%>
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
		<%="<br><div class=\"card card-body w-50\"><h4>Record Inserted Successfully</h4></div>"%>
		<%
	}else if(action.equals("Delete")){
		%>
		<%@include file="Delete.jsp" %>
		<%="<br><div class=\"card card-body w-50\"><h4>Record Deleted Successfully</h4></div>"%>
		<%
	}else if(action.equals("Update")){
		%>
		<%@include file="Update.jsp" %>
		<%="<br><div class=\"card card-body w-50\"><h4>Record Updated Successfully</h4></div>"%>
		<%
	}else if(action.equals("Search")){
		%>
		<%@include file="Search.jsp" %>
		<%
		OnlineBusBookingSystem obs = (OnlineBusBookingSystem)request.getSession().getAttribute("bean");
		%>
		<%="<br><div class=\"card card-body w-50\"><table><tr style=\"font-weight:bold\"><td>Train ID</td><td>Train Name</td><td>Train Type</td><td>Train Seats</td><td>Train Source</td><td>Train Destination</td><td>Train Fare</td><tr>" %>
		<%="<tr><td>"+obs.getBusNo()+"</td><td>"+obs.getBusName()+"</td><td>"+obs.getRouteFrom()+"</td><td>"+obs.getRouteTo()+"</td><td>"+obs.getBusType()+"</td><td>"+obs.getArrival()+"</td><td>"+obs.getTotalSeats()+"</td><td>"+obs.getAvailableSeats()+"</td><td>"+obs.getFare()+"</td></tr></table></div>" %>
		<%	
	}else if(action.equals("View")){
		%>
		<%@include file="Search.jsp" %>
		<%
		ArrayList<OnlineBusBookingSystem> list = (ArrayList<OnlineBusBookingSystem>)request.getSession().getAttribute("list");
		%>
		<%="<br><div class=\"card  card-body\"><h4>No Of Record : "+list.size()+"</h4>" %>
		<%="<br><table><tr style=\"font-weight:bold\"> <td>Train ID</td><td>Train Name</td><td>Train Type</td><td>Train Seats</td><td>Train Source</td><td>Train Destination</td><td>Train Fare</td><tr>" %>
		<%
		for(OnlineBusBookingSystem obs : list){
			%>
			<%="<tr><td>"+obs.getBusNo()+"</td><td>"+obs.getBusName()+"</td><td>"+obs.getRouteFrom()+"</td><td>"+obs.getRouteTo()+"</td><td>"+obs.getBusType()+"</td><td>"+obs.getArrival()+"</td><td>"+obs.getTotalSeats()+"</td><td>"+obs.getAvailableSeats()+"</td><td>"+obs.getFare()+"</td></tr></table></div>" %>
		<%} %>
			<%="</table></div>" %>
			<%
		}
			
		%>
		
</body>
</html>