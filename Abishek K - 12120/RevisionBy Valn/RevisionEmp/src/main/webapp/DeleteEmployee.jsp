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
background-color: red;
color:white;


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
	out.print("<option>"+i+"</option>");
}

%>
</select>

</td>

</tr>
<tr><td colspan="2" align="center"><input type="submit" value="Delete" name="emsAction" class="button"></td></tr>
</table>
</form>
<%

String result = request.getParameter("msg");
if(result!=null){
	
	out.print("<center><font color=green><b>"+result+"</b></font></center>");
}
%>
</body>
</html>