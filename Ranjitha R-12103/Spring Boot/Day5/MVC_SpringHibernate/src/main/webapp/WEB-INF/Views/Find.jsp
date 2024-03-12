<%@page import="com.spring.bean.Student"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<style>
body {
	background-color: teal;
	font-family: monospace;
}

h5 {
	text-shadow: 1px 2px;
}

#colr2 {
	background: linear-gradient(to right, #C0C0C0, #808080);
}

#txt {
	font: bold;
}

#tbl {
	border: 2px solid black;
}
</style>
<script>
	function Validation() {
		var sid = document.getElementById("sid").value;
		if (sid == "") {
			alert("sid cannot be empty");
		}
	}
</script>
</head>
<body>
	<br>
	<br>
	<form action="FindStud" method="post" modelAttribute="bean">
		<font size="5px" color="black">
			<center>

				<h5>
					<b>Find Student Details</b>
				</h5>
				<table border="3" color="black" align="center">
					<tr>
						<td>Student Id:</td>
						<td><select type="text" required="required" name="sid"
							id="sid">
							
								<%
								ArrayList<Integer> list = (ArrayList<Integer>) request.getAttribute("key");
								for (Integer i : list) {
								%>
								<option value="<%=i%>"><%=i%></option>
								<%
								}
								%>
						</select></td>
					</tr>
					<tr>
						<td colspan="2"><input type="submit"
							class="btn btn-secondary btn-lg btn-block" value="Find"
							name="button" onclick="Validation()" id="colr1"></td>
					</tr>
				</table>

			</center>
		</font>
	</form>
	<%
	Student stud = (Student) request.getAttribute("bean");
	if (stud != null) {
	%>
	<br><br><center><table border="2">
		<tr>
			<th>Student Id</th>
			<th>Student Name</th>
			<th>Student City</th>
		</tr>
		<tr>
			<td><%=stud.getSid()%></td>
			<td><%=stud.getSname()%></td>
			<td><%=stud.getScity()%></td>
		</tr>

	</table></center>
	<%
	}else{
		String msg=(String)request.getAttribute("msg");
		if(msg!=null){
			out.println("<h3>"+msg+"</h3>");
		}
		
	}
	%>
</body>
</html>