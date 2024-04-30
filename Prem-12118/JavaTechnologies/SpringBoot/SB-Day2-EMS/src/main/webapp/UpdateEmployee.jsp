<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Update Employee Details</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f9f9f9;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        form {
            width: 300px;
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        }

        h2 {
            text-align: center;
            margin-top: 0;
            margin-bottom: 20px;
            color: #333;
        }

        table {
            width: 100%;
        }

        td {
            padding: 10px;
            font-size: 16px;
        }

        input[type="text"] {
            width: calc(100% - 12px); /* Adjusting for padding and border */
            height: 40px;
            border: 1px solid #ccc;
            border-radius: 5px;
            padding: 5px;
        }

        .button {
            width: 100%;
            background-color: #007bff;
            color: #fff;
            border: none;
            padding: 10px;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
        }

        .button:hover {
            background-color: #0056b3;
        }

        h4 {
            text-align: center;
            margin-top: 20px;
            color: #007bff;
        }
    </style>
</head>
<body>
  
  <form action="fetchEmployee">
  
  <select class="text-input" name="eid" id="eid" required>
            <c:forEach var="id" items="${IdList}">
                <option value="${id}">${id}</option>
            </c:forEach>
        </select>
        <td colspan="3" align="center">
                    <input class="button" type="submit" value="Fetch Employee"/>
                </td>
        
  
  </form>


    <form action="PerformUpdate">
        <h2>Update Employee Details</h2>
        <table>
          <tr>
                <td>Employee Id</td>
                <td><input type="text" name="eid" value="${Emp.eid }" readonly="readonly"></td>
            </tr>
            <tr>
                <td>Employee Name</td>
                <td><input type="text" name="ename" value="${Emp.ename }"required="required"></td>
            </tr>
            <tr>
                <td>Employee Salary</td>
                <td><input type="text" name="esalary" value="${Emp.esalary }"required="required"></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input class="button" type="submit" value="Update Employee"/>
                </td>
            </tr>
        </table>
    </form>

    <h4><top><bold><font color="green">${ msg }</top></bold></font></h4>
</body>
</html>
