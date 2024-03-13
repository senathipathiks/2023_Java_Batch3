<html>
<body>
<h2>Hello World!</h2>

<h2> Student information</h2>
<form method="post" action="addStudent" modelAttribute="student">
<table>
<tr>
<td> Name </td>
<td><input type="text" name="name" placeholder="type your name"/></td>
</tr>
<tr>
<td>Age</td>
<td><input type="text" name="age" placeholder="Type your age"/></td>
</tr>
<tr>
<td>Gender</td>
<td><input type="text" name="gender" placeholder="Type your gender"/></td>
</tr>

<tr>
<td colspan = "2">
<input type="submit" value="submit"/>
</td>
</tr>
</table>
</form>
</body>
</html>