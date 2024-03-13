<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body{
background-image: linear-gradient(to left, grey,silver,grey);
}
a{
text-decoration: none;
color:white;
}
 
th{
background-color:black;
height:40px;
font-weight: bold;
border-radius: 10px;
}

#a1:hover{
color:blue;
height:60px;
background-color:white;
border-radius: 5px;
}
h1{
color:black;
text-shadow: 2px 2px 5px pink;

}
.blink{
  animation: blinker 1s linear infinite;
}

@keyframes blinker {
  30% {
    opacity: 0;
  }
}
</style>
</head>
<body>
 <h1 align="center" class="blink">EMPLOYEE MANAGEMENT SYSTEM</h1>
<table width="80%" cellspacing="15" align="center">
<th><a href="InsertEmployee" target="content" id=a1>Insert Employee</a></th>
<th><a href="DeleteEmployee"  target="content" id=a1>Delete Employee</a></th>
<th><a href="DeleteEmployeeName"  target="content" id=a1>Delete Employee Name</a></th>
<th><a href="DeleteEmployeeSalary"  target="content" id=a1>Delete Employee Salary</a></th>
<th><a href="" target="content" id=a1>Update Employee</a>
<th><a href="" target="content" id=a1>Find Employee</a>
<th><a href="" target="content" id=a1>FindAll Employee</a>
 
 
 
</table>

</body>
</html>