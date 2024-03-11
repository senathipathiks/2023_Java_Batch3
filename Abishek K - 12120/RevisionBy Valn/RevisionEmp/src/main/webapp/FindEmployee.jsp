<%@page import="com.ems.bean.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>    
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
<tr>
<td>Employee ID</td>
<td>
<select name="empid" >
<%

List<Integer> list = (List<Integer>) request.getAttribute("idList");
for(Integer i : list){
	out.print("<option value="+i+">"+i+"</option>");
}

%>
</select>

</td>

</tr>
<tr><td colspan="2" align="center"><input type="submit" value="Find" name="emsAction" class="button"></td></tr>
</table>
</form>
<%

String result = request.getParameter("msg");
if(result!=null){
	
	out.print("<center><font color=green><b>"+result+"</b></font></center>");
}
Employee emp = (Employee) request.getAttribute("emp");
if(emp!=null){

out.print
("<br><br><br><br>"+
"<table border=2 width=80% >"+
"<thead>"+
"<tr>"+
"<td>Employee ID</td>"+
"<td>Employee Name</td>"+
"<td>Employee Age</td>"+
"</tr>"+
"<tr>"+
"<td>"+emp.getEmpid()+"</td>"+
"<td>"+emp.getEmpname()+"</td>"+
"<td>"+emp.getEmpsalary()+"</td>"+
"</tr>"+
"</thead>"+
"</table>"
);
}
%>
</body>
</html>