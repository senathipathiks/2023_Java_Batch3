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
background-image: url('https://www.bhmpics.com/downloads/bus-hd-images-Wallpapers/25.5749730-bus-wallpapers.jpg');
background-size: cover;
font-size: 16px;
margin-left: 30%;
margin-top: 110px;
font-weight: bold;
}
td{
padding: 10px 14px;
}
#card{
box-shadow: 8px 8px 10px 10px rgba(0,0,0,0.6);
}
</style>
</head>
<body>
<div class="card w-50 " id="card">
<div class="card-header text-center"><h5>Are you sure to delete all Records ? </h5></div>
<div class="card-body ">
<form action="Controller" method="post">
<table style="border:none;">
<tr><td>Enter Password to delete </td><td>: <input type="password" name="pass" autocomplete="off" placeholder="Enter passowrd" required/> </td></tr>
<tr><td colspan="2" style="text-align: right;"><input type="submit"  class="btn btn-primary btn-md" name="button" value="DeleteAll"/> </td></tr>
</table>
</form>
</div>
</div>
</body>
</html>