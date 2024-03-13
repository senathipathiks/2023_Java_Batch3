<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<style type="text/css">
body{

background-color:green;
font-size: 16px;
margin-left: 30%;
margin-top: 110px;
font-weight: bold;
}
td{
padding: 10px 14px;
}

</style>
</head>
<body>
<div class="card w-50 bg-danger ">
<div class="card-header text-center"><h5>Enter the property Id to Search : </h5></div>
<div class="card-body ">
<form action="PropertyManagementSystemController" method="post">
<table style="border:none;">
<tr><td>Enter Property Id </td><td>: <input type="text" name="Id" autocomplete="off" placeholder="Enter property id"/> </td></tr>
<tr><td style="text-align: left;"><input type="submit"  class="btn btn-primary btn-md" name="button" value="View All"/> </td>
<td style="text-align: right;"><input type="submit"  class="btn btn-secondary btn-md" name="button" value="Search"/> </td>
</tr>
</table>
</form>
</div>
</div>
</body>
</html>