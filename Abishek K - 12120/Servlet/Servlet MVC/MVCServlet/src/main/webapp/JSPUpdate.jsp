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
<jsp:useBean id="obj" class="com.sms.bean.Student"></jsp:useBean>
<jsp:setProperty property="*" name="obj"/>

<%
int n=0;
StudentDao dao = new StudentDao();
n=dao.updateStudent(obj);

if(n>0){
	response.sendRedirect("Updatesuccess.jsp");
}
else{
	response.sendRedirect("Updationerror.jsp");
}
%>

</body>
</html>