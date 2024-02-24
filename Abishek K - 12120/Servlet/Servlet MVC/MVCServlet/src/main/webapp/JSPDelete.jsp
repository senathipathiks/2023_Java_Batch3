<%@page import="com.sms.dao.StudentDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="delete.jsp" %>
<% 
int id = Integer.parseInt(request.getParameter("sid"));

StudentDao dao = new StudentDao();

int n=dao.deleteStudent(id);

if(n>0){
	out.print("<h2><font color=green>Deletion is Successfull</font></h2>");
}
else{
	out.print("<h2><font color=red>Deletion is Failure</font></h2>");
}

%>
</body>
</html>