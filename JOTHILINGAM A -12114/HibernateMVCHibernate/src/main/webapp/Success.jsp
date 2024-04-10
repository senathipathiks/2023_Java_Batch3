<%@page import="com.hibernate.bean.Student"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.hibernate.bean.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<style>
.record {
	color: green;
}

.box {
	margin-left: 350px;
}
</style>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<title>Success page</title>
</head>
<body>
	<%
	String action = request.getParameter("action");
	if (action.equals("Insert")) {
	%>
	<%@include file="Insert.jsp"%>
	<%="<br><div class=\" record\"><center><h4>Record Inserted Successfully</h4><center></div>"%>
	<%
	} else if (action.equals("Delete")) {
	%>
	<%@include file="Delete.jsp"%>
	<%="<br><div class=\"record \"><center><h4>Record Deleteded Successfully</h4><center></div>"%>"%>
	<%
	} else if (action.equals("Update")) {
	%>
	<%@include file="Update.jsp"%>
	<%="<br><div class=\"record \"><center><h4>Record Updateded Successfully</h4><center></div>"%>
	<%
	} else if (action.equals("Search")) {
	%>
	<%@include file="Search.jsp"%>
	<%
	Student stud = (Student) request.getSession().getAttribute("bean");
	System.out.println(stud+" success page");
	%>
	<%="<center><br><div class=\"card card-body w-50 table table-info\"><table><tr style=\"font-weight:bold #77a874\"><td>Student ID</td><td>Student Name</td><td>Student City</td><tr></center>"%>
	<%= "<tr><td>" + stud.getId() + "</td><td>" + stud.getName() + "</td><td>" + stud.getCity()
	+ "</td></tr></table></div>" %>
	<%
	} else if (action.equals("View")) {
	%>
	<%@include file="Search.jsp"%>
	<%
	ArrayList<Student> list = (ArrayList<Student>) request.getSession().getAttribute("list");
	%>
	<%="<center><br><div class=\"card card-body w-50 table \"><h4>No Of Record : " + list.size() + "</h4>"%>
	<%="<br><table class=\"bg-light \" ><tr style=\"font-weight:bold row\"><td>Student ID</td><td>Student Name</td><td>Student City</td><tr></center>"%>
	<%
	for (Student stud : list) {
	%>
	<%="<tr class=\" table table-light \" ><td>" + stud.getId() + "</td><td>" + stud.getName() + "</td><td>"
		+ stud.getCity() + "</td></tr>"%>
	<%
	}
	%>
	<%="</table></div>"%>
	<%
	}
	%>

</body>
</html>