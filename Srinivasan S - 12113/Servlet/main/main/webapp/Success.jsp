
<%@page import="java.util.LinkedList"%>
<%@page import="com.employee.bean.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	  	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
<style >

#div1{
margin-top: 10px;
}
</style>
</head>
<body>

<%
String action= (String)request.getAttribute("action");


if(action.equals("Add")){	// if action is insert
%>

<%-- <%@ include file="Add.jsp" %>--%>	

<%="<br><div id=\"div1\" class=\"card card-body w-50\"><h4>Record inserted Successfully</h4></div>" %>

<%
}
else if(action.equals("Delete")){	// if action is delete
%>


<%-- <%@include file="Delete.jsp" %>	--%>

<%="<br><div  id=\"div1\" class=\"card card-body w-50\"><h4>Record Deleted Successfully</h4></div>" %>

<%
}
else if(action.equals("Update")){	// if action is update
%>

<%-- <%@include file="Update.jsp" %>	--%>	

<%="<br><div  id=\"div1\" class=\"card card-body w-50\"><h4>Record Updated Successfully</h4></div>" %>

<%
}
else if(action.equals("Search")){
%>
<% 
Employee emp=(Employee)request.getAttribute("bean");
%>
<%-- <%@include file="Search.jsp" %>--%>

<% 

out.write("<br><br><br>");

out.write("<table align=center border=1 box-shadow: 10px 10px 5px lightblue;>"+
"<tr>"+"<th> Employee Id</th>"+
		"<th>Employee Name</th>"+
		"<th>Employee Mail</th>"+"<th>Employee City</th>"+"</tr>"
		);


	out.write("<tr>"+"<td>"+emp.getEmpId()+"</td>"+"<td>"+emp.getEmpName()+"</td>"+"<td>"+emp.getEmail()+"</td>"+"<td>"+emp.getCity()+"</td>"+"</tr>");

out.write("</table>");
	
%>

<%
}
else if("list"!=null){
%>
<%-- <%@include file="Search.jsp" %>--%>

<% 
LinkedList<Employee> list=(LinkedList<Employee>)request.getAttribute("list");
System.out.println(list);
%>

<% 
out.write("<br><br><br>");

out.write("<table align=center border=1 box-shadow: 10px 10px 5px lightblue;>"+
"<tr>"+"<th> Employee Id</th>"+
		"<th>Employee Name</th>"+
		"<th>Employee Mail</th>"+"<th>Employee City</th>"+"</tr>"
		);

for(Employee emp: list){
	out.write("<tr>"+"<td>"+emp.getEmpId()+"</td>"+"<td>"+emp.getEmpName()+"</td>"+"<td>"+emp.getEmail()+"</td>"+"<td>"+emp.getCity()+"</td>"+"</tr>");
}
out.write("</table>");
}
%>



	
</body>
</html>