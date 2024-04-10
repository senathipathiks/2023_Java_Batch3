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
	width: 500px;
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

td, th {
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
			<form action="fetchUpdate">
				<table id="container" align="center">
					<tr>
						<td>Employee Id</td>
						<td><select class="form-control" name="eid"
							style="width: 100%;" required="required">
								<c:forEach var="id" items="${IdList}">
									<option value="${id}">${id}</option>
								</c:forEach>
						</select></td>
					</tr>

					<tr>
						<td colspan="2" align="left"><input id="button"
							class="form-control" type="submit" value="Fetch Employee"
							name="button" /></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
	<form action="UpdateEmployee">
		<c:if test="${record!=null}">
			<table id="container" align="center">
				<tr>
					<td>Employee Id</td>
					<td><input type="text" class="form-control" name="eid"
						required="required" readonly="readonly" value="${record.eid}" /></td>
				</tr>
				<tr>
					<td>Employee Name</td>
					<td><input type="text" class="form-control" name="ename"
						required="required" value="${record.ename}"/></td>
				</tr>
				<tr>
					<td>Employee Salary</td>
					<td><input type="text" class="form-control" name="esalary"
						required="required" value="${record.esalary}" /></td>
				</tr>
				<tr>
					<td colspan="2" align="left"><input id="button"
						class="form-control" type="submit" value="Update" name="button" /></td>
				</tr>
			</table>
		</c:if>
	</form>

	<center>
		<h3>${msg}</h3>
	</center>

</body>
</html>