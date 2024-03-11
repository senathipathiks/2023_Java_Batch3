<%@page import="com.pet.bean.Petition"%>
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
</form><br>
<h5 class="card-header bg-primary"><b>FindAll Operation</b></h5>
<table class="table table-dark table-hover">

<tr>
<td><b>ID</b></td>
<td><b>Category</b></td>
<td><b>Description</b></td>
<td><b>Priority</b></td>
<td><b>RaisedBy</b></td>
<td><b>AssignedTo</b></td>
<td><b>Status</b></td>
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
<td id="hide"><input type="text" name="petid" value="${li.petid}"></td>
<td>${li.petid}</td>
<td>${li.category}</td>
<td>${li.description}</td>
<td>${li.priority}</td>
<td>${li.raisedby}</td>
<td>${li.assignedto}</td>
<td>${li.status}</td>
<td><input type="submit" value="Edit" class="btn btn-warning"></td>
</form>
<form action="Remove" modelAttribute="rdata" method="post">
<td id="hide"><input type="text" name="petid" value="${li.petid}"></td>
<td id="hide"><input type="text" name="category" value="${li.category}"></td>
<td id="hide"><input type="text" name="description" value="${li.description}"></td>
<td id="hide"><input type="text" name="priority" value="${li.priority}"></td>
<td id="hide"><input type="text" name="raisedby" value="${li.raisedby}"></td>
<td id="hide"><input type="text" name="assignedto" value="${li.assignedto}"></td>
<td id="hide"><input type="text" name="status" value="${li.status}"></td>
<td><input type="submit" value="Remove" class="btn btn-danger"></td>
</form>
</tr>	
</c:forEach>

<%

 
}  

if(msg.equals("Edit")){
	List<Petition> list = (List<Petition>) request.getAttribute("list");
	int id = (int) request.getAttribute("id");
	
	
	for(Petition i : list){
		
		out.print("<tr><td>"+i.getPetid()+"</td>");
		if(id==i.getPetid()){
			out.print(
					"<form action='Save' method='post' modelAttribute='data'>"+
					"<td id='hide'><input type='hidde' name='petid' value="+i.getPetid()+"></td>"+
					"<td><input type='text' name='category' value="+i.getCategory()+"></td>"+
					"<td><input type='text' name='description' value="+i.getDescription()+"></td>"+
					"<td><input type='text' name='priority' value="+i.getPriority()+"></td>"+
					"<td><input type='text' name='raisedby' value="+i.getRaisedby()+"></td>"+
					"<td><input type='text' name='assignedto' value="+i.getAssignedto()+"></td>"+
					"<td><input type='text' name='status' value="+i.getStatus()+"></td>"+
					"<td><input type='submit' value='Save' class='btn btn-warning' /></td>"+
					"<td><input type='submit' value='Remove' class='btn btn-danger' /></td>"+
					"</tr></form>"
					);
	
		}
		else{
		out.print(
		"<td>"+i.getCategory()+"</td>"+
		"<td>"+i.getDescription()+"</td>"+
		"<td>"+i.getPriority()+"</td>"+
		"<td>"+i.getRaisedby()+"</td>"+
		"<td>"+i.getAssignedto()+"</td>"+
		"<td>"+i.getStatus()+"</td>"+
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
<td id="hide"><input type="text" name="eid" value="${li.petid}"></td>
<td>${li.petid}</td>
<td>${li.category}</td>
<td>${li.description}</td>
<td>${li.priority}</td>
<td>${li.raisedby}</td>
<td>${li.assignedto}</td>
<td>${li.status}</td>
<td><input type="submit" value="Edit" class="btn btn-warning"></td>
</form>
<form action="Remove" modelAttribute="rdata" method="post">
<td id="hide"><input type="text" name="petid" value="${li.petid}"></td>
<td id="hide"><input type="text" name="category" value="${li.category}"></td>
<td id="hide"><input type="text" name="description" value="${li.description}"></td>
<td id="hide"><input type="text" name="priority" value="${li.priority}"></td>
<td id="hide"><input type="text" name="raisedby" value="${li.raisedby}"></td>
<td id="hide"><input type="text" name="assignedto" value="${li.assignedto}"></td>
<td id="hide"><input type="text" name="status" value="${li.status}"></td>
<td><input type="submit" value="Remove" class="btn btn-danger"></td>
</form>
</tr>	
</c:forEach>

<form action="New" method="post" modelAttribute="bean">
<td><input type="text" name="petid"></td>
<td><input type="text" name="category"></td>
<td><input type="text" name="description"></td>
<td><input type="text" name="priority"></td>
<td><input type="text" name="raisedby"></td>
<td><input type="text" name="assignedto"></td>
<td><input type="text" name="status"></td>
<td><input type="submit" class="btn btn-warning" value="Insert"></td>
</form>
</tr>	

<% } %>

</table>	
</div>

</body>
</html>