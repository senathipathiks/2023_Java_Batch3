<%@page import="com.ems.bean.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>   	    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<style type="text/css">
.card{
	height:270px;
	width:500px;
	margin-left:30%;
	margin-top:40px;
	padding:30px;
	margin-bottom:30px;
}
body{
background-color: #A7BEAE;
}
#output{
margin-top: 1px;
}
</style>
</head>
<body id="MB">
<div class="card">
  <h5 class="card-header bg-primary">Find Operation</h5>
  <div class="card-body ">
  
 <form action="Findation" modelAttribute="bean" method="post" > 
 
   <div class="form-floating mb-3">
   <label for="floatingInput">Room ID</label>
  <select class="form-select" aria-label="Default select example" style="height:30px; width: 100%" name="eid">
       
      <option selected>Select RoomID</option>
      <c:forEach items="${IdList}" var="id" >
      <option>${id}</option>
      </c:forEach>
      </select>
  </div><br>
  <div class="form-floating">
 <input type="submit" value="Find" name="button" class="btn btn-primary">
 
 </div>
 
  </form>
</div>
</div>
<br><br><br><br>

<% 

Employee emp = (Employee) request.getAttribute("emp");

if(emp!=null){
out.print(

"<div class='card card-body' id='output'>"+
"<h5 class='card-header bg-primary'>Record</h5>"+
"<table class='table table-dark table-hover'>"+
"<tr>"+
"<td>Employee ID</td>"+
"<td>Employee Name</td>"+
"<td>Employee Salary</td>"+
"</tr>"+
"<tr>"+
"<td>"+emp.getEid()+"</td>"+
"<td>"+emp.getEname()+"</td>"+
"<td>"+emp.getEsalary()+"</td>"+
"</tr>"+
"</table>"+
"</div>"

);

}
%>
</body>
</html>