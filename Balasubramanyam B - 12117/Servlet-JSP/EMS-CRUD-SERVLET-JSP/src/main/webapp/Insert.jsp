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
background: url(240_F_159330343_LXJNQkkFaA6tRoYIqX4VWjTVA8ISOG8a.jpg);
  background-repeat: no-repeat;
  background-size: 100% 100%;
background-size: cover;
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
<div class="card-header text-center"><h5>Insert Employee Details: </h5></div>
<div class="card-body ">
<form action="EmployeeController" method="post">
<table style="border:none;">
<tr><td>Enter Employee Id </td><td> <input type="text" name="Id" autocomplete="off" placeholder="Enter emp id"/> </td></tr>
<tr><td>Enter Employee Name </td><td> <input type="text" name="Name" autocomplete="off" placeholder="Enter emp name"/> </td></tr>
<tr><td>Enter Employee Age </td><td> <input type="text" name="Age" autocomplete="off" placeholder="Enter emp age"/></td></tr>
<tr><td colspan="2" style="text-align: right;"><input type="submit"  class="btn btn-success btn-md" name="button" value="Insert"/> </td></tr>
</table>
</form>
</div>
</div>
</body>
</html>