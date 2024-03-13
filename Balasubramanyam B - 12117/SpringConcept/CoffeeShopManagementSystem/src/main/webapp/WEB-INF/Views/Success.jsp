<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.cms.bean.CoffeeShopManagementSystem"%>
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
		<br><div class="card bg-success card-body text-center"><h4>Inserted Successfully</h4></div>
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
		<br><div class="card bg-success card-body text-center"><h4>Updated Successfully</h4></div>
		<%
	}else if(action.equals("Search")){
		%>
		<%@include file="Search.jsp" %>
		<%
		CoffeeShopManagementSystem c = (CoffeeShopManagementSystem)request.getAttribute("bean");
		%>
		<%="<br><div class=\"card  card-body \"><table><tr style=\"  background-color:rgb(143, 188, 143);font-weight:bold\"><td>ID</td><td>ShopName</td><td>Address</td><td>Email</td><td>PhoneNo</td><td>Rating</td><td>Proprietor</td><tr>" %>
		<%="<tr><td>"+c.getid()+"</td><td>"+c.getShopName()+"</td><td>"+c.getAddress()+"</td><td>"+c.getEmail()+"</td><td>"+c.getPhoneNo()+"</td><td>"+c.getRating()+"</td><td>"+c.getProprietor()+"</td></tr></table></div>" %>
		<%	
	}else if(action.equals("FindAll")){
		%>
		<%@include file="FindAll.jsp" %>
		<%
		ArrayList<CoffeeShopManagementSystem> list = (ArrayList<CoffeeShopManagementSystem>)request.getAttribute("beanlist");
		%>
		<%="<br><div class=\"card   text-center card-body \"><h4>No Of Record : "+list.size()+"</h4>" %>
		<%="<br><table><tr style=\" background-color:rgb(255, 222, 173); font-weight:bold\"><td>ID</td><td>ShopName</td><td>Address</td><td>Email</td><td>PhoneNo</td><td>Rating</td><td>Proprietor</td><tr>" %>
		<%
		for(CoffeeShopManagementSystem c : list){
			%>
			<%="<tr><td>"+c.getid()+"</td><td>"+c.getShopName()+"</td><td>"+c.getAddress()+"</td><td>"+c.getEmail()+"</td><td>"+c.getPhoneNo()+"</td><td>"+c.getRating()+"</td><td>"+c.getProprietor()+"</td></tr>" %>
			<%} %>
			<%="</table></div>" %>
			<%
		}	
		%>
		
</body>
</html>