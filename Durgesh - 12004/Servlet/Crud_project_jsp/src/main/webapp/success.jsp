<%@page import="java.util.LinkedList"%>
<%@page import="java.util.List" %>
<%@page import="com.sms.bean.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String action= request.getParameter("action");

if(action.equals("Insert")){
%>

<%@include file="insert.jsp" %>
<%="<br><h1><font color=darkgreen> <center> Record Inserted Successfully </center> </font></h1>" %>

<%
}
else if(action.equals("Update"))
{
%>

<%@include file="update.jsp" %>
<%= "<br><h1><font color=darkgreen> <center> Record Updated Successfully </center> </font></h1>" %>

<%
}
else if(action.equals("Search"))
{
%>
<%@include file="search.jsp" %>
<% Student s1 = (Student)request.getSession().getAttribute("bean"); %>

<%= "<br><font size=5px color=darkblue> <table align=center border=1> <tr> <th>Student ID </th> <th>Student Name </th> <th>Student City </th></tr>" %>
<%= "<tr><td>" + s1.getSid() + "</td><td>"+ s1.getSname() + "</td><td>" +  s1.getScity() +"</td></tr></font></table>" %> 

<%
}
else if(action.equals("SearchAll"))
{
%>
<%@include file="search.jsp" %>
<%
LinkedList<Student> list = (LinkedList<Student>)request.getSession().getAttribute("list");
%>
<%="<br><h1><font color=darkgreen> <center> Record Present is : "+list.size()+ " </center> </font></h1>"%>
<%="<br><font size=5px color=darkblue> <table align=center border=1><tr><th>Student ID </th><th>Student Name </th><th>Student City </th></tr>" %>

<%
for (Student s : list) {
	%>
<%= "<tr>"
		+"<td>" + s.getSid() + "</td>"
		+"<td>"+ s.getSname() + "</td>"
		+"<td>" +  s.getScity() +"</td>"
		+ "</tr>" %>
<%
}
%>
<%= "</table></font>" %>

<%
}
else if(action.equals("Delete"))
{	
%>
<%@include file="delete.jsp" %>
<%= "<br><h1><font color=darkgreen> <center> Record Deleted Successfully </center> </font></h1>" %>

<%
}
%>

</body>
</html>