<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.LinkedList" %>
<%@ page import="com.crs.bean.Car" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Car Information</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        body {
            padding: 20px;
        }

        table {
            width: 100%;
            margin-bottom: 1rem;
            background-color: transparent;
        }

        th, td {
            padding: 12px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #f2f2f2;
        }

        .table-container {
            max-width: 800px;
            margin: 0 auto;
        }

        h2 {
            font-family: Times New Roman;
        }
    </style>
</head>
<body>
    <div class="table-container">
        <h2 class="text-center">Entire Cars details</h2>
        <br>
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>Car ID</th>
                    <th>Car Brand</th>
                    <th>Car Model</th>
                    <th>Car Year</th>
                </tr>
            </thead>
            <tbody>
                <%
                    LinkedList<Car> carList = (LinkedList<Car>) request.getAttribute("carList");
                    for (Car c : carList) {
                %>
                <tr>
                    <td><%= c.getId() %></td>
                    <td><%= c.getBrand() %></td>
                    <td><%= c.getModel() %></td>
                    <td><%= c.getYear() %></td>
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>
    </div>
    <div>
        <a class="btn btn-primary btn-lg" href="view.jsp" role="button">Back to Find page</a>
    </div>
</body>
</html>
