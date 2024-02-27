<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <title>Update Car</title>
    <link rel="stylesheet"
        href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
        integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
        crossorigin="anonymous">
    <style>
        body {
            background-color: #f8f9fa;
            background-image: url('UpdateImage.jpg');
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

        input[type="text"], input[type="number"] {
            width: 100%;
            padding: 8px;
            margin: 8px 0;
            box-sizing: border-box;
        }

        input[type="submit"] {
            width: 100%;
            padding: 10px;
            background-color: green;
            color: #fff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: green;
        }
    </style>
</head>
<body>
    <br>
    <form action="InsertServlet" method="post">
        <h5 class="text-center mb-4">Update Car Details</h5>
        <div class="form-group">
            <label for="cid">Enter the Car ID:</label>
            <input type="text" id="cid" name="cid" required pattern="[0-9]+" title="Please enter a valid car ID (numeric)">
        </div>
        <div class="form-group">
            <label for="cbrand">Enter the Car Brand:</label>
            <input type="text" id="cbrand" name="cbrand" required>
        </div>
        <div class="form-group">
            <label for="cmodel">Enter the Car Model:</label>
            <input type="text" id="cmodel" name="cmodel" required>
        </div>
        <div class="form-group">
            <label for="cyear">Enter the Car Year:</label>
            <input type="number" id="cyear" name="cyear" required>
        </div>
        <div class="form-group">
            <input type="submit" class="btn btn-success btn-lg custom-button" value="update" name="button">
        </div>
    </form>
</body>
</html>
