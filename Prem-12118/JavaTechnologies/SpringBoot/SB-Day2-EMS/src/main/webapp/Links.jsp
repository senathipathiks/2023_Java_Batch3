<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Management System</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f2f2f2;
        margin: 0;
        padding: 0;
    }

    h1 {
        text-align: center;
        font-weight:bold;
        margin-top: 50px;
        color:black;
        font-family: Times New Roman;
    }

    table {
        width: 100%;
        margin-top: 0px;
        text-align: center;
    }

    th {
        background-color: #007bff;
        color: white;
        padding: 15px;
        border-radius: 5px;
    }

    th a {
        text-decoration: none;
        color: white;
    }

    th a:hover {
        background-color: #0056b3;
    }
</style>
</head>
<body>
    <h1>Employee Management System</h1>

    <table cellspacing= "5">
        <tr>
            <th><a href="InsertEmployee" target="content">Insert Employee</a></th>
            <th><a href="DeleteEmployee" target="content">Delete Employee</a></th>
            <th><a href="DeleteEmployeeByName" target="content">Delete Employee By Name</a></th>
            <th><a href="UpdateEmployee" target="content">Update Employee</a></th>
            <th><a href="FindEmployee" target="content">Find Employee</a></th>
            <th><a href="FindEmployeeByName" target="content">Find By Name</a></th>
            <th><a href="FindAllEmployee" target="content">Find All Employees</a></th>
        </tr>
    </table>
</body>
</html>
