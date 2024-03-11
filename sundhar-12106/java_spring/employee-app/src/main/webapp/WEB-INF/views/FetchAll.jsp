<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FetchAll page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
	
	<style type="text/css">
	
		.btn{
			width: 100px;
		}
	</style>
</head>
<body>
	<div
		class="container mt-5 m-3 d-flex justify-content-center align-item-center">
		<div
			class="container d-flex   justify-content-center align-item-center">
			<form id="form-1" action="upFAll" method="post"
				class="border shadow p-3 rounded">
				<h2>Fetch All Operation</h2>
				<table>
					<tr>
						<th>Emlpoyee ID</th>
						<th>Emlpoyee Name</th>
						<th>Emlpoyee Salary</th>
						<th>Operation1</th>
						<th>Operation2</th>
					</tr>
					<%-- <%
					ArrayList<Employee> ls = (ArrayList<Employee>) request.getAttribute("ls");

					if (ls != null) {
						for (Employee e : ls) {
					%> --%>
					<c:if test="${ls != null }">
						<c:forEach items="${ls}" var="ls">
							<form id="form-1" action="upFAll" method="post">
							<tr>
							<c:if test="${ls.getEid() == ids }">
								<td><input type="number" readonly="readonly" name="eid"
									class="form-control" value="${ls.getEid() }" /></td>
								<td><input type="text" name="name" class="form-control"
									value="${ls.getName() }"></td>
								<td><input type="text" name="salary" class="form-control"
									value="${ls.getSalary() }"></td>
								<td><input type="submit" class="btn btn-secondary"
									value="Update"></td>
									<td><a href="upDel?id=${ls.getEid()}" type="submit"
									class="btn btn-danger">Delete</a></td>
							</c:if>
								<c:if test="${ls.getEid() != ids }">
									<td><input type="number" readonly="readonly" name="eid"
									class="form-control" value="${ls.getEid() }" /></td>
								<td><input type="text" name="name" class="form-control" readonly="readonly"
									value="${ls.getName() }"></td>
								<td><input type="text" name="salary" class="form-control" readonly="readonly"
									value="${ls.getSalary() }"></td>
								<td><a href="Edit?id=${ls.getEid()}" class="btn btn-warning">Edit</a></td>
								<td><a href="upDel?id=${ls.getEid()}" 
									class="btn btn-danger">Delete</a></td>
								</c:if>

							</tr>
							</form>

						</c:forEach>
					</c:if>

				</table>
		</div>
	</div>
	<!-- Insert form -->
	<div
		class="container-fluid   d-flex justify-content-center align-item-center mt-5">
		<form id="form-1" action="findAllInsert" method="post"
			class="border shadow rounded p-3">
			<h1 class="ms-4">Insert Employee</h1>
			<table id="table-1" class="">

				<tr>
					<td>Enter Employee ID</td>
					<td><input class="form-control" name="eid" type="number"></td>
				</tr>
				<tr>
					<td>Enter Employee Name</td>
					<td><input class="form-control" name="name" type="text"></td>
				</tr>

				<tr>
					<td>Enter Employee salary</td>

					<td><input class="form-control" name="salary" type="text"></td>
				</tr>
				<tr>
					<td></td>
				</tr>


				<tr>
					<td colspan="2" class="text-center"><input
						class="btn btn-success" type="submit" name="emsAction"
						value="Insert" /></td>
				</tr>

			</table>

			<c:if test="${ result == 'Success' }">
				<h3 class="text-success">
					Insertion
					<c:out value="${result}" />
				</h3>
			</c:if>
			<c:if test="${ result == 'Failure' }">
				<h3 class="text-success">
					Insertion
					<c:out value="${result}"></c:out>
				</h3>
			</c:if>
		</form>
	</div>

</body>
</body>
</html>