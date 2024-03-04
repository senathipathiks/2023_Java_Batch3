<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@page import="com.springCoreMvc.bean.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>fetch</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<style type="text/css">
#opti {
	width: 110px;
}

#del {
	display: none;
}
</style>
</head>
<body>
	<div
		class="container mt-5 d-flex flex-column justify-content-center  align-items-center">
		<h1 class="text-center">Fetch operations</h1>
		<form action="fetch" method="get" class="mt-3">
			<table class="table">
				<tr>
					<td><h2 class="font-weight-bold">Student ID :</h2></td>
					<td><select name="id" class="form-select" id="opti">
							<option selected class="form-control">select</option>
							<%
							List<Integer> ls = (List<Integer>) request.getAttribute("idList");

							if (ls != null) {
								for (Integer i : ls) {
							%>
							<option class="form-control"><%=i%></option>
							<%
							}
							}
							%>

					</select></td>
					<td><input class="btn btn-primary" type="submit" name="button"
						value="Find"></td>

				</tr>
			</table>
		</form>
		<form id="form-1" action="findAll" class="border-bottom ">
			<input class="btn btn-warning" type="submit" name="button"
				value="Find All">
		</form>
		<form id="form-2" action="update">
			<table class="table">
				<tr>
					<th>Student ID</th>
					<th>Student Name</th>
					<th>Student City</th>
					<th>Operation1</th>
					<th>Operation2</th>
				</tr>

				<%
				Student s = (Student) request.getAttribute("stu");
				List<Student> lsStu = (List<Student>) request.getAttribute("ls");
				System.out.println(s);
				if (s != null) {
					out.println("<tr><td><input type=\"text\" name=\"id\" class=\"form-control\" readonly=\"readonly\" value="
					+ s.getId() + "></td>" + "<td><input type=\"text\" name=\"sname\" class=\"form-control\" value="
					+ s.getSname() + "></td>" + "<td><input type=\"text\" name=\"city\" class=\"form-control\" value="
					+ s.getCity() + "></td>"
					+ "<td><input type=\"submit\" class=\"btn btn-warning\" value=\"update\"/></form></td>" + "<td>"
					+ "<input type=\"text\" id=\"del\" name=\"id\" class=\"form-control\" readonly=\"readonly\" value="
					+ s.getId() + ">"
					+ "<form action=\"Deletion\" method=\"post\"><input type=\"submit\" class=\"btn btn-danger\" value=\"delete\"/></form></td></tr>");
				}
				if (lsStu != null) {
					for (Student s1 : lsStu) {
						out.println("<tr><td><input type=\"text\" name=\"id\" class=\"form-control\" readonly=\"readonly\" value="
						+ s1.getId() + "></td>" + "<td><input type=\"text\" name=\"sname\" class=\"form-control\" value="
						+ s1.getSname() + "></td>" + "<td><input type=\"text\" name=\"city\" class=\"form-control\" value="
						+ s1.getCity() + "></td>"
						+ "<td><input type=\"submit\" class=\"btn btn-warning\" value=\"update\"/></form></td>" + "<td>"
						+ "<input type=\"text\" id=\"del\" name=\"id\" class=\"form-control\" readonly=\"readonly\" value="
						+ s1.getId() + ">"
						+ "<form action=\"Deletion\" method=\"post\"><input type=\"submit\" class=\"btn btn-danger\" value=\"delete\"/></form></td></tr>");
					}
				}
				%>

			</table>
	</div>
</body>
</html>