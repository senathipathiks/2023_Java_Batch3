<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@page import="com.ems.bean.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>   	    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>Insert title here</title>
<style>
.card{
margin-top: 40px;
}
body{
background-color: #A7BEAE;
}
#hide{
display: none;
}

</style>
</head>
<body>

<div class="card card-body">

<form action="NewElem"  method="post">
<input type="submit" value="Add Employee" class="btn btn-success" id="new">
</form>
<br>

<h5 class="card-header bg-primary"><b>FindAll Operation</b></h5>
<table class="table table-dark table-hover">

<tr>
<td><b>ID</b></td>
<td><b>Employee Name</b></td>
<td><b>Employee Salary</b></td>
<td><b>Edit</b></td>
<td><b>Delete</b></td>
</tr>

<% 

String msg = (String) request.getAttribute("msg");


if(msg.equals("FindAll")){
%>

 <c:forEach items="${list}" var="li">
<tr>


<form action="Edit" modelAttribute="rdata" method="post">
<td id="hide"><input type="text" name="eid" value="${li.eid}"></td>
<td>${li.eid}</td>
<td>${li.ename}</td>
<td>${li.esalary}</td>
<td><input type="submit" value="Edit" class="btn btn-warning"></td>
</form>



<form action="Remove" modelAttribute="rdata" method="post">
<td id="hide"><input type="text" name="eid" value="${li.eid}"></td>
<td id="hide"><input type="text" name="ename" value="${li.ename}"></td>
<td id="hide"><input type="text" name="esalary" value="${li.esalary}"></td>
<td><input type="submit" value="Remove" class="btn btn-danger"></td>
</form>
</tr>	
</c:forEach>

<% 
}  

if(msg.equals("Edit")){
	List<Employee> list = (List<Employee>) request.getAttribute("list");
	int id = (int) request.getAttribute("id");
	
	
	for(Employee i : list){
		
		out.print("<tr><td>"+i.getEid()+"</td>");
		if(id==i.getEid()){
			out.print(
					"<form action='Save' method='post' modelAttribute='data'>"+
					"<td id='hide'><input type='hidden' name='eid' value="+i.getEid()+"></td>"+
					"<td><input type='text' name='ename' value="+i.getEname()+"></td>"+
					"<td><input type='text' name='esalary' value="+i.getEsalary()+"></td>"+
					"<td><input type='submit' value='Save' class='btn btn-warning' /></td>"+
					"<td><input type='submit' value='Remove' class='btn btn-danger' /></td>"+
					"</tr></form>"
					);
			
		}
		else{
		out.print(
				"<td>"+i.getEname()+"</td>"+
				"<td>"+i.getEsalary()+"</td>"+
				"<td><input type='submit' value='Edit' class='btn btn-warning' /></td>"+
				"<td><input type='submit' value='Remove' class='btn btn-danger' /></td>"+
				"</tr>"
				
				);
		
		}
		
	}
	
	
}

if(msg.equals("New")){
%>	

<c:forEach items="${list}" var="li">
<tr>
<form action="Edit" modelAttribute="rdata" method="post">
<td id="hide"><input type="text" name="eid" value="${li.eid}"></td>
<td>${li.eid}</td>
<td>${li.ename}</td>
<td>${li.esalary}</td>
<td><input type="submit" value="Edit" class="btn btn-warning"></td>
</form>

<form action="Remove" modelAttribute="rdata" method="post">
<td id="hide"><input type="text" name="eid" value="${li.eid}"></td>
<td id="hide"><input type="text" name="ename" value="${li.ename}"></td>
<td id="hide"><input type="text" name="esalary" value="${li.esalary}"></td>
<td><input type="submit" value="Remove" class="btn btn-danger"></td>
</form>
</tr>	

</c:forEach>
<tr>
<form action="New" method="post" modelAttribute="bean">
<td><input type="text" name="eid"></td>
<td><input type="text" name="ename"></td>
<td><input type="text" name="esalary"></td>
<td><input type="submit" class="btn btn-warning" value="Insert"></td>
</form>
</tr>	

<% } %>

</table>	
</div>

</body>
</html>