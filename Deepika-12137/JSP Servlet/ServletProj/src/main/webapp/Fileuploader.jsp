<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>File Upload</title>

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
        width: 400px;
        margin: 2rem auto;
        border-radius: 20px;
        background-color: #fff;
      }
     
    </style>
</head>
<body>
<div class="d-flex flex-column align-items-center gap-2 mt-5">
      <form method="post" action="Fileuploader" enctype="multipart/form-data">
        <h1>File Upload Form</h1>
        <input type="file" name="file1" />
        <br /><br />
        <input type="submit" value="Upload" class="btn btn-primary" />
      </form>
    </div>
</body>
</html>