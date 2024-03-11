
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body{
background-image: url("https://www.einnosys.com/wp-content/uploads/2023/09/Best-Software-Solutions-for-Education-Industry.png");
 
background-position: center;
background-repeat: no-repeat;
background-size:cover;	
margin-top: 70px;
}
td{
height: 40px;
color: white;
 
}
b{
color: white;
}
input{
height: 40px;
width: 300px;
border-radius: 20px;
}
.button{
border: 2px solid grey;
background-color: #00008B;
color: white;
font-weight: bold;
}
table{
border: 4px solid white;
padding: 0px;
}
 
</style>
</head>
<body>
	<form action="deleteEmployee" method="post" modelAttribute="bean">
		<table widht="80%" align="center" border="none">
			<tr>
				<td><b>Employee Id</b></td>
				<td><select name="empId">
						<%
						ArrayList<Integer> idList = (ArrayList<Integer>) request.getAttribute("IdList");
						for (Integer i : idList) {
							out.println("<option value='" + i + "'>" + i + "</option>");
						}
						%>
				</select>
					<tr>
				<td colspan="2" align="center"><input class="button"
					type="submit" value="Delete Employee" name="emsAction" /></td>
			</tr>
 
 
 
 
 
		</table>
 
<br>
<%
String result = (String) request.getAttribute("msg");
if (result != null) {
	out.println("<font color=green><center><b>" + result + "</b></center></font>");
}
%>
 
</body>
</html>