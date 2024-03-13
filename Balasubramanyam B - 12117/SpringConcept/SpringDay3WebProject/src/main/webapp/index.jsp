<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body >
<p style="margin-left:40%"><b>Student Information</b></p >
<form action="addStudent" method="post" modelAttribute="student" style="position:absolute;margin-left:35% " >

<table >
<tr>
<td>Name</td><td><input type="text" name="name"/>
</tr>
<tr>
<td>Age</td><td><input type="text" name="age"/>
</tr>
<tr>
<td colspan="2"><input type=submit name="Submit"/></td>
</tr>
</table>

</form>
</body>
</html>
