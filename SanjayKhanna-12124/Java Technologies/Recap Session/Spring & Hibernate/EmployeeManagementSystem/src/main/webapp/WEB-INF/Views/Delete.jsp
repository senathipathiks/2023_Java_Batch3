<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete page</title>
<style type="text/css">
td{
padding: 18px 36px;
}

input {
	height: 40px;
	width: 300px;
	border-radius: 10px;
	font-size: 24px;
}
body{
font-size: 24px;
margin-left: 320px
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
<form action="deleteemployee" method="post" modelAttribute="bean">
<table>
<tr><td>Select Employee Id </td><td><select name="empId" class="select">
<% ArrayList<Integer> list = (ArrayList<Integer>)request.getAttribute("key");
 for(Integer i : list){
	 %>
	 <option value="<%=i%>"><%=i%></option>
	 <%}%>
</select></td></tr>
<tr><td colspan="2" algin="right"><input type="submit" class="button" value="Delete" name="button" /></td></tr>
</table>
</form>
<% String msg = (String)request.getAttribute("msg");
if(msg != null ){
	out.print("<h1>"+msg+"</h1>");
}
%>
</body>
</html>