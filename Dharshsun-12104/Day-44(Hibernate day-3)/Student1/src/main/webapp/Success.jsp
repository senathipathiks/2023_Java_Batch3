<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>

<%@page import="com.hibernate.bean.Student1"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="Search.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<style>
#noti{
align-items:center;
width:50%;
height:60px;
margin-left:30%;
margin-bottom:40px;
}
</style>
</head>
<body>

<% String action = request.getParameter("action");

if(action.equals("Insert")){
%>
	<%@ include file="Insert.jsp" %>
	
<%
out.print("<div class=\"card-body bg-light\" id=\"noti\"><h3><font color=Black>Insertion Operation is Successfully Done</font></h3></div>");
}
else if(action.equals("Search")){
	
	Student1 stud = (Student1)request.getSession().getAttribute("bean");
%>	

<%= "<div class=\"card card-body \"><table class=\"table table-dark table-hover\">"
+"<tr>"
+"<td>Student name</td>"
+"<td>Student name</td>"
+"<td>Student City</td>"
			+"<tr>"
			+"<td>"+stud.getId()+"</td>"
			+"<td>"+stud.getName()+"</td>"
			+"<td>"+stud.getCity()+"</td>"
			
			+"</tr></table></div>"
%>	



<%
}

else if(action.equals("SearchAll"))
	
{
	List<Student1> list = (List<Student1>) request.getSession().getAttribute("list");

%>

<% out.print("<div class=\"card card-body \"><h5 class=\"card-header bg-primary\">Number of Students: "+list.size()+"</h5><table class=\"table table-dark table-hover\">"
		+"<tr>"
		+"<td>Student ID</td>"
		+"<td>Student name</td>"
		+"<td>Student city</td>"
		
		);
		

	

for(Student1 i : list){
	out.print("<tr>"
			+"<td>"+i.getId()+"</td>"
			+"<td>"+i.getName()+"</td>"
			+"<td>"+i.getCity()+"</td>"
			+"</tr>");
}
out.print("</table></div>");
}
else if(action.equals("Update")){
	
%>
<%@ include file="Update.jsp" %>	
<%

out.print("<div class=\"card-body bg-white\" id=\"noti\"><h3><font color=white>Update Operation is Successfully Done</font></h3></div>");
}
else if(action.equals("Delete")){
%>
	<%@ include file="Delete.jsp" %>	
<%

out.print("<div class=\"card-body bg-light\" id=\"noti\"><h3><font color=Black>Deletion Done</font></h3></div>");
}
%>
</body>
</html>
