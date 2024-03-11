<%@page import="com.mvc.bean.Ticket"%>
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
}

.labe{
padding-left:38%;
font-family: sans-serif;
color: #563594;
font-weight: bold;
font-size: larger;

}
.tbod{
background-color:  #DCB0FF;
color: black;
}
.table{
background-color:  #563594;
color: white;
text-align: center;
}

.content{
height:100px;
padding-top:50px;
padding-left: 400px;
}
.card {

  box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);
  transition: 0.3s; 
  border-radius: 15px; 
  width:70%;
  margin-top:5%;
  margin-left: 15%;
  color: #563594;
  background-color:#DCB0FF;
}
.card:hover {
  box-shadow: 0 8px 16px 0 black;
}

{
.card{
background-color:#DCB0FF;
}

.container {
  padding: 2px 16px;
}

.button1:hover{
color: #04AA6D;

}
</style>

</head>
</head>
<body>
	<div class="card">
   <div class="card-body">
   	<div class="labe">
    <label>FIND TICKET</label>
   </div>
<form action="Findd" modelAttribute="bean" method="post">
 
 <div class="form-floating mb-3"> 
       <select name="ticketID" class="form-control">
       <option selected>Ticket Id</option>
       <c:forEach items="${List}" var="id">
       <option value="${id}">${id}</option>
       </c:forEach>
       </select><br>
      <input type="submit" class="btn btn-warning" value="FIND" />
      </div>
      </form>
      
        <% Ticket tic=(Ticket)request.getAttribute("print");
	
		if(tic!=null){
			out.println(("<br>"+
					"<table class='table' border=1 width=80%  >"+
					"<thead>"+
					"<tr>"+
					"<td>Ticket ID</td>"+
					"<td>Category</td>"+
					"<td>Subject</td>"+
					"<td>Description</td>"+
					"<td>Priority</td>"+
					"<td>Raised By</td>"+
					"<td>Assigned To</td>"+
					"<td>Status</td>"+
					"</tr>"+
					"</thead>"+
					"<tbody class='tbod'>"+
					"<tr>"+
					"<td>"+tic.getTicketID()+"</td>"+
					"<td>"+tic.getCategory()+"</td>"+
					"<td>"+tic.getSubject()+"</td>"+
					"<td>"+tic.getDescr()+"</td>"+					
					"<td>"+tic.getPriority()+"</td>"+
					"<td>"+tic.getRaisedBy()+"</td>"+
					"<td>"+tic.getAssignedTo()+"</td>"+
					"<td>"+tic.getStatus()+"</td>"+
					"</tr>"+
					"</tbody>"+
					"</table>"
					));
			}
		%>	
  </div>
  </div>
</body>
</html>