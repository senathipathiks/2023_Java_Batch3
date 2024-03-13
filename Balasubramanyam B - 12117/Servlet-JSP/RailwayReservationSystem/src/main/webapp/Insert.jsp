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
background-color:orange;
font-size: 16px;
margin-left: 30%;
margin-top: 45px;
font-weight: bold;
}
td{
padding: 2px 14px;
}
</style>
</head>
<body>
<div class="card w-50 ">
<div class="card-header text-center"><h5>Enter the Train Details to Insert : </h5></div>
<div class="card-body ">
<form action="RRSController" method="post">
<table style="border:none;">
<tr><td>Enter Train Id </td><td>: <input type="text" name="TrainID" autocomplete="off" placeholder="Enter Train id"/> </td></tr>
<tr><td>Enter Train Name </td><td>: <input type="text" name="TrainName" autocomplete="off" placeholder="Enter Train name"/> </td></tr>
<tr><td>Enter Train Type </td><td>: <input type="text" name="TrainType" autocomplete="off" placeholder="Enter Train Type"/></td></tr>
<tr><td>Enter No of Seats </td><td>: <input type="text" name="No_of_seats" autocomplete="off" placeholder="Enter no of seats"/> </td></tr>
<tr><td>Enter Train Source  </td><td>: <input type="text" name="Source" autocomplete="off" placeholder="Enter Train Source"/> </td></tr>
<tr><td>Enter Train Destination </td><td>: <input type="text" name="Destination" autocomplete="off" placeholder="Enter Train Destination"/></td></tr>
<tr><td>Enter Train Fare </td><td>: <input type="text" name="Fare" autocomplete="off" placeholder="Enter Fare"/></td></tr>
<tr><td colspan="2" style="text-align: right;"><input type="submit"  class="btn btn-primary btn-md" name="button" value="Insert"/> </td></tr>
</table>
</form>
</div>
</div>
</body>
</html>