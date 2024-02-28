<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert Car</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <style>
        body {
            background-color: #f8f9fa; /* Light gray background */
            padding-top: 20px;
            padding-bottom: 20px;
        }

        form {
            max-width: 400px;
            margin: 0 auto;
            padding: 20px;
            border: 1px solid #ddd;
            border-radius: 5px;
            background-color: #fff;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
        }

        h5 {
            text-align: center;
            color: #007bff;
            margin-bottom: 20px;
        }

        label {
            font-weight: bold;
            margin-bottom: 8px;
            color: #333;
        }

        input[type="text"],
        input[type="number"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            box-sizing: border-box;
            border: 1px solid #ddd;
            border-radius: 3px;
        }

        input[type="submit"] {
            width: 100%;
            padding: 12px;
            background-color: #007bff;
            color: #fff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <br>
    <form action="InsertServlet" method="post">
        <h5>Insert Car Details</h5>
        <div class="form-group">
            <label for="cid">Car ID:</label>
            <input type="text" id="cid" name="cid" required pattern="[0-9]+" title="Please enter a valid car ID (numeric)">
        </div>
        <div class="form-group">
            <label for="cbrand">Car Brand:</label>
            <input type="text" id="cbrand" name="cbrand" required>
        </div>
        <div class="form-group">
            <label for="cmodel">Car Model:</label>
            <input type="text" id="cmodel" name="cmodel" required>
        </div>
        <div class="form-group">
            <label for="cyear">Car Year:</label>
            <input type="number" id="cyear" name="cyear" required>
        </div>
        <div class="form-group">
            <input type="submit" class="btn btn-primary btn-lg" value="Insert" name="button">
        </div>
    </form>
</body>
</html>
