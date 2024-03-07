<style>
h2{
padding-left: 500px;
}
form{
padding-left: 500px;
}
</style>
<html>
<body>

<h2>STUDENT INFORMATION</h2>

<form method="POST" action="addStudent" modelAttribute="student">

<table>
<tr>
<td>Name</td>
<td><input type="text" name="name"/></td>
</tr>

<tr>
<td>Age</td>
<td><input type="text" name="age" /></td>
</tr>

<tr>
<td colspan="2">
<input type="submit" value="Submit" />
</td>
</tr>
</table>
</form>

</body>
</html>



