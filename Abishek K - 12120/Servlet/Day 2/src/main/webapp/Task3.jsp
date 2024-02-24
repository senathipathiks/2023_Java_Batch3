<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="FileUpload" enctype="multipart/form-data" method="post">
<label>Upload Your File Here....</label><br><br>

<input type="file" name="file" multiple="multiple"><br><br>
<label>Overwrite</label>
<input type="checkbox" name="overwrite" value="ow"><br><br>
<button type="submit">submit</button>

</form>

</body>
</html>