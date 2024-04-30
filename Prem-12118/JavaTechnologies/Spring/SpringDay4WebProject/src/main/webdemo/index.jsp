
<html>
<body>

	<h2>Student Information</h2>
	<form method="post" action="addStudent" modelAttribute="student">
		<tabel>
		<tr>
			<td>Name:</td>
			<td><input type="text" name="name" /></td>
		<tr>
			<td>Age:</td>
			<td><input type="text" name="age" /></td>
		</tr>
		<tr>
			<td>City:</td>
			<td><input type="text" name="city" /></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value=Submit></td>
		</tr>
		</tabel>

	</form>

</body>
</html>
