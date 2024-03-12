<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="perform-add">
Enter No 1<input type="text" name="n1"/>
<br><br>
Enter no 2<input type="text" name="n2"/>
<br><br>
<input type="submit"  value="Add">
</form>
result:${sum}
</body>
</html>