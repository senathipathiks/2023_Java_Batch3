<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!int fact(int n) {
		int f = 1;
		for (int j = 1; j <= n; j++) {
			f *= j;
		}
		return f;
	}%>

	<table border="1">
		<tr>
			<th>NUMBER</th>
			<th>FACTORIAL</th>
		</tr>
		
			<%
			for (int i = 1; i <= 10; i++) {
				System.out.println(fact(i));
				out.print("<tr><td>" + i + "</td>" + "<td>" + fact(i) + "</td></tr>");
			}
			%>
		
	</table>
</body>
</html>