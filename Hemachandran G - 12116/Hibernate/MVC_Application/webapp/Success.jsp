<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.oss.bean.Shopping"%>
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
		<%="<br><div class=\"card card-body w-50\"><h4 style=text-align:center;>Record Inserted Successfully</h4></div>"%>
		<%
	}else if(action.equals("Delete")){
		%>
		<%@include file="Delete.jsp" %>
		<%="<br><div class=\"card card-body w-50\"><h4 style=text-align:center;>Record Deleted Successfully</h4></div>"%>
		<%
	}else if(action.equals("Update")){
		%>
		<%@include file="Update.jsp" %>
		<%="<br><div class=\"card card-body w-50\"><h4 style=text-align:center;>Record Updated Successfully</h4></div>"%>
		<%
	}else if(action.equals("Search")){
		%>
		<%@include file="Search.jsp" %>
		<%
		Shopping sc = (Shopping)request.getSession().getAttribute("bean");
		%>
		<%="<br><div class=\"card card-body w-105\"><h4>Here is the Record : </h4>" %>
		<%="<br><table><tr style=text-align:center\"font-weight:bold\"><td>Course ID</td><td>Course Name</td><td>Course Type</td><td>Course Duration</td><td>Course Fee</td> " %>
		<%="<tr><td>"+sc.getCoustomerID()+"</td><td>"+sc.getCoustomerName()+"</td><td>"+sc.getMobileNo()+"</td><td>"+sc.getAge()+"</td><td>"+sc.getAddress()+"</td> </tr></table></div>" %>
		<%	
	}else if(action.equals("View")){
		%>
		<%@include file="Search.jsp" %>
		<%
		ArrayList<Shopping> list = (ArrayList<Shopping>)request.getSession().getAttribute("list");
		%>
		<%="<br><div class=\"card card-body w-105\"><h4>No Of Record : "+list.size()+"</h4>" %>
		<%="<br><table><tr style=text-align:center\"font-weight:bold\"><td>Customer ID</td><td>Customer Name</td><td>Mobile Number</td><td>Age</td><td>Address</td> " %>
		<%
		for(Shopping sc : list){
			%>
			<%="<tr><td>"+sc.getCoustomerID()+"</td><td>"+sc.getCoustomerName()+"</td><td>"+sc.getMobileNo()+"</td><td>"+sc.getAge()+"</td><td>"+sc.getAddress()+"</td> </tr></div>" %>
			<%} %>
			<%="</table></div>" %>
			<%
		}
			
		%>
		
</body>
</html>