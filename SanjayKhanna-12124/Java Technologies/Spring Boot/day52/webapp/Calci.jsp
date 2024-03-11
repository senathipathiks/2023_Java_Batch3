<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="calculate" method="post">
<table>
<tr><td>Enter Number 1</td><td><input type="text" name="num1" ></td></tr>
<tr><td>Enter Number 2</td><td><input type="text" name="num2" ></td></tr>
<tr><td colspan="2"><input type="submit" name="button" value="Addition"></td></tr>
</table>
</form>
<br>
<b>Result: ${output}</b>
</body>
</html>