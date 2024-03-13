<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<style type="text/css">
body{
background-color:rgb(143, 188, 143);
background-size: cover;
font-size: 16px;
margin-left: 20%;
margin-top: 45px;
font-weight: bold;
margin-right: 20%;
}
td{
padding: 10px 14px;
}

</style>
</head>
<body>
<div class="card " >
<div class="card-header bg-success text-center"><h5>Enter the CoffeeShop Management System Id's to Search : </h5></div>
<div class="card-body " style="background-color:orange">
<form action="Find" method="post" modelAttribute="bean">
<center>
<table style="border:none;">
<tr><td>Enter Shop Id's </td><td> <select name="id"><c:forEach items="${idList1}" var="id"><option>${id}</option>
</c:forEach>
</select> </td></tr>
<tr>
<td style="text-align: right;"><input type="submit"  class="btn btn-primary btn-md" name="button" value="Find"/> </td>
</tr>
</table>
</center>
</form>
</div>
</div>
</body>
</html>