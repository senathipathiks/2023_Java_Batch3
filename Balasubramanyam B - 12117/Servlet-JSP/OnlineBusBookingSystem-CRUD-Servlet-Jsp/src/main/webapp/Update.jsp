<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<style type="text/css">
body{
font-size: 16px;
margin-left: 30%;
margin-top: 45px;
font-weight: bold;
}
td{
padding: 10px 14px;
}

</style>
</head>
<body>
<div class="card w-50 ">
<div class="card-header text-center"><h5>Update Employee Details:</h5></div>
<div class="card-body ">
<form action="EmpController" method="post">
<table style="border:none;">
<tr><td>Enter BusNo </td><td> <input type="text" name="BusNo" autocomplete="off" placeholder="Enter BusNo"/> </td></tr>
<tr><td>Enter BusName </td><td> <input type="text" name="BusName" autocomplete="off" placeholder="Enter BusName"/> </td></tr>
<tr><td>Enter RouteFrom </td><td> <input type="text" name="RouteFrom" autocomplete="off" placeholder="Enter RouteFrom"/></td></tr>
<tr><td>Enter RouteTo </td><td> <input type="text" name="RouteTo" autocomplete="off" placeholder="Enter RouteTo"/></td></tr>
<tr><td>Enter BusType </td><td> <input type="text" name="BusType" autocomplete="off" placeholder="Enter BusType"/></td></tr>
<tr><td>Enter departure</td><td> <input type="text" name="dep" autocomplete="off" placeholder="Enter departure"/></td></tr>
<tr><td>Enter arrival </td><td> <input type="text" name="arrival" autocomplete="off" placeholder="Enter arrival"/></td></tr>
<tr><td>Enter totalSeats </td><td> <input type="text" name="totalSeats" autocomplete="off" placeholder="Enter totalSeats"/></td></tr>
<tr><td>Enter availSeats </td><td> <input type="text" name="avilableSeates" autocomplete="off" placeholder="Enter availSeats"/></td></tr>
<tr><td>Enter fare </td><td> <input type="text" name="fare" autocomplete="off" placeholder="Enter fare"/></td></tr>
<tr><td colspan="2" style="text-align: right;"><input type="submit"  class="btn btn-warning btn-md" name="button" value="Update"/> </td></tr>
</table>
</form>
</div>
</div>
</body>
</html>