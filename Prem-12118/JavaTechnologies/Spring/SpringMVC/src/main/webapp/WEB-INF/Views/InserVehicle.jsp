<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Insert Vehicle</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/style.css'/>">
</head>
<body>

    <h2>Insert Vehicle</h2>

    <form action="${pageContext.request.contextPath}/vehicles/insert" method="post">
        <label for="make">Make:</label>
        <input type="text" id="make" name="make" required>

        <label for="vehicleName">Vehicle Name:</label>
        <input type="text" id="vehicleName" name="vehicleName" required>

        <label for="type">Type:</label>
        <input type="text" id="type" name="type" required>

        <label for="price">Price:</label>
        <input type="number" id="price" name="price" required>

        <button type="submit">Insert</button>
    </form>

</body>
</html>
