<%-- <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ page isELIgnored = "false" %> --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<style type="text/css">
td {
	height: 40px;
}

input {
	height: 40px;
	width: 300px;
	border-radius: 20px
}
body {
  background-image: url('https://images.pexels.com/photos/518244/pexels-photo-518244.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1');
}
</style>
</head>
<body>
	<div class="form-group">
		<form action="PerfromDeleteByName" method="post">
			<div class="form-group">
				<table width="" align="center" border="0">
					<tr>
						<td>Employee Name:</td>
						<td><select class="form-control" type="text" name="empName" required="required" />
							<c:forEach var="name" items="${NameList}">
								<option value="${name}">${name}</option>
							</c:forEach></select></td>
					</tr>
					<tr>
						<td align="center"><input class="btn btn-primary"
							type="submit" value="DeleteEmployeeByName" name="emsAction"
							required="required" /></td>
					</tr>

				</table>
				<center>
					<b>${msg}</b>
				</center>
		</form>
	</div>
	<br>
</body>
</html>