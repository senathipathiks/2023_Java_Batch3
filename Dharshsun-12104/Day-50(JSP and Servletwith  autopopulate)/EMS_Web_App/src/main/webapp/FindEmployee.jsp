<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List" %>
    <%@ page isELIgnored = "false" %>
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

<tr><td>Employee Id:</td><td>

<select name="eid" class="form-control" id="eid" placeholder="EmployeeID" name="eid">
<%
	List<Integer> idList = (List<Integer>)request.getAttribute("IdList");

for(Integer i : idList){
	out.println("<option value='"+i+"'>"+i+"</option>");
}
%>
</select>
<input type="submit" value="Fetch" name="emsAction">

</td></tr>

<tr><td>Employee Id:</td><td>${emp.eid}</td></tr>
<tr><td>Employee Name:</td><td>${emp.ename}</td></tr>
<tr><td>Employee Age:</td><td>${emp.eage}"</td></tr>

<tr><td colspan="2" align="center"><input class="button" type="submit" value="Find" name="emsAction"/></td></tr>
</table>

</form>
<br>
<%
String result = request.getParameter("msg");
if(result!=null){
	out.println("<h1><font color=green<b>"+result+"</b></font></h1>");
}
%>


</body>
</html>