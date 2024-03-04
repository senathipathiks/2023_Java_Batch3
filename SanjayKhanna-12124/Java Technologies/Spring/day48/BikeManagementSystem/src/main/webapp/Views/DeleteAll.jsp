<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete All</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<style type="text/css">
body{
background-image: url('https://png.pngtree.com/background/20230425/original/pngtree-motorcycle-parked-near-a-street-picture-image_2478435.jpg');
background-size: cover;
font-size: 16px;
margin-left: 420px;
margin-top: 70px;
font-weight: bold;
}
td{
padding: 10px 14px;
}
.card{
width: 600px;
}
</style>
</head>
<body>
<div class="card">
<div class="card-header text-center"><h5>Are you Sure to Delete All ? </h5></div>
<div class="card-body ">
<form action="DeleteAll" method="post" modelAttribute="pass">
<table style="border:none;">
<tr><td>Enter Password to delete </td><td>: <input type="password" name="password" autocomplete="off" placeholder="Enter passowrd" required/> </td>
<td colspan="2" style="text-align: right;"><input type="submit"  class="btn btn-primary btn-md" name="button" value="DeleteAll" /> </td></tr>
</table>
</form>
</div>
</div>
</body>
</html>