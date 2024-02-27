<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form>
<p>Enter A Number : 
<input type="text" name="num"/>
</p>
<input type="submit" value="submit"/>
</form>
<%
String n = request.getParameter("num");
if(!(n == null || (n.equals(""))))
{
int num = Integer.parseInt(n);
%>
<p>Multiplication Table of <%=num %> is : </p>
<%
for(int i = 1; i <= 10; i++)
{
%>
<table>
<tr>
<td><%=num %> x <%=i %> = <%=num*i %></td>
</tr>
</table>
<%
}
}
%>

</body>
</html>