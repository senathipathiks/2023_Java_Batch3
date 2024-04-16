<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*" %>
<%@page import="com.spring.bean.Student" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<style>
    
    body {
        font-family: Arial, sans-serif;
        background-color: #f8f9fa;
    }
    .container {
        max-width: 960px;
        margin: auto;
    }
    .card {
        padding: 20px;
        margin-bottom: 20px;
    }
    .table {
        border-spacing: 0;
        border: 1px solid #ddd;
    }
    .table th, .table td {
        text-align: left;
    }
    .btn {
        border-radius: 5px;
        transition: all 0.5s;
    }
    .btn:hover {
        transform: scale(1.1);
    } 
    
    
</style>
</head>
<body>
<%
    ArrayList<Student> list = (ArrayList<Student>)request.getAttribute("list");
%>
<div class="container">
    <div class="card card-body w-105">
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>City</th>
                </tr>
            </thead>
            <tbody>
            <%
                for(Student lib : list){
            %>
                <tr>
                	
                    <td><%= lib.getId() %></td>
                    <td><%= lib.getName() %></td>
                    <td><%= lib.getCity() %></td>
                    <td><input type="submit" value="Edit" class="btn btn-primary"></td>
<td><input type="submit" value="remove" class="btn btn-danger"></td>

                </tr>
            <%
                }
            %>
            </tbody>
        </table>
    </div>
</div>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>
