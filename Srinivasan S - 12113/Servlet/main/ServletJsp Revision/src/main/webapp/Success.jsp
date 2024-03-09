<%@page import="java.util.LinkedList"%>
<%@page import="com.practice.bean.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

<style >

#div1{
margin-bottom: 10px;
position: absolute;
left: 38%;
}	
</style>
</head>
<body>

<%
String action= (String)request.getAttribute("action");


if(action.equals("Add")){	// if action is insert
%>

<%="<br><div id=\"div1\" class=\"card card-body w-70\"><h4>Record inserted Successfully</h4></div>" %>

<%
}
else if(action.equals("Delete")){	// if action is delete
%>


<%="<br><div  id=\"div1\" class=\"card card-body w-70\"><h4>Record Deleted Successfully</h4></div>" %>

<%
}
else if(action.equals("Update")){	// if action is update
%>

<%="<br><div  id=\"div1\" class=\"card card-body w-70\"><h4>Record Updated Successfully</h4></div>" %>

<%
}
else if(action.equals("Search")){
%>
<% 
Employee emp=(Employee)request.getAttribute("bean");
%>

<% 

out.write("<br><br><br>");

out.write("<table align=center border=1 box-shadow: 10px 10px 5px lightblue;>"+
"<tr>"+"<th> Employee Id</th>"+
		"<th>Employee Name</th>"+"<th>Employee Designation</th>"+"</tr>"
		);


out.write("<tr>"+"<td>"+emp.geteId()+"</td>"+"<td>"+emp.geteName()+"</td>"+"<td>"+emp.geteDesig()+"</td>"+"</tr>");
out.write("</table>");
	
%>

<%
}
else if("list"!=null){
%>

<% 
LinkedList<Employee> list=(LinkedList<Employee>)request.getAttribute("list");
System.out.println(list);
%>

<% 
out.write("<br><br><br>");

out.write("<table align=center border=1 box-shadow: 10px 10px 5px lightblue;class=card card-body shadow p-3 mb-5 bg-white rounded>"+
"<tr>"+"<th> Employee Id</th>"+
		"<th>Employee Name</th>"+"<th>Employee Designation</th>"+"</tr>"
		);

for(Employee emp: list){
	out.write("<tr>"+"<td>"+emp.geteId()+"</td>"+"<td>"+emp.geteName()+"</td>"+"<td>"+emp.geteDesig()+"</td>"+"</tr>");
}
out.write("</table>");
}
%>
