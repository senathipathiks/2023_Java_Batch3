<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success page</title>
</head>
<body>
	<h2>hello from display ${res}</h2>
	<c:if test="${res == 'success' }">
		<h2>Hello from jstl</h2>
	</c:if>
</body>
</html>