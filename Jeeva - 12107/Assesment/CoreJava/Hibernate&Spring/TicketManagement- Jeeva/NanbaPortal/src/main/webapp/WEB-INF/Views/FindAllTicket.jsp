<%@page import="com.mvc.bean.Ticket"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body{
background-image: url("https://t3.ftcdn.net/jpg/06/43/09/58/240_F_643095854_PDjXnQt8WxITrqTK7MsmfkKzEQ4T0kM5.jpg");
background-position: center;
background-size:cover;
background-repeat: no-repeat;
color:white;
}
.heading{
background-color:  #563594;
color: white;
}

.mar{
background-color:  #563594;
color: white;
font-style: italic;
font-family: sans-serif;
 
}
</style>
</head>
<body>
<br>
 <table class="table">
<thead class="heading">
    <tr>
    
      <th scope="col">Ticket ID</th>
      <th scope="col">Category</th>
      <th scope="col">Subject</th>
      <th scope="col">Description</th>
      <th scope="col">Priority</th>
      <th scope="col">RaisedBy</th>
      <th scope="col">AssignedTo</th>
      <th scope="col">Status</th>
      <th scope="col">Edit</th>
      <th scope="col">Delete</th>
    </tr>
  </thead>
  <tbody>
    <tr> 
     <% List<Ticket> list = (ArrayList<Ticket>)request.getAttribute("list");
     Ticket tic = (Ticket)request.getAttribute("bean");
	for(Ticket t : list){
		if(tic != null && tic.getTicketID()== t.getTicketID()){
			out.print("<form action=\"doedit\"modelAttribute=\"bean1\">");
			out.print("<tr>");
			out.print("<td><input type = \"text\" name = \"ticketID\" value =\"" + t.getTicketID()+"\" readonly></td>");
			out.print("<td><input type = \"text\" name = \"category\" value =\"" + t.getCategory()+"\" ></td>");
			out.print("<td><input type = \"text\" name = \"subject\" value =\"" + t.getSubject()+"\" ></td>");
			out.print("<td><input type = \"text\" name = \"descr\" value =\"" + t.getDescr()+"\" ></td>");
			out.print("<td><input type = \"text\" name = \"priority\" value =\"" + t.getPriority()+"\" ></td>");
			out.print("<td><input type = \"text\" name = \"raisedBy\" value =\"" + t.getRaisedBy()+"\" ></td>");
			out.print("<td><input type = \"text\" name = \"assignedTo\" value =\"" + t.getAssignedTo()+"\" ></td>");
			out.print("<td><input type = \"text\" name = \"status\" value =\"" + t.getStatus()+"\" ></td>");
			out.print("<td><input type = \"submit\" name = \"edit\" class=\"btn btn-warning\" value =\"Save\" ></td>");
			out.println("<td><input type='submit' value='backk' class='btn btn-danger' name='delete' </td>");
			
			out.print("</tr></form>");
			
		}else{
			out.print("<tr>");
			out.print("<td>"+ t.getTicketID()+"</td>");
			out.print("<td>" + t.getCategory()+"</td>");
			out.print("<td>" + t.getSubject()+"</td>");
			out.print("<td>" + t.getDescr()+"</td>");
			out.print("<td>" + t.getPriority()+"</td>");
			out.print("<td>" + t.getRaisedBy()+"</td>");
			out.print("<td>" + t.getAssignedTo()+"</td>");
			out.print("<td>" + t.getStatus()+"</td>");
			out.print("<td><a href =\"action?ticketID="+t.getTicketID()+"\"><input type=\"button\" name=\"edit\" class='btn btn-success' value=\"edit\"></a></td>");
			out.print("<td><a href =\"deletenow?ticketID="+t.getTicketID()+"\"><input type=\"button\" name=\"edit\" class='btn btn-danger' value=\"delete\"></a></td>");
			
			out.print("</tr>");
		
		}
		
	}
	
	
%> 
</tr>
</tbody>
</table>
</body>
</html>

 