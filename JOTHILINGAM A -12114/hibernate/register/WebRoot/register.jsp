
<%@page import="com.javatpoint.mypack.UserDao"%><jsp:useBean id="obj" class="com.javatpoint.mypack.User"></jsp:useBean>
<jsp:setProperty property="*" name="obj"/>

<%
int i=UserDao.register(obj);
if(i>0)
out.print("You are successfully registered");

%>