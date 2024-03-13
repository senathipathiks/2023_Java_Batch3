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
<div class="card-header text-center"><h5>Enter the Employee Id to Search : </h5></div>
<div class="card-body ">
<form action="EmpController" method="post">
<table style="border:none;">
<tr><td>Enter Bus No </td><td> <input type="text" name="BusNo" autocomplete="off" placeholder="Enter Bus No"/> </td></tr>
<tr><td style="text-align: left;"><input type="submit"  class="btn btn-primary btn-md" name="button" value="Viewall"/> </td>
<td style="text-align: right;"><input type="submit"  class="btn btn-info btn-md" name="button" value="Search"/> </td>
</tr>
</table>
</form>
</div>
</div>
</body>
</html>