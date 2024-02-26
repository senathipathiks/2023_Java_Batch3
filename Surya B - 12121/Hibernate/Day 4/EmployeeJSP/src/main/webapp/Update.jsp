<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
    <div class="container-fluid">
        <div>
            <h1 class="banner">Employee Management</h1>
        </div>

        <div class="Links">
            <a href="Delete.jsp">Delete</a>
            <a href="Update.jsp">Update</a>
            <a href="Find.jsp">Find</a>
            <a href="List.jsp">List</a>
        </div>

        <div class="Field">
            <div id="add" class="row">
                <form action="Controller" method="post">
                    <input type="number" name="eid" placeholder="ID">
                    <input type="text" name="ename" placeholder="Name">
                    <input type="text" name="erole" placeholder="Role">
                    <input type="text" name="ecity" placeholder="City">
                    <button type="button" class="btn btn-success" value="Update" name="button">Update</button>
                    
                </form>

            </div>
        </div>

    </div>
</body>
</html>