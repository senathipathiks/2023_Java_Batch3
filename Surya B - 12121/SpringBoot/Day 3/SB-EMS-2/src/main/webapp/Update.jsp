<%@page import="com.ems.bean.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ page import="java.util.*" %>
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Employee</title>
<style>
body{
display: flex;
justify-content: center;
align-items: center;
}
.container{
background-color: black;
width: 400px;
height: 300px;
display: flex;
color: white;
justify-content: center;
align-items: center;
font-family: verdana;
font-size: 14px;
border-radius: 15px;
margin-top: 5%;
padding: 10px;
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
width: 80px;
height: 30px;
border-radius: 10px;
font-weight: 600;

}

#submit-btn:hover {
	cursor: pointer;
}
</style>
</head>
<body>
	<div class = "container">

	<table >
	<tr><td>UPDATE</td></tr>

	<form action = "PerformFetch" >

	<tr>
	
		<td>
		<select  name = "eid" required = "required">
		<option>Select a ID</option>
		<c:forEach var = "id" items = "${list}">
		<option value = "${id}">${id} </option>
		</c:forEach>
  		</select>
  		</td>
	</tr>
	
	
		
	</tr>
	<tr>
	<td><input type = "submit" id = "submit-btn"  value = "Fetch" name = "btn" /></td>
	</tr>
	</table>
	</form>
	
	

	
	<table>
	<form action = "PerformUpdate" >
	<tr><td>Employee ID<td>
		<td><input type = "text" name ="eid" value = "${emp.eid}" >
	</tr>
	<tr><td>Employee Name<td>
		<td><input type = "text" name = "ename" value = "${emp.ename}">
	</tr>
	<tr><td>Employee Salary<td>
		<td><input type = "text" name = "esalary" value = "${emp.esalary}">
	</tr>
	<tr>
		<td><input type = "submit" id = "submit-btn" value = "Update" name = "btn" /></td>
	</tr>
	</table>
	</form>
	
	
	</div>
	

</body>
</html>