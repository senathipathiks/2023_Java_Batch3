<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	<div class="conatiner d-flex justify-content-center align-item-center mt-4">
		<form id="form-1" action="EMSController" method="post" class="border rounded p-3 shadow">
			<h1 class="ms-4">Delete Employee</h1>
			<table id="table-1" width="100%" class="">

				<tr>
					<td>Enter Employee ID</td>
					<td>
						<select name="eid" class="dropdown form-control">
						  <option class="dropdown-item">select</option>
							<% ArrayList<Integer> ls = (ArrayList<Integer>)request.getAttribute("ls");
								System.out.println(ls +"front end");
								
								if(ls != null){
								for(Integer id: ls){
							%>
							<option><%= id %> </option>
							<%} }%>
						</select>
					</td>
				</tr>

				<tr>
					<td colspan="2" class="text-center"><input class="btn btn-success"
						type="submit" name="emsAction" value="DeleteEmployee" /></td>
				</tr>

			</table>
			<%
			String result = (String) request.getAttribute("result");

			if (result == "Success") {
				out.print("<h3 class=\"text-success\">Delete " + result + "</h3>");
			} else if (result == "Failure") {
				out.print("<h3 class=\"text-failure\">Delete " + result + "</h3>");
			}
			%>

		</form>
	</div>
</body>
</html>