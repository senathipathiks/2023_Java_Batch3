<%@page import="com.bms.bean.Bike"%>
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
	String action = (String)request.getAttribute("action");

	if(action.equals("Insert")){
		%>
		<%@include file="Insert.jsp" %>
		<%="<br><div class=\"card card-body w-50 text-center\"><h4>Record Inserted Successfully</h4></div>"%>
		<%
	}else if(action.equals("Delete")){
		%>
		<%@include file="Delete.jsp" %>
		<%="<br><div class=\"card card-body w-50 text-center\"><h4>Record Deleted Successfully</h4></div>"%>
		<%
	}else if(action.equals("Update")){
		%>
		<%@include file="Update.jsp" %>
		<%="<br><div class=\"card card-body w-50 text-center\"><h4>Record Updated Successfully</h4></div>"%>
		<%
	}else if(action.equals("Search")){
		%>
		<%@include file="Search.jsp" %>
		<%
		Bike b = (Bike)request.getAttribute("record");	
		%>
		<%="<br><div class=\"card w-75\"><div class=\"card-header text-center h5\">Record Found</div><div class=\" card-body\"><table class=\"table table-border text-center\"><tr class=\"table-primary\" style=\"font-weight:bold\"><td>Bike Id</td><td>Brand Name</td><td>Engine Capacity</td><td>Mileage</td><td>Max Speed</td><td>Price</td><tr>" %>
		<%="<tr><td>"+b.getBikeId()+"</td><td>"+b.getBrandName()+"</td><td>"+b.getEngineCapacity()+"</td><td>"+b.getMileage()+"</td><td>"+b.getMaxSpeed()+"</td><td>"+b.getPrice()+"</td></tr></table></div></div>"%>
		<%}
		else if(action.equals("DeleteAll")){
			%>
			<%@include file="DeleteAll.jsp" %>
			<%="<br><div class=\"card card-body text-center\"><h4>All record deleted Successfully</h4></div>"%>
			<%
			}%>
</body>
</html>