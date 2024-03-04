<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>
<body>
	<div
		class="mt-5 container d-flex flex-column  justify-content-center  align-items-center">
		<h1 class="text-center">Insert Operation</h1>
		<form action="save" method="post" class="mt-3">
			<table class="table table-borderless">

				<tr>
					<th>Student Name :</th>
					<td><input type="text" name="sname" class="form-control" /></td>
				</tr>
				<tr>
					<th>City :</th>
					<td><input type="text" name="city" class="form-control" /></td>
				</tr>
				<tr>
					<td colspan="2" class="text-center"><input
						class="btn btn-primary" type="submit" value="Insert" name="button" /></td>
				</tr>
			</table>
		</form>

		<%
		String res1 = (String) request.getAttribute("res");
		System.out.println(res1);
		%>

		<%
		if (res1 != null) {
			if (res1 == "tru") {
				out.println("<span class=\"text-success\"> insert successfully..!</span>");
			} else {
				out.println("<span class=\"text-danger\">Not insert successfully..!</span>");
			}
		}
		%>
	</div>
</body>
</html>