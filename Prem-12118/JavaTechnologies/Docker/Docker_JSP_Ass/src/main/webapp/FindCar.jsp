<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Car Details</title>
    <link rel="stylesheet"
        href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
        integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
        crossorigin="anonymous">
    <style>
        body {
            padding: 20px;
        }

        h1 {
            color: green;
            font-size: 2em;
            text-align: center;
        }

        .table {
            margin-top: 20px;
        }

        .custom-button {
            width: 100%;
        }

        .back-button {
            margin-top: 20px;
            text-align: center;
        }
    </style>

</head>
<body>
    <br>
    <br>
    <h1>
        <font color="Green">Car successfully found</font>
    </h1>
    <br>

    <table class="table">
        <thead>
            <tr>
                <th scope="col">Car ID</th>
                <th scope="col">Car Brand</th>
                <th scope="col">Car Model</th>
                <th scope="col">Car Year</th>

            </tr>
        </thead>
        <tbody>
            <td><%=request.getAttribute("carId")%></td>
            <td><%=request.getAttribute("carBrand")%></td>
            <td><%=request.getAttribute("carModel")%></td>
            <td><%=request.getAttribute("carYear")%></td>
        </tbody>
    </table>
    </font>
    <div>
        <a class="btn btn-primary btn-lg" href="view.jsp" role="button">Back
            to Find a Car</a>
    </div>

</body>
</html>
