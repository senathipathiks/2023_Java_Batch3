<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String name=request.getParameter("name");
  String pwd=request.getParameter("pass");
		  
  if(name.equals("kavi") && pwd.equals("kaviya")){
%>
	  <%-- we can't use action elements inside scriptlet tag --%>
	  
	  <jsp:forward page="loginSuccess.jsp"></jsp:forward>
	  <% 
  }
	  else{
  %>
  	  <jsp:include page="Login.jsp"></jsp:include>
  	  
  	  <%
  	  out.println("Invalid UserName or Password");
	  }
  	  %>
  


</body>
</html>