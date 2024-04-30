<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Delete Employee</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            padding: 20px;
            margin: 0;
        }
        
        form {
            max-width: 400px;
            margin: 0 auto;
            background-color: #ffffff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        }
        
        .heading {
            text-align: center;
            margin-top: 0;
            color: #333;
        }
        
        label {
            font-weight: bold;
        }
        
        .text-input {
            width: 100%;
            height: 40px;
            border-radius: 5px;
            border: 1px solid #ccc;
            padding: 5px;
            margin-bottom: 10px;
        }
        
        .submit-button {
            width: 100%;
            height: 40px;
            border: none;
            background-color: #007bff;
            color: white;
            font-weight: bold;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }
        
        .submit-button:hover {
            background-color: #0056b3;
        }
        
        h4 {
            text-align: center;
            margin-top: 20px;
            color: #007bff;
        }
    </style>
</head>
<body>
    <form action="PerformDeleteByName" method="post">
        <h2 class="heading">Delete Employee</h2>
        <label for="eid">Employee Name:</label>
        
        <select class="text-input" name="ename" id="ename" required>
            <c:forEach var="name" items="${NameList}">
                <option value="${name}">${name}</option>
            </c:forEach>
        </select>
        
        <br>
        <input class="submit-button" type="submit" value="Delete">
    </form>
    
    <h4><bottom><bold><font color="Red">${ msg }</bottom></bold></font></h4>
    
</body>
</html>
