<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
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

.content{
height:100px;
padding-top:50px;
padding-left: 400px;
}
.card {

  box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);
  transition: 0.3s; 
  border-radius: 15px; 
  width:50%;
  margin-top:1%;
  margin-left: 25%;
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
.ms{
color: white;
}

</style>
</head>
<body>
<div class="card">
  <div class="card-body">

<form action="Insertion"  method="post" modelAttribute="bean">
	
	<div class="labe">
    <label>INSERT TICKET</label>
   </div>
  
  <div class="form-floating mb-3">
  <input type="text" class="form-control" name="ticketID" placeholder="TicketID">
  </div>
  
  <div class="form-floating mb-3">
  <input type="text" class="form-control" name="category" placeholder="Category">
  </div>
  
  <div class="form-floating mb-3">
  <input type="text" class="form-control" name="subject" placeholder="Subject">
  </div>
  
  <div class="form-floating mb-3">
  <input type="text" class="form-control" name="descr" placeholder="Describtion">
  </div>
  
  <div class="form-floating mb-3">
  <input type="text" class="form-control" name="priority" placeholder="Priority">
  </div>

  <div class="form-floating mb-3">
  <input type="text" class="form-control" name="raisedBy" placeholder="RaisedBy">
  </div>

  <div class="form-floating mb-3">
  <input type="text" class="form-control" name="assignedTo" placeholder="AssignedTo">
  </div>

  <div class="form-floating mb-3">
  <input type="text" class="form-control" name="status" placeholder="Status">
  </div>  

  <div class="button1">
  <input type="submit" class="btn btn-warning" Value="AddTicket"/>
  </div>
	</form>

<% String msgg=(String)request.getAttribute("msg");

if(msgg !=null){
	out.print("<center><h1>"+msgg+"</h1></center>");
}


%> 
</div>
	
</div>	
</body>
</html>