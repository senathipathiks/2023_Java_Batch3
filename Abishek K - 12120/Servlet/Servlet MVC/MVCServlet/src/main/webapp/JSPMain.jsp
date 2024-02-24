<%@page import="com.sms.bean.Student"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import ="com.sms.dao.StudentDao" %>

<jsp:useBean id="obj" class="com.sms.bean.Student"></jsp:useBean>
<jsp:setProperty property="*" name="obj"/>




<%
//Insertion method
StudentDao dao = new StudentDao();
int n=0;
n=dao.insertStudent(obj);

if(n==1){
	response.sendRedirect("success.jsp");
}
else{
	response.sendRedirect("error.jsp");
}





%>



</body>
</html>