<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<style type="text/css">
body{

background-color: green;
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
<div class="card-header text-center"><h5>Enter the Property Details to Insert : </h5></div>
<div class="card-body ">
<form action="PropertyManagementSystemController" method="post">
<table style="border:none;">
<tr><td>Enter Property Id </td><td>: <input type="text" name="Id" autocomplete="off" placeholder="Enter id"/> </td></tr>
<tr><td>Enter Property Name </td><td>: <input type="text" name="Name" autocomplete="off" placeholder="Enter name"/> </td></tr>
<tr><td>Enter Property OwnedBuy </td><td>: <input type="text" name="OwnedBuy" autocomplete="off" placeholder="Enter Property Owned Buy"/></td></tr>
<tr><td colspan="2" style="text-align: right;"><input type="submit"  class="btn btn-success btn-md" name="button" value="Insert"/> </td></tr>
</table>
</form>
</div>
</div>
</body>
</html>