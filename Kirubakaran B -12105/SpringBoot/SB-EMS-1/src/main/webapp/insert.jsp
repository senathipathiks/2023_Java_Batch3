<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<style type="text/css">
* {
	margin: 2px;
	padding: 5px;
	box-sizing: border-box;
	font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande',
		'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
	cursor: pointer;
}

body {
	margin-top: 50px;
	height: 80vh;
	width: 100%;
	display: flex;
	justify-content: center;
	align-items: center;
	background-position: 50%;
	background-repeat: no-repeat;
	background-size: 20%;
	background: rgb(238, 211, 174);
	background: radial-gradient(circle, rgba(238, 211, 174, 1) 0%,
		rgba(148, 233, 168, 1) 100%);
}

label {
	font-size: 20px;
	color: black;
	margin-left: 10%;
	opacity: .8;
	text-shadow: 2px 2px 4px rgba(0, 0, 0, .2);
}

h1 {
	font-size: 28px;
	text-align: center;
	color: green;
	text-shadow: 2px 2px 4px rgba(0, 0, 0, .2);
}

#button {
	width: 50%;
	margin: 3% auto;
	color: white;
	font-size: 20px;
	opacity: .7;
	background: rgba(255, 255, 255, 0.06);
	padding-top: 30px;
	padding: 10px 30px;
	border: 3px;
	outline: 3px;
	border-radius: 20px;
	background-color: green;
	text-shadow: 2px 2px 4px rgba(255, 255, 255, 0.06);
	box-shadow: 3px 3px 5pxrgba(31, 38, 135, .37);
	border-left: 1px solid rgba(255, 255, 255, .3);
	border-top: 1px solid rgba(255, 255, 255, .3);
}

.td {
	width: 200px;
}
</style>

</head>
<body>
	<div class="box">
		<form action="Insertemp">
			<table width="80%" align="center" border="0">
				<tr>
					<td colspan="3" align="center"><h1>Insert page</h1></td>
				</tr>
				<tr>
					<td>EmpId</td>
					<td><input type="number" name="eid" placeholder="Employee id"
						required="required" /></td>
				</tr>
				<tr>
					<td>EmpName</td>
					<td><input type="text" name="ename"
						placeholder="Employee name" required="required" /></td>
				</tr>
				<tr>
					<td>Salary</td>
					<td><input type="text" name="esal"
						placeholder="Employee salary" required="required" /></td>
				</tr>
				<tr>
					<td colspan="3" align="center"><input type="submit"
						value="Insert" class="btn btn-success"></td>
				</tr>
			</table>
			<center>
			<font color="green">${msg}</font></center></form></div>
</body>
</html>