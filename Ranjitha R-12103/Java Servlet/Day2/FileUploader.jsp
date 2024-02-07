<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
      crossorigin="anonymous"
    />
    <style>
      form {
        border: 2px solid rgba(0.255, 0.255, 0.255, 0.2);
        height: auto;
        padding: 1rem;
        width: 600px;
        margin: 2rem auto;
        border-radius: 30px;
        background-color: #fff;
      }
     
    </style>
</head>
<body>
<div class="d-flex flex-column align-items-center gap-2 mt-5">
<h1>File Uploader</h1>
<form action="FileUploader" method="post" enctype="multipart/form-data" >
<label>Select to Upload File</label>
<input type="File" name="file1" class="btn btn-primary">
<br><br>
<input type="checkbox">
<label>Overwrite Existing File</label>
<br><br>
<input type="submit" value="upload" class="btn btn-success"/>
</form>
</div>
</body>
</html>