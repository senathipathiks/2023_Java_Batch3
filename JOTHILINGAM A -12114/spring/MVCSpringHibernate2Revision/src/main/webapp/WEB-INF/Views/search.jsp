<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.spring.bean.Student" %>
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
<% if( (Student)request.getAttribute("bean")!=null){ 
   Student lib = (Student)request.getAttribute("bean"); %>
   <div class="card card-body w-105">
      <table class="table table-striped table-hover">
         <thead class="thead-dark">
            <tr>
               <th>Id</th>
               <th>Name</th>
               <th>City</th>
               
            </tr>
         </thead>
         <tbody>
            <tr>
               <td><%= lib.getId() %></td>
               <td><%= lib.getName() %></td>
               <td><%= lib.getCity() %></td>
            </tr>
         </tbody>
      </table>
   </div>
<% } %>
</body>
</html>
