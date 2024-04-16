<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.car.bean.Car" %>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<style>
    .table-hover tbody tr:hover td, .table-hover tbody tr:hover th {
        background-color: #b8daff;
    }
    .table {
        border: 2px solid #dee2e6;
        font-family: Arial, sans-serif;
        color: #333;
    }
    .table th, .table td {
        text-align: center;
        padding: 15px;
    }
    .table th {
        background-color: #f2f2f2;
    }
    .table tbody tr:nth-child(even) {
        background-color: #f2f2f2;
    }
</style>
</head>
<body>
<% if( (Car)request.getAttribute("bean")!=null){ 
   Car c = (Car)request.getAttribute("bean"); %>
   <div class="card card-body w-105">
      <table class="table table-striped table-hover">
         <thead class="thead-dark">
            <tr>
               <th>Car Id</th>
               <th>Car Model</th>
               <th>Car Type</th>
               <th>Distance</th>
               <th>Seat Capacity</th>

               
            </tr>
         </thead>
         <tbody>
            <tr>
               <td><%= c.getCarID() %></td>
               <td><%= c.getCarModel() %></td>
               <td><%= c.getCarType() %></td>
               <td><%= c.getRate_per_km() %></td>
               <td><%= c.getSeat_Capacity() %></td>
            </tr>
         </tbody>
      </table>
   </div>
<% } %>
</body>
</html>
