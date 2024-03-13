<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

a
{
text-decoration:none;
color:white;


}
th{
background-color:purple;
color:black;
font-weight:bold;


}


</style>
</head>
<body>
<br><br>
<table width=100% cellspacing = "15" align="center"> 
<th><a href="Insert.jsp" target="content">Insert Employee</a></th>
<th><a href="Delete.jsp" target="content">Delete Employee</a></th>
<th><a href="EMSController?emsAction=Update.jsp" target="content">Update Employee</a></th>
<th><a href="View.jsp" target="content">View Employee</a></th>

</table>
</table>
</body>
</html>