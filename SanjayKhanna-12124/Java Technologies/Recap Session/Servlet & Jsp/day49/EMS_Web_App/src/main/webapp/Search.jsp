<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search page</title>
<style type="text/css">

table{
border: 3px double;
width: 500px;
height: auto;
}

body{
font-size: 24px;
margin-left: 400px
}

input {
	height: 40px;
	width: 300px;
	border-radius: 10px;
	font-size: 24px;
}
.button{
border:none;
background-color: gray;
color: black;
font-size: 30px;
margin-left: 300px
}

.button:hover {
	background-color: blue;
	color:red;
}
.select{
	height: 40px;
	width: 300px;
	font-size: 24px;
}
</style>
</head>
<body>
<form action="Controller" method="post">
<table>
<tr><td>Select Employee Id </td><td><select name="empId" class="select">
<% ArrayList<Integer> list = (ArrayList<Integer>)request.getAttribute("key");
 for(Integer i : list){
	 %>
	 <option value="<%=i%>"><%=i%></option>
	 <%}%>
</select></td></tr>
<tr><td colspan="2" algin="right"><input type="submit" class="button" value="Search" name="button" /></td></tr>
</table>
</form>
</body>
</html>