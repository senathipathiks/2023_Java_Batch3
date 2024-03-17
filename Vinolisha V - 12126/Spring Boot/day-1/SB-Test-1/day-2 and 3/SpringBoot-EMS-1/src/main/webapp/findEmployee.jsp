<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<style>
#container {
	background-color: #d3d3d3;
	margin-left: none;
	padding: 25px 50px;
	margin-top: 50px;
}

table {
	border: 30px solid transparent;
	align-items: center;
	font-family: Verdana, Geneva, Tahoma, sans-serif;
	border-radius: 20px;
	width:500px;
}

input {
	height: 40px;
	width: 300px;
	border-radius: 10px;
	padding: 20px;
}

#button {
	padding: 10px 10px;
	font-weight: bold;
	justify-content: center;
	border-radius: 10px;
	width: 180px;
	border-radius: 5px;
	outline: none;
	background-color: #fffff;
	margin-top: 30px;
	display: inline-block;
	padding-left: 30px;
	align-items: center;
	color: black;
	cursor: pointer;
	border: none;
	box-shadow: 0 2px 10px rgba(0, 0, 0, 2);
}

td,th {
	padding: 10px;
	outline: none;
	color: black;
}

h3 {
	align-items: center;
	font-family: Verdana, Geneva, Tahoma, sans-serif;
}
#new {
	background-color: rgba(150, 150, 150, 0.1);
	width: 400px;
	color: white;
	padding: 10px 20px 30px;
	margin-top: 10px;
}
</style>
</head>
<body>
	
		<div class="head"></div>

		<div class="row">
			<div class="col-md-6"></div>
			<div class="col-md-6">
			<form action="performFind">
				<table id="container" align="center">
					<tr>
						<td>Employee Id</td>
						<td>
						<select class="form-control" name="eid" style="width:100%;"
							required="required">
							<c:forEach var="id" items="${IdList}">
							<option value="${id}">${id}</option>
							</c:forEach>
						</select>
						</td>
					</tr>

					<tr>
						<td colspan="2" align="left"><input id="button"
							class="form-control" type="submit" value="Find Employee" name="button" /></td>
					</tr>
				</table>
				</form>
			</div>
		</div>

	<c:if test="${record!=null}">
	<table id="new" align="center">
	
			<tr>
			<th colspan="2" align="center"/>Employee Records</th>
			</tr>
			<tr>
				<td>Employee Id</td>
				<td>${record.eid}</td>
			</tr>
			<tr>
				<td>Employee Name</td>
				<td>${record.ename}</td>
			</tr>
			<tr>
				<td>Employee Salary</td>
				<td>${record.esalary}</td>
			</tr>
			
		</table>
		</c:if>	

	<center>
		<h3>${msg}</h3>
	</center>

</body>
</html>