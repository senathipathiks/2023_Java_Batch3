<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<style type="text/css">
body{
background-image: url('');
background-size: cover;
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
<div class="card w-50 ">
<div class="card-header text-center"><h5>Add the details of the New Employees : </h5></div>
<div class="card-body ">
<form action="EmpController" method="post">
<table style="border:none;">
<tr><td>Enter Employee Id </td><td>: <input type="text" name="empId" autocomplete="off" placeholder="ID"/> </td></tr>
<tr><td>Enter Employee Name </td><td>: <input type="text" name="empName" autocomplete="off" placeholder="Name"/> </td></tr>
<tr><td>Enter Employee Age </td><td>: <input type="text" name="empAge" autocomplete="off" placeholder="Age"/></td></tr>
<tr><td colspan="2" style="text-align: right;"><input type="submit"  class="btn btn-primary btn-md" name="button" value="Insert"/> </td></tr>
</table>
</form>
</div>
</div>
</html>