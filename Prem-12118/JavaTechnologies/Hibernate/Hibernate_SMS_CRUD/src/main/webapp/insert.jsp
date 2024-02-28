<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <style>
        body {
            background-image: url('SchoolInsert.jpg');
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
            height: 100vh;
            margin: 0;
            padding: 0;
        }
        label {
       
        }

        form {
            max-width: 400px;
            margin: 0 auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
            background-color: rgba(255, 255, 255, 0);
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            marigin-left:-50px;
        }

        input[type="text"] {
            width: 100%;
            padding: 8px;
            margin: 8px 0;
            box-sizing: border-box;
        }

        input[type="submit"] {
            width: 100%;
            padding: 10px;
            background-color: #007bff;
            color: #fff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }

        .success-message, .failure-message {
            text-align: center;
            margin-top: 20px;
        }

        .success-message {
            color: green;
        }

        .failure-message {
            color: red;
        }
    </style>
</head>
<body>
    <br>
    <form action="InsertServelet" method="post">
        <h5 class="text-center mb-4">Insert Student Details</h5>
        <div class="form-group">
            <label for="sid">Enter the Student ID:</label>
            <input type="text" id="sid" name="sid" required pattern="[0-9]+" title="Please enter a valid student ID (numeric)">
        </div>
        <div class="form-group">
            <label for="sname">Enter the Student Name:</label>
            <input type="text" id="sname" name="sname" required>
        </div>
        <div class="form-group">
            <label for="scity">Enter the Student City:</label>
            <input type="text" id="scity" name="scity" required>
        </div>
        <div class="form-group">
            <input type="submit" class="btn btn-primary btn-lg" value="Insert" name="button">
        </div>
    </form>
 
    <div class="success-message">
        <%= request.getAttribute("message") %>
    </div>
    <div class="failure-message">
        <%= request.getAttribute("message") %>
    </div>
</body>
</html>
