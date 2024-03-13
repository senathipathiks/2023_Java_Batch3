<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<%@ taglib prefix="c" uri="jakarta.tags.core"%>

    
<!DOCTYPE html>
<html>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

<head>
<meta charset="ISO-8859-1">
<title>Insert Employee</title>
<style>
body{
display: flex;
justify-content: center;
flex-direction: column;
align-items: center;
}
.container{
background-color: black;
width: 320px;
height: 300px;
display: flex;
color: white;
justify-content: center;
align-items: center;
font-family: verdana;
font-size: 14px;
border-radius: 15px;
margin-top: 5%;

box-shadow: 0px 1px 1px rgba(3, 7, 18, 0.02),
  0px 5px 4px rgba(3, 7, 18, 0.03),
  0px 12px 9px rgba(3, 7, 18, 0.05),
  0px 20px 15px rgba(3, 7, 18, 0.06),
  0px 32px 24px rgba(3, 7, 18, 0.08);


}

#submit-btn{
margin-top: 10px;
background-color: red;
color: white;
border-style: none;

}

.result{
color: green;
font-family: sans-serif;
font-size: 22px;
margin-top: 30px;
}
</style>
</head>
<body>
	<div class = "container">
	
	<form action = "performInsert" method = "post">
	<table >
	<tr>
	<p>ADD EMPLOYEE</p></tr>
	<tr><td>Employee ID<td>
		<td><input type = "text" name = "eid" required = "required">
	<tr>
	<tr><td>Employee Name<td>
		<td><input type = "text" name = "ename" required = "required">
	<tr>
	<tr><td>Employee Salary<td>
		<td><input type = "text" name = "esalary" required = "required">
	<tr>
	<tr>
		<td><input type = "submit" id = "submit-btn" value = "Insert"  class = "btn btn-primary" name = "btn" /></td>
	<tr>
	</table>
	</form>
	</div>
	
	<div class = "result">
		

	<h4>${msg}</h4>
	
	</div>
	
</body>
</html>