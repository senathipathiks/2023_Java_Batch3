
<%@page import="com.btbs.bean.Bus"%>
<%@page import="java.util.LinkedList"%>
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
background-image: url('https://www.bhmpics.com/downloads/bus-hd-images-Wallpapers/25.5749730-bus-wallpapers.jpg');
background-size: cover;
}
#display{
margin: 30px 0px 0px 180px;
box-shadow: 8px 8px 10px 10px rgba(0,0,0,0.6);
}
</style>
</head>
<body>
<div class="card w-75" id="display">
<div class="card-header text-center h1">Book Record List</div>
<% LinkedList<Bus> list = (LinkedList<Bus>)request.getSession().getAttribute("list"); %>
<div class="card-body">
<div class="card-text h4 mb-4">No of Record : <%=list.size()%></div>
<table class="table table-bordered table-hover text-center">
 <thead>
    <tr class="table-primary">
      <th scope="col">Ticket Id</th>
      <th scope="col">Boarding Point</th>
      <th scope="col">Destination point</th>
      <th scope="col">Price</th>
      <th scope="col">No of seat</th>
    </tr>
  </thead>
 <tbody>
 <% for(Bus b : list){ %>
 <%="<tr><td>"+b.getTicketId()+"</td><td>"+b.getBoarding()+"</td><td>"+b.getDestination()+"</td><td>"+b.getPrice()+"</td><td>"+b.getNoOfSeat()+"</td></tr>"%>
 <%} %>
 </tbody>
</table>
</div>
</div>
</body>
</html>