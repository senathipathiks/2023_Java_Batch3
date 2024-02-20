<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Management System</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">


</head>
<style>
body {
	background:
		url("https://coolbackgrounds.io/images/backgrounds/index/ranger-4df6c1b6.png");
	background-repeat: no-repeat;
	background-size: 100%;
}

.heading {
	background-color: #054E8A;
}

.save, .usr-btn {
	background-color: #054E8E;
	color: white;
	border-color: white;
}

.save:hover, .usr-btn:hover {
	background-color: white;
	border-color: #054E8E;
	color: #054E8E;
}

.main {
	margin-top: 135px;
	background-color: rgb(54, 9, 167, 0.3);
}

.f-in {
	color: #ffff;
}
</style>
<body>
	<div class="">
		<header>
			<nav class="navbar heading">
				<div>
					<a href="#" class="navbar-brand text-white"> User Management
						System </a>
				</div>

				<ul class="navbar-nav">
					<li><a href="<%=request.getContextPath()%>/list"
						class="btn usr-btn">Users</a></li>
				</ul>
			</nav>
		</header>

		<br>
		<div class="container col-md-5">
			<div class="card">
				<div class="card-body">

					<c:if test="${user != null}">
						<form class="inedit needs-validation" novalidate action="update" method="post">
					</c:if>


					<c:if test="${user == null}">

						<form class="inedit needs-validation" novalidate action="insert" method="post">
					</c:if>

					<caption>
						<h2>
							<c:if test="${user != null}">
                                    Edit User
                                </c:if>
							<c:if test="${user == null}">
                                    Add New User
                                </c:if>
						</h2>
					</caption>


					<c:if test="${user != null}">
						<input type="text" class="" name="id" readonly="readonly"
							value="<c:out value='${user.id}' />" />
					</c:if>


					
						<label for="validationCustom01" class="form-label">User
							Name</label> <input type="text" id="validationCustom01"
							value="<c:out value='${user.name}' />" class="form-control"
							name="name" required="required">
						<div class="valid-feedback">Looks good!</div>
					


					
						<label for="validationCustom02" class="form-label">User Email</label> 
						<input type="text" id=
							value="<c:out value='${user.email}' />" class="form-control"
							name="email" required="required">
				


					
						<label>User Country</label> <input type="text"
							value="<c:out value='${user.country}' />" class="form-control"
							name="country" required="required">
					


					<button type="submit" class="btn mt-2 save">Save</button>
					</form>
					</form>
				</div>
			</div>
		</div>
	</div>
	<footer class="container-fluid footer main">
		<div class="f-in">
			<div
				class="d-flex flex-row justify-content-center border-light border-bottom">
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
	
	<script type="text/javascript" src="validation"/>
</body>
</html>