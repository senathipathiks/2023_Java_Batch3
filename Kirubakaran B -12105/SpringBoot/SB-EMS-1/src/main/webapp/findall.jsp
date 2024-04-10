<%@page import="com.ems.bean.Employee"%>
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
	margin: 10px;
	padding: 12px;
	box-sizing: border-box;
	font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande',
		'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
	cursor: pointer;
}

body {
	height: 100vh;
	width: 100%;
	display: flex;
	justify-content: center;
	align-items: center;
	background-position: 100%;
	background-repeat: no-repeat;
	background-size: 120%;
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
</style>
</head>
<body>
	<div class="box">
		<table width="80%" align="center" border="1">
			<tr>
				<th>Employee id</th>
				<th>Employee name</th>
				<th>Employee salary</th>
				<th>Action</th>
				<th>Action</th>
			</tr>
			<c:forEach items="${list1}" var="list2">
				<form action="removeEmp">
					<tr>
						<td><input type="text" name="eid" value="${list2.getEid()}"
							readonly="readonly" required="required"></td>
						<td><input type="text" name="ename"
							value=" ${list2.getEname()}" required="required"></td>
						<td><input type="text" name="esal"
							value=" ${list2.getEsal()}" required="required"></td>
						<td><input type="submit" value="Remove" class="btn btn-danger" name="btn"></td>
						<td><input type="submit" value="Edit"  class="btn btn-warning" name="btn"></td>
					</tr>
				</form>
			</c:forEach>
		</table>
	
	<br>

	<table>
		<form action="Addition" align="center" border="1">
			<tr>
				<th>Employee id</th>
				<th>Employee name</th>
				<th>Employee salary</th>
				<th>Action</th>
			</tr>
			<tr>
				<td><input type="text" name="eid" required="required" /></td>
				<td><input type="text" name="ename" required="required" /></td>
				<td><input type="text" name="esal" required="required" /></td>
				<td><input type="submit" value="Add" class="btn btn-success" name="btn" /></td>
			</tr>
		</form>
	</table>
	</div>
</body>
</html>
