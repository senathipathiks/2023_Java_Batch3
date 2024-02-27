<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.LinkedList" %>
<%@ page import="com.sms.bean.Student" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Information</title>
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
        
        font-famiy: Times new Roman;
        }
    </style>
</head>
<body>
    <div class="table-container">
        <h2 class="text-center">Entire Students details</h2>
         <br>
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>Stud Id</th>
                    <th>Stud Name</th>
                    <th>Stud City</th>
                </tr>
            </thead>
            <tbody>
               
                <%
                    LinkedList<Student> studList = (LinkedList<Student>) request.getAttribute("studentList");
                    for (Student s : studList) {
                %>
                <tr>
                    <td><%= s.getId() %></td>
                    <td><%= s.getName() %></td>
                    <td><%= s.getCity() %></td>
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
