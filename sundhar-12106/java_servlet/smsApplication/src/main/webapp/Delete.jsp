<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
	<div class="d-flex flex-column  justify-content-center  align-items-center mt-5">
	<h1 class="text-center">Delete</h1>
	<form action="insertServlet" method="post" class="">
		<table class="table table-bordered">
		  <tr>
			<td>Student ID :</td>
			<td><input type="text" name="id" /></td>
            </tr>
		
        <tr>
            <td colspan="2" class="text-center ">
                <input class="btn btn-primary" type="submit" name="button" value="Delete">
            </td>
        </tr>
		</table>
	</form>
	</div>
</body>
</html>