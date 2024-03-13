<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>calulation page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	<div class="container card mt-5 p-5">
		<form action="p-add" class="d-flex flex-column justify-content-center gap-3">
			<div class="form-floating">
				<input class="form-control" placeholder="input1" id="inp1"
					name="inp1" type="number"> <label for="inp1">input
					1</label>
			</div>
			<div class="form-floating">
				<label for="inp2">input 2</label><input class="form-control"
					placeholder="input2" id="inp2" name="inp2" type="number">
			</div>
			<input type="submit" class="btn btn-primary" value="Add">
		</form>
		<span>${result }</span>
	</div>


</body>
</html>