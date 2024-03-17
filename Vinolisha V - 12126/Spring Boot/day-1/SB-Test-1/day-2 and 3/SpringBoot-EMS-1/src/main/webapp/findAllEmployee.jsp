<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css"
	integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
<style>
input {
	border: none;
	background-color: transparent;
	text-align: center;
}
</style>

</head>
<body>
	<div class="container"></div>
	<div class="container">
		<table class="table table-hover text-center "
			style="margin-top: 50px;">
			<thead class="table-dark">
				<tr>
					<th scope="col">EmployeeID</th>
					<th scope="col">Employee Name</th>
					<th scope="col">Employee Salary</th>
					<th scope="col" colspan="2" align="center">Action</th>

				</tr>
			</thead>
			<tbody>

				<c:forEach items="${IdList}" var="IdList">

					<tr>
						<form action="performEdit">
							<th scope="row"><input type="text" name="eid"
								value=" ${IdList.eid}" readonly="readonly"></th>
							<td><input type="text" name="ename" value=" ${IdList.ename}"></td>
							<td><input type="text" name="esalary"
								value=" ${IdList.esalary}"></td>


							<td><input type="submit" value="Edit" name="emsBtn"class="btn btn-dark">
								 <input type="submit" value="Delete" name="emsBtn" class="btn btn-dark" style="margin-left:10px;"> 
								</td>
						</form>
					</tr>

				</c:forEach>
			</tbody>
		</table>

	</div>
	
	
	
	<div class="container"></div>
	<div class="container">
	
	
	

		
		<table class="table table-hover text-center" style="margin-top: 60px;">
			<thead class="table-dark">
			<form action="performAdd">
				<tr>
					<th scope="col">EmployeeID</th>
					<th scope="col">Employee Name</th>
					<th scope="col">Employee Salary</th>
					<th scope="col" colspan="2" align="center">Action</th>
				</tr>
				
			</thead>

		<tbody>
			<tr>
			
				<td><input type="text" name="eid"></td>
				<td><input type="text" name="ename"></td>
				<td><input type="text" name="esalary"></td>
				<td><input type="submit" name="btn" value="AddNew" class="btn btn-dark"></td>
			</tr>
			</form>
			<h1>${msg}</h1>
			
		</tbody>
			
			</table>
		
		
			</div>

</body>
</html>