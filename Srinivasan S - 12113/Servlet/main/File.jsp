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
     
     body{
     background-image: url("https://c4.wallpaperflare.com/wallpaper/253/638/452/light-background-hd-wallpaper-preview.jpg");
     background-repeat: no-repeat;
     background-size: 100%;
     }
      form {
        border: 2px solid rgba(0.255, 0.255, 0.255, 0.2);
        height: auto;
        padding: 2rem;
        width: 400px;
        margin: 2rem auto;
        border-radius: 20px;
        background-color: #fff;
      }
     
    </style>
</head>
<body >
<div class="d-flex flex-column align-items-center gap-2 mt-5">
      <form class="shadow-lg p-3 mb-5 bg-body rounded" method="post" action="Fileuploader" enctype="multipart/form-data">
        <h1>File Upload Form</h1>
        <input type="file" name="fname" />
        <br /><br />
        <input type="submit" style="cursor: pointer;" value="Upload" class="btn btn-success" />
      </form>
    </div>
</body>
</html>