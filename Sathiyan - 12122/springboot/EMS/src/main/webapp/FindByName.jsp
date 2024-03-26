<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@  taglib uri="jakarta.tags.core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet">
<style type="text/css">
#selectbar {
	width: 500px;
}

body {
	margin-top: 80px;
}
</style>
</head>
<body>
	<div class="conatiner-fluid">
		<div class="container">
			<div class="row">
				<div class="col-md-6"
					style="display: flex; align-items: center; justify-content: center">
					<img alt=""
						src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRv0hh6VVXifmgTKL5kPxmAQrR2NGrp4iYWWA&usqp=CAU"
						class="img-fluid">
				</div>
				<div class="col-md-6">
					<form action="findempbyName">
						<table>
							<tr>
								<td><select name="ename" class="form-control" required="required">
									<c:forEach var="name" items="${nameList }">
										<option value="${name}">${name}</option>
									</c:forEach>
								</select></td>
							</tr>
							<tr>
								<td colspan="2" algin="center"><input type="submit"
									class="btn btn-primary" value="Search" name="button" /></td>
							</tr>
						</table>
					</form>
				</div>
			</div>
		</div>
	</div>
	
	<div class="conatiner-fluid">
		<div class="container">
			<div class="row">
				<div class="col-md-6"></div>
				<div class="col-md-6">
					
					<c:if test="${ record !=null }">
							<table class="table table-bordered">
								<thead>
									<tr>
										<th>Employee Id</th>
										<th>Employee Name</th>
										<th>Employee Salary</th>
									</tr>
								</thead>

								<tbody>
								<c:forEach items="${record}" var="emp">
									<tr>
										<td>${emp.eid }</td>
										<td>${emp.ename }</td>
										<td>${emp.esalary }</td>
									</tr>
								</c:forEach>
								</tbody>
							</table>
						</c:if>	
						
				</div>
			</div>
		</div>
	</div>
	
</body>
</html>