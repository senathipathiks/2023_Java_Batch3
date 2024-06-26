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
background-image: url('https://cdn5.vectorstock.com/i/1000x1000/70/59/technology-background-color-for-web-and-design-vector-34277059.jpg');
background-size: cover;
  font-size: 16px;
  margin-left: 30%;
  margin-top: 110px;
  font-weight: bold;
  opacity: 0.9;
}

body:hover {
  opacity: 9.0;
}

.card {
  border: none;
  border-radius: 10px;
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
  background-color: rgba(255, 255, 255, 0.8);
  padding: 20px;
  margin-top: 50px;
}

.card-header {
  background-color: #007bff;
  color: white;
  border-radius: 5px 5px 0 0;
  padding: 10px;
  margin-bottom: 20px;
}

.card-body {
  padding: 0;
}

table {
  width: 100%;
  border-collapse: collapse;
}

th,
td {
  padding: 10px;
  border-bottom: 1px solid #ddd;
}

th {
  font-weight: bold;
  text-align: left;
}

input[type="text"] {
  width: 100%;
  padding: 10px;
  border: none;
  border-radius: 5px;
  box-shadow: 0 2px 4px 0 rgba(0, 0, 0, 0.1);
  font-size: 16px;
  margin-bottom: 10px;
}

input[type="submit"] {
  background-color: #007bff;
  color: white;
  border: none;
  border-radius: 5px;
  padding: 10px 20px;
  cursor: pointer;
  transition: background-color 0.3s ease;
}

input[type="submit"]:hover {
  background-color: #0056b3;
}
</style>
</head>
<body>

<div class="card w-50 ">
<div class="card-header text-center"><h5>Enter the Employee Details to View : </h5></div>
<div class="card-body ">
<form action="EmpController" method="post">
 <table style="border:none; width: 100%;">

<tr>

<td style="padding: 10px; vertical-align: top;">
<table style="width: 100%;">
<tr>
<td style="padding: 5px;"><label>Enter Employee ID:</label></td>
<td colspan="3" style="padding: 5px;"><input type="text" name="empId" autocomplete="off" placeholder="Enter emp id"/></td>
</tr>

<td colspan="2" style="text-align: left; padding: 10px;">
<input type="submit"  class="btn btn-primary btn-md" name="button" value="View All"/>
</td>

<td colspan="1" style="text-align: right; padding: 10px;">
<input type="submit"  class="btn btn-primary btn-md" name="button" value="Search"/>
</td>
</tr>
</table>
</td>
</tr>
</table></form>
</div>
</div>
</body>


