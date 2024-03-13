<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<style type="text/css">
body{
background-color:rgb(143, 188, 143);
background-size: cover;
font-size: 16px;
margin-left: 30%;
margin-top: 45px;
font-weight: bold;
margin-right: 30%;
}
td{
padding: 10px 14px;
}

</style>
</head>
<body>
<div  class="card  bg-info">
<div class="card-header text-center"><h5>Update Student Details:</h5></div>
<div class="card-body ">
<form action="Updation" method="post" modelAttribute="bean">
<table style="border:none;">
<tr><td>Enter Student Id </td><td> <select name="id"><c:forEach items="${idList}" var="id"><option>${id}</option>
</c:forEach>
</select><td><input class="btn btn-success btn-md" type='submit' value='Fetch' name="button"/> </td></tr>
<tr><td>Enter Student Name </td><td> <input type="text" name="Name" autocomplete="off" placeholder="Enter student name"/> </td></tr>
<tr><td>Enter Student City </td><td> <input type="text" name="City" autocomplete="off" placeholder="Enter student city"/></td>
<td colspan="2" style="text-align: right;"><input type="submit"  class="btn btn-warning btn-md" name="button" value="Update"/> </td></tr>
</table>
</form>
</div>
</div>
</body>
</html>
