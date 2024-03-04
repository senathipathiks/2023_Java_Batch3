<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core/c"%> --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FetchAll</title>
</head>
<body>
	<div id="fetchtoggle"
		class="mt-2 container d-flex flex-column  justify-content-center  align-items-center">

		<c:if test="${res = 'tru' }">

		</c:if>
		<h1 class="text-center">Edit delete Operation</h1>
		<form action="ControllerServlet" method="post">
			<a href="<%=request.getContextPath()%>"></a>
			<table class="table table-bordered">
				<tr>
					<th>Student ID</th>
					<th>Student Name</th>
					<th>City</th>
					<th>Operation1</th>
					<th>Operation2</th>
				</tr>


				<%
				System.out.println(request.getAttribute("stu"));
				%>
				<c:forEach items="${stu}" var="stu">
					<tr>
						<td><input type="number" name="sid" readonly="readonly"
							value="${stu.id}" /></td>
						<td><input type="text" name="sname1" value="${stu.sname}">
						</td>
						<td><input type="text" name="scity1" value="${stu.city}">
						</td>
						<td><input type="submit" name="edit" value="${stu.id}" /></td>
						<td><input type="submit" name="delete" value="${stu.id}" /></td>
					</tr>

				</c:forEach>

			</table>
		</form>
	</div>
</body>
</html>