<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Frame</title>
<link rel="stylesheet"
    href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
    integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
    crossorigin="anonymous">
<style>
    body {
        background-color: #f8f9fa;
        background-image: url('FindImage.jpg');
        background-size: cover;
        background-position: center;
        background-repeat: no-repeat;
        height: 100vh;
        margin: 0;
        padding: 0;
        background-size: cover;
        background-position: center;
        background-repeat: no-repeat;
        height: 100vh;
        margin: 0;
    }

    form {
        max-width: 400px;
        margin: 0 auto;
        padding: 20px;
        border: 1px solid #ccc;
        border-radius: 5px;
        background-color: rgba(255, 255, 255, 0.8);
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }

    input[type="text"] {
        width: 100%;
        padding: 8px;
        margin: 8px 0;
        box-sizing: border-box;
    }
 
    .custom-button {
        width: 100%;  
    }

    input[type="submit"] {
        padding: 10px;
        background-color: green;
        color: #fff;
        border: none;
        border-radius: 5px;
        cursor: pointer;
    }

    input[type="submit"]:hover {
        background-color: yellow;
    }
</style>
</head>
<body>
<br>
<br>
<form action="InsertServlet" method="post">
    <h5 class="text-center mb-4">Find Student Details below</h5>
    <div class="form-group">
        <label for="sid">Enter the Student ID to find:</label>
        <input type="text" id="sid" name="sid" placeholder="Please enter a valid student ID">
    </div>
    <div class="form-group">
        <button type="Submit" class="btn btn-warning btn-lg custom-button" value="Find" name="button">Find</button>
    </div>
    <div class="form-group">
        <button type="Submit" class="btn btn-warning btn-lg custom-button" value="Find All" name="button">Find All</button>
    </div>
</form>
</body>
</html>
