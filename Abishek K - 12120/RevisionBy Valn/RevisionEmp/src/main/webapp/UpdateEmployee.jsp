<%@page import="com.ems.bean.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
td{
height:30px;
}
input,select{
border-radius: 20px;
height:40px;
width:300px;
}
.button{
border:none;
background-color:green;
color:white;
font-weight:bold;
cursor:pointer;
}


</style>
</head>
<body>
<form action="EMSController" method="post">
<table width="80%" align="center" border="0">
<tr><td>Employee ID</td>
<td>
<form action="EMSController" method="post">
<select name="empid">
<%
List<Integer> list = (List<Integer>) request.getAttribute("idList");
for(Integer i : list){
	out.print("<option value='"+i+"'>"+i+"</option>");
}

%>
</select>
<input type="submit" value="fetch" name="emsAction" />
</form>
</td></tr>
<form action="EMSController" method="post">
<tr><td>Employee ID</td><td><input type="text" name="empid" value="${emp.empid}" /></td></tr>
<tr><td>Employee Name</td><td><input type="text" name="empname" value="${emp.empname }"  /></td></tr>
<tr><td>Employee Salary</td><td><input type="text" name="empsalary" value="${emp.empsalary }" /></td></tr>
<tr><td colspan="2" align="center" ><input type="submit" value="Update" class="button" name="emsAction" /></td></tr>

</table>
</form>
</form>

<br>
<%
String result = request.getParameter("msg");
if(result!=null){
	
	out.print("<center><font color=green><b>"+result+"</b></font></center>");
}
%>


</body>
</html>