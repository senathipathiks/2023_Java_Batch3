<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.LinkedList"%>
<%@page import="java.util.List"%>
<%@page import="com.Ass.bean.Petition" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
<%
	String action = (String)request.getParameter("action");
	if(action.equals("Insert")){
		%>
		
		<%@include file="Insert.jsp" %>
		<font color="green">
		<%="<br><center><h2>Record Inserted Successfully</h2></center>"%>
		</font>
		<%
	}else if(action.equals("Delete")){
		%>
		
		<%@include file="Delete.jsp" %>
		<font color="green">
		<%="<br><center><h2>Record Deleted Successfully</h2></center>"%>
		</font>
		<%
	}else if(action.equals("Update")){
		%>
		
		<%@include file="Update.jsp" %>
		<font color="green">
		<%="<br><center><h2>Record Updated Successfully</h2></center>"%>
		</font>
		<%
	}else if(action.equals("Find")){
		%>
		
		<%@include file="Find.jsp" %>
		
		<%
		Petition pet = (Petition)request.getSession().getAttribute("bean");
		%><font color="green">
		<%="<br><center><h2>Record Founded </h2></center>"%>
		</font>
		
		<%="<center><br><div class=\"card card-body w-100 table table-info\"><table><tr style=\"font-weight:bold #77a874\"><td> ID</td><td> Category</td><td> Desc</td><td>Priority</td><td>RaisedBy</td><td>AssingnedTo</td><td>Status</td><tr></center>" %>
		<%="<tr><td>"+pet.getId()+"</td><td>"+pet.getCategory()+"</td><td>"+pet.getDesc()+"</td><td>"+pet.getPriority()+"</td><td>"+pet.getRaised()+"</td><td>"+pet.getAssingned()+"</td><td>"+pet.getStatus()+"</td></tr></table></div>" %>
		
		<%	
	}else if(action.equals("FindAll")){
		%>
		
		<%@include file="Find.jsp" %>
		<%
		LinkedList<Petition> list = (LinkedList<Petition>)request.getSession().getAttribute("list");
		%><font color="green">
		<%="<br><center><h2>No Of Record : "+list.size()+"</h2></center>" %>
		</font>
		<%="<center><br><div class=\"card card-body w-50  \"><table align=center  style=\"font-size:20px\"><tr style=\"font-weight:bold\"><td> ID</td><td> Category</td><td> Desc</td><td>Priority</td><td>RaisedBy</td><td>AssingnedTo</td><td>Status</td><tr></center>" %>
		
		<%
		for(Petition pet : list){
			%>
			<%="<tr><td>"+pet.getId()+"</td><td>"+pet.getCategory()+"</td><td>"+pet.getDesc()+"</td><td>"+pet.getPriority()+"</td><td>"+pet.getRaised()+"</td><td>"+pet.getAssingned()+"</td><td>"+pet.getStatus()+"</td></tr> "%>
			<%} %>
			<%="</table></div>" %>
			<%
		}
			
		%>
</body>
</html>