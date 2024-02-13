<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>File-overrider</title>
</head>
<body>
	<form action="FileOverRiderServlet" method="post" enctype="multipart/form-data">
	<h4>Upload file</h4>
	<input type="file" name="file1"><br><br>
	<span>Do you want to override?</span><br>
	<input type="checkbox" id="override" name="override"><label for="overide">yes</label>
	<input type="checkbox" id="non-override" name="non-override"><label for="non-overide">no</label><br><br>
	<input type="submit" value="submit">
	</form>
</body>
</html>