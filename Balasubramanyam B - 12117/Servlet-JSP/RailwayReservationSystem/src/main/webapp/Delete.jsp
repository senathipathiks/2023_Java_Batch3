<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<style type="text/css">
body{
background-color: orange;
font-size: 16px;
margin-left: 30%;
margin-top: 110px;
font-weight: bold;
}
td{
padding: 5px 14px;
}
</style>
</head>
<body>
<div class="card w-50 ">
<div class="card-header text-center"><h5>Enter the Train Id to Delete : </h5></div>
<div class="card-body ">
<form action="RRSController" method="post">
<table style="border:none;">
<tr><td>Enter Train Id </td><td>: <input type="text" name="TrainID" autocomplete="off" placeholder="Enter Train id"/> </td></tr>
<tr><td colspan="2" style="text-align: right;"><input type="submit"  class="btn btn-primary btn-md" name="button" value="Delete"/> </td></tr>
</table>
</form>
</div>
</div>
</body>
</html>