<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.hotel.bean.Hotel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<title>Success page</title>
</head>
<body>

<%
	String action = request.getAttribute("res").toString();
   
	if(action.equals("Insert")){
		%>
		<%@include file="Insert.jsp" %>
		<br><div class="card bg-success card-body text-center"><h4>Inserted Successfully</h4>
		<h4>${bean}</h4></div>
		<%
		
	}
	 else if(action.equals("Delete")){
		%>
		<%@include file="Delete.jsp" %>
		<br><div class="card bg-success card-body text-center"><h4>ID ${bean.id} is Deleted Successfully</h4></div>
		<%
	}else if(action.equals("Update")){
		%>
		<%@include file="Update.jsp" %>
		<br><div class="card bg-success card-body text-center"><h4>Updated Successfully</h4>
		<h4>${bean}</h4></div>
		<%
	}else if(action.equals("Find")){
		%>
		<%@include file="Search.jsp" %>
		<%
		Hotel s = (Hotel)request.getAttribute("bean");
		%>
		<%="<br><div class=\"card  card-body text-center\"><table><tr style=\" background-color:rgb(143, 188, 143);font-weight:bold\"><td>Employee ID</td><td>Employee Name</td><td>Employee City</td><tr>" %>
		<%="<tr><td>"+s.getId()+"</td><td>"+s.getRoomType()+"</td><td>"+s.getPrice()+"</td></tr></table></div>" %>
		<%	
	}else if(action.equals("FindAll")){
		%>
		<%@include file="SearchAll.jsp" %>
		<%
		ArrayList<Hotel> list = (ArrayList<Hotel>)request.getAttribute("beanlist");
		%>
		<%="<br><div class=\"card   text-center card-body \"><h4>No Of Record : "+list.size()+"</h4>" %>
		<%="<br><table><tr style=\" background-color:rgb(255, 222, 173); font-weight:bold\"><td>ID</td><td>Name</td><td>City</td><tr>" %>
		<%
		for(Hotel sms : list){
			%>
			<%="<tr><td>"+sms.getId()+"</td><td>"+sms.getRoomType()+"</td><td>"+sms.getPrice()+"  </td></tr>" %>
			<%} %>
			<%="</table></div>" %>
			<%
		}	
		%>
		
</body>
</html>