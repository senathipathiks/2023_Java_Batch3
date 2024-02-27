<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import ="com.webapp.day1.Register" %>
     <%@page import ="com.webapp.day1.RgesiterDAO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

Register obj=new Register();
obj.setUsername(request.getParameter("user"));
obj.setPass(request.getParameter("pass"));
obj.setCpass(request.getParameter("cpass"));
obj.setPhnno(request.getParameter("pho"));
obj.setCity(request.getParameter("city"));

int i=RgesiterDAO.register(obj);
if(i>0){
	out.print("sucessfull");
}

%>
</body>
</html>