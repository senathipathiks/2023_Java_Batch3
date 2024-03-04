<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%-- <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> --%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>deletion</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>
<body>
	<div class="container d-flex flex-column justify-content-center  align-items-center mt-5">
		<form id="form-1" action="Deletion" method="post">
			<table id="table-1" class="table table-bordered">
				<tr>

					<td>Student ID</td>
					<td><select name="id">
							<%
							List<Integer> ls = (List<Integer>) request.getAttribute("idList");

							if (ls != null) {
								for (Integer i : ls) {
							%>
							<option><%=i%></option>
							<%
							}
							}
							%>

					</select></td>

				</tr>
				</tbody>

			</table>
			<input type="submit" value="Delete">
		</form>
		<%
		String res1 = (String) request.getAttribute("res");
		System.out.println(res1);
		if (res1 != null) {
			if (res1 == "tru") {
				out.println("<span class=\"text-success fs-bold\"> Deleted successfully..!</span>");
			} else {
				out.println("<span class=\"text-danger\">Not Deleted successfully..!</span>");
			}
		}
		%>
	</div>
</body>
</html>