<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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


#container {
	background-color: #ccc;
	margin-left: none;
	padding: 25px 50px;
	margin-top: 10px;
	
}

table {
	
	border: 30px solid transparent;
	align-items: center;
	font-family: Verdana, Geneva, Tahoma, sans-serif;
	border-radius: 20px;
}

input {
	height: 40px;
	width: 300px;
	border-radius: 10px;
	padding: 20px;
}

.button {
	padding: 10px 10px;
	font-weight: bold;
	justify-content: center;
	border-radius: 10px;
	width: 200px;
	border-radius: 5px;
	outline: none;
	background-color: #023095;
	margin-top: 30px;
	display: inline-block;
	padding-left: 30px;
	align-items: center;
	color: white;
	cursor: pointer;
	border: none;
	box-shadow: 0 2px 10px rgba(0, 0, 0, 2);
}

td {
	padding: 10px;
	outline: none;
}


</style>
</head>
<body>
	<form action="insertion" method="post" modelAttribute="bean">
		<div class="head">
		</div>

		<table id="container" align="center">
			<tr>
				<td>Employee Id</td>
				<td><input type="text" name="empid" /></td>
			</tr>
			<tr>
				<td>Employee Name</td>
				<td><input type="text" name="empName" /></td>
			</tr>
			<tr>
				<td>Employee Salary</td>
				<td><input type="text" name="empSalary" /></td>
			</tr>
			<tr>
				<td colspan="2" align="left"><input class="button"
					type="submit" value="insert" name="button" /></td>
			</tr>
		</table>
	</form>
		
	<%
	String msg=(String)request.getAttribute("msg");
	/* if(msg!=null && msg.equals("success")){
		out.print("<h1>Record inserted Successfully</h1>");
	}else if(msg!=null) {
		out.print("<h1>Record inserted failed</h1>");
	} */
	
	if(msg.equals("Record Inserted Successfully")){
		out.print("<h1>"+msg+"</h1>");
	}
	%>
	
</body>
</html>