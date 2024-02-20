<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<head>
<title>User Management Application</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css"
	integrity="sha512-DTOQO9RWCH3ppGqcWaEA1BIZOC6xxalwEsw9c2QQeAIftl+Vegovlnee1c9QX4TctnWMn13TZye+giMm8e2LwA=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>

<style>
body {
	background: linear-gradient(45deg,
                    rgba(245, 70, 66, 0.35),
                    rgba(8, 83, 156, 0.3)),
		url("https://coolbackgrounds.io/images/backgrounds/index/ranger-4df6c1b6.png");
	background-repeat: no-repeat;
	background-size: 100%;
}

.row {
	margin: 0px;
}

.heading {
	background-color: #054E8A;
}

.usr-btn {
	background-color: #054E8E;
	color: white;
	border-color: white;
}

.usr-btn:hover {
	background-color: white;
	border-color: #054E8E;
	color: #054E8E;
}

.heading1 {
	color: #760F6F;
}
.main{
	margin-top: 192px;
	background-color: #753161;
}
.f-in{
	color: #ffff;
}
</style>

<body>

	<div >
		<header>
			<nav class="navbar heading">
				<div>
					<a href="#" class="navbar-brand text-white"> Employee Management
						App </a>
				</div>

				<ul class="navbar-nav">
					<li><a href="<%=request.getContextPath()%>/list"
						class="btn usr-btn">Employees</a></li>
				</ul>
			</nav>
		</header>
		<br>
		<!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

		<div class="container">
			<h3 class="text-center heading1">Employee List</h3>
			<hr>
			<div class="container text-left">

				<a href="<%=request.getContextPath()%>/new" class="btn btn-success">Add
					New User</a>
			</div>
			<br>
			<div class="shadow p-3 mb-5 bg-white rounded">
				<table class="table">
					<thead>
						<tr>
							<th>ID</th>
							<th>Name</th>
							<th>Email</th>
							<th>Country</th>
							<th>Actions</th>
						</tr>
					</thead>
					<tbody>

						<c:forEach var="user" items="${listUser}">

							<tr class="border-bottom">
								<td><c:out value="${user.id}" /></td>
								<td><c:out value="${user.name}" /></td>
								<td><c:out value="${user.email}" /></td>
								<td><c:out value="${user.country}" /></td>
								<td><a href="edit?id=<c:out value='${user.id}'/>"
									class="btn btn-warning">Edit</a> &nbsp;&nbsp;&nbsp;&nbsp; <a
									href="delete?id=<c:out value='${user.id}'/>"
									class="btn btn-danger">Delete</a></td>
							</tr>
						</c:forEach>
						<!-- } -->
					</tbody>

				</table>
			</div>
		</div>

	</div>

	<footer class="container-fluid footer main">
		<div class="f-in">
			<div class="d-flex flex-row justify-content-center border-light border-bottom">
			<div class="p-2">Home</div>
			<div class="p-2">Feature</div>
			<div class="p-2">Pricing</div>
			<div class="p-2">FAQs</div>
			<div class="p-2">About</div>
		</div>
		<div class="d-flex bd-highlight justify-content-center">
			<div class="p-2">
				<i class="fa-regular fa-copyright"></i> 2024 Relevantz Technology
				Services,Inc. All rights reserved
			</div>
		</div>
		</div>
	</footer>
</body>

</html>