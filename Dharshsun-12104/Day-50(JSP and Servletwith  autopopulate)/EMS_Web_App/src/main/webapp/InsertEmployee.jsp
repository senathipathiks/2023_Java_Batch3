<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
td{
height:40px;
}
input{
height :40px;
width:300px;
border-radius :20px
}
.button{

border:none;
background-color: green;
color:white;
font-weight:bold
}
</style>
</head>
<body>
<form action="EmpController" method="post">
<table width="80%" align="center" border="0">
<tr><td>Employee Id:</td><td><input type="text" name="eid"/></td></tr>
<tr><td>Employee Name:</td><td><input type="text" name="ename"/></td></tr>
<tr><td>Employee Age:</td><td><input type="text" name="eage"/></td></tr>
<tr><td colspan="2" align="center"><input class="button" type="submit" value="InsertEmployee" name="emsAction"/></td></tr>
</table>
</form>
<br>
<%
String result = request.getParameter("msg");
if(result!=null){
	out.println("<font color=green<b>"+result+"</b></font>");
}
%>

</body>
</html>