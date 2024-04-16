
<%@page import="com.car.bean.Car"%>


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

<form action="NewElem" >
<input type="submit" value="Add Employee" class="btn btn-success" id="new">
</form>
<br>

<h5 class="card-header bg-primary"><b>FindAll Operation</b></h5>
<table class="table table-dark table-hover">

<tr>
<td><b>Car ID</b></td>
<td><b>Car Model</b></td>
<td><b>Car Type</b></td>
<td><b>Rate per KM</b></td>
<td><b>Seat_Capacity</b></td>
<td><b>Edit</b></td>
<td><b>Delete</b></td>
</tr>

<% 

String msg = (String) request.getAttribute("msg");
List<Car> list = (List<Car>) request.getAttribute("idlist");

if(msg.equals("FindAll")){


 for(Car li : list){

	 out.print(
	 "<tr>"+


"<form action='Edit' modelAttribute='rdata' >"+

"<td>"+li.getCarID()+"</td>"+
"<td>"+li.getCarModel()+"</td>"+
"<td>"+li.getCarType()+"</td>"+
"<td>"+li.getRate_per_km()+"</td>"+
"<td>"+li.getSeat_Capacity()+"</td>"+

"<td><input type='submit' value='Edit' class='btn btn-warning'></td>"+
"<td><input type='submit' value='Remove' class='btn btn-danger'></td>"+
"</form>"

);

 }
}
  %>


<%-- <form action="Remove" modelAttribute="rdata" >
<td id="hide"><input type="text" name="id" value="${li.CarID}"></td>
<td id="hide"><input type="text" name="name" value="${li.CarModel}"></td>
<td id="hide"><input type="text" name="city" value="${li.CarType}"></td>
<td id="hide"><input type="text" name="city" value="${li.Rate_per_km}"></td>
<td id="hide"><input type="text" name="city" value="${li.Seat_Capacity}"></td>
<td><input type="submit" value="Remove" class="btn btn-danger"></td>
</form>
</tr>	
</c:forEach>

<% 
}  

if(msg.equals("Edit")){
	List<Car> list = (List<Car>) request.getAttribute("list");
	String id = (String)request.getAttribute("id");
	
	for(Car i : list){
		
		/* System.out.println(i.getCarID() +"from edit"+ id.equals(i.getCarID() + "ready"); */
		
		out.print("<tr><td>"+i.getCarID()+"</td>");
		if(id.equals(i.getCarID())){
			System.out.println(i +"from edit id");
			out.print(
					"<form action='Save' modelAttribute='data'>"+
					"<td id='hide'><input type='hidden' name='id' value="+i.getCarID()+"></td>"+
					"<td><input type='text' name='name' value="+i.getCarModel()+"></td>"+
					"<td><input type='text' name='city' value="+i.getCarType()+"></td>"+
					"<td><input type='text' name='city' value="+i.getRate_per_km()+"></td>"+
					"<td><input type='text' name='city' value="+i.getSeat_Capacity()+"></td>"+
					"<td><input type='submit' value='Save' class='btn btn-warning' /></td>"+
					"<td><input type='submit' value='Remove' class='btn btn-danger' /></td>"+
					"</tr></form>"
					);
			
		}
		else{
		out.print(
				"<td>"+i.getCarModel()+"</td>"+
				"<td>"+i.getCarType()+"</td>"+
				"<td>"+i.getCarType()+"</td>"+
				"<td>"+i.getRate_per_km()+"</td>"+
				"<td>"+i.getSeat_Capacity()+"</td>"+
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
<form action="Edit" modelAttribute="rdata" >
<td id="hide"><input type="text" name="id" value="${li.id}"></td>
<td>${li.id}</td>
<td>${li.name}</td>
<td>${li.city}</td>
<td><input type="submit" value="Edit" class="btn btn-warning"></td>
</form>

<form action="Remove" modelAttribute="rdata" >
<td id="hide"><input type="text" name="id" value="${li.id}"></td>
<td id="hide"><input type="text" name="name" value="${li.name}"></td>
<td id="hide"><input type="text" name="city" value="${li.city}"></td>
<td><input type="submit" value="Remove" class="btn btn-danger"></td>
</form>
</tr>	

</c:forEach>
<tr>
<form action="New"  modelAttribute="bean">
<td><input type="text" name="id"></td>
<td><input type="text" name="name"></td>
<td><input type="text" name="city"></td>
<td><input type="submit" class="btn btn-warning" value="Insert"></td>
</form>
</tr>	 --%>



</table>	
</div>

</body>
</html>