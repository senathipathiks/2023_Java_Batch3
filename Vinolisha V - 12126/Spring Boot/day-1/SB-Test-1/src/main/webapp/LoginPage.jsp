<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="login-page">
		<table>

			<tr>
				<td>Enter UserName</td>
				<td><input type="text" name="userName"></td>
			</tr>

			<tr>
				<td>Enter Password</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" name="button"
					value="Submit" />
		</table>
	</form>
	<h1>${message}</h1>


	</center>
</body>
</html>