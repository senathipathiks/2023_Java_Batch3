<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Updates Failure</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
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
        }

        .container {
            margin-top: 50px;
        }

        .jumbotron h1 {
            color: red;
            font-size: 2em;
        }
    </style>
</head>
<body>
<br> <br>
    <div class="container">
        <div class="jumbotron">
            <h1 class="display-4">Updation Failed</h1>
            <p class="lead">There was an error during the Updation process. Please check and try again.</p>
            <a class="btn btn-primary btn-lg" href="update" role="button">Back to Updation</a>
        </div>
    </div>
</body>
</html>
