<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<title>View Part</title>
</head>
<body class="bg-light">
	 <div
      class="mt-5 container d-flex flex-column justify-content-center align-items-center"
    >
      <h1 class="text-center">Edit delete Operation</h1>
      <form action="InsertServlet" method="post">
        <table class="table table-bordered">
          <tr>
            <th>Student ID</th>
            <th>Student Name</th>
            <th>City</th>
            <th>Operation1</th>
            <th>Operation2</th>
          </tr>
          <% 
          while(true){
        	  out.print("");
          }
          %>
        </table>
      </form>
    </div>
</body>
</html>