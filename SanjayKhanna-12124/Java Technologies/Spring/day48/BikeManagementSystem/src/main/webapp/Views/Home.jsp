<%@page import="com.bms.bean.Bike"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<style>
body{
background-image: url('https://png.pngtree.com/background/20230425/original/pngtree-motorcycle-parked-near-a-street-picture-image_2478435.jpg');
background-size: cover;
}
#display{
margin: 40px 0px 0px 150px;
width: 80%;
}
</style>
</head>
<body>
<div class="card" id="display">
<div class="card-header text-center h1">Record List</div>
<% ArrayList<Bike> list = (ArrayList<Bike>)request.getAttribute("list"); %>
<div class="card-body">
<div class="card-text h4 mb-4">No of Record : <%=list.size()%></div>
<table class="table table-bordered table-hover text-center">
 <thead>
    <tr class="table-primary">
      <th scope="col">Bike Id</th>
      <th scope="col">Brand Name</th>
      <th scope="col">Engine Capacity</th>
      <th scope="col">Mileage</th>
      <th scope="col">Max Speed</th>
      <th scope="col">Price</th>
    </tr>
  </thead>
 <tbody>
 <% for(Bike b : list){  %>
 <%="<tr><td>"+b.getBikeId()+"</td><td>"+b.getBrandName()+"</td><td>"+b.getEngineCapacity()+"</td><td>"+b.getMileage()+"</td><td>"+b.getMaxSpeed()+"</td><td>"+b.getPrice()+"</td></tr>"%>
 <%}%>
 </tbody>
</table>
</div>
</div>
</body>
</html>