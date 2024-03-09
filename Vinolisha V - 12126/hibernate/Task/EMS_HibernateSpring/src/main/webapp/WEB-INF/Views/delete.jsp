<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
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
	margin-top: 10px;
	
}

table {
	
	border: 50px solid transparent;
	align-items: center;
	font-family: Verdana, Geneva, Tahoma, sans-serif;
	border-radius: 20px;
	
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
select {
	width:100px;
	padding:10px;
}

</style>
</head>
<body>
<form action="deletion" method="post" modelAttribute="bean">
	<table id="container" align="center">
	
		<tr><td>Employee Id</td><td>
		
		<select name="empid" class="select">
		<%
			ArrayList<Integer> List=(ArrayList<Integer>) request.getAttribute("key");
			for(Integer i: List){
				out.println("<option value='"+i+"'>"+i+"</option>");
			}
		%>
		</select>
		
		
		</td></tr>
		
		<tr><td colspan="2"align="left"><input class="button" type="submit" value="Delete Employee" name="button"/></td></tr>
	</table>
	</form>
	<br>
	<%  
		String result=(String)request.getAttribute("msg");
	if(result !=null){
		out.println("<font color=black><b>"+result+"</b></font>");
	}
	%>

</body>
</html>