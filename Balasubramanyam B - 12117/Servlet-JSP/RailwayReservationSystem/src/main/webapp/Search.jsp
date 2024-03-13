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
background-color: orange;
font-size: 16px;

margin-top: 110px;
font-weight: bold;
}
td{
padding: 5px 14px;
}
</style>
</head>
<body>
<center>
<form action="RRSController" method="post">
<table style=" font-weight: bold;">
<tr><td >Enter Train ID </td><td>: <input type="text" name="TrainID" autocomplete="off" placeholder="Enter Train id"/> </td></tr>
<tr><td  style="text-align: left;"><input type="submit"  class="btn btn-primary btn-md" name="button" value="ViewAll"/> </td>
<td  style="text-align: right;margin-left: 25%;"><input type="submit"  class="btn btn-primary btn-md" name="button" value="Search"/> </td>
</tr>
</table>
</form>
</center>
</body>
</html>