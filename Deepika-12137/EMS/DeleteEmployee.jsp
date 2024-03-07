<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
select {
	width: 130%;
    height:50px;
	padding:15px;
	margin-right:70px;
	background-color: #a4aaba;
	border-radius:50px;

}
input{
border-radius: 50px;

}
body{
background-color: #383b4f;
		margin-top: 20px;
}
table{
margin-top:150px;
}
td{
padding-top: 30px;
color:white;
font:bold;
font-size:25px;
margin-left: 550px;
}


.button{
	background-color: #eeeeee;
	padding: 15px;
	border:none;
	width: 55%;
	boder-radius:15px;
	margin-right:220px;
	font-weight: bold;	
	height:40%;
	margin-right:5px;
	font-weight: bold;	
}

input:hover{
background-color:#dff9ba;
color: black;
}

</style>
<body>

<table border="0" align="center" font-size=40px;>
		<tr>
			<td>Employee ID</td>

			<td>
				<form action="EMSController" method="post">
					<select name="eid">
						<%
						List<Integer> idList = (List<Integer>) request.getAttribute("IdList");
						for (Integer i : idList) {
							out.print("<option value='" + i + "'>" + i + "</option>");
						}
						%>
					</select>
			</td>
			
			

		</tr>
		
	
		<tr>
		
			<td colspan="2" align="center"><input class="button" type="submit" value="DeleteEmployee" name="emsAction"></td>
		</tr>
		</form>
	</table>

	<br>

	<%
	String result = (String)request.getAttribute("msg");
	if (result != null) {
		out.print("<center><font color=green><b>" + result + "</b></font></center>");
	}
	%>


</body>
</html>