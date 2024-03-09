
<%@page import="java.util.ArrayList"%>
<%@page import="com.ems.bean.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<style>
#container{

	background-color: #ccc;
	margin-top: 50px;
	border-radius:10px;
	font-family: Verdana, Geneva, Tahoma, sans-serif;
}
#con{
	background-color: #ccc;
	margin-top: 10px;
	border-radius:10px;
	font-family: Verdana, Geneva, Tahoma, sans-serif;
}
#inbox{
	height: 40px;
	width: 130px;
	border-radius: 5px;
	padding-left: 3px;
	color:black;
	
}
#sub{
	height: 40px;
	width: 130px;
	border-radius: 5px;
	padding: 0px;
	color:black;
	background-color: #023095;
}
#subb{
	height: 40px;
	width: 130px;
	border-radius: 5px;
	padding: 0px;
	color:black;
	background-color: #;
}
#box{
	height: 40px;
	width: 100px;
	border-radius: 5px;
	padding: 10px;
}
#id{
	height:30px;
	width:100px;
	border-radius: 5px;
	padding: 20px;
}

td,th{
	padding: 0 0 0 20px;
}
th{
	padding: 0 0 0 30px;
}
#btn{
margin:10px;
	padding: px;
	font-weight: bold;
	justify-content: center;
	font-family: Verdana, Geneva, Tahoma, sans-serif;	
	


}
#button {

	font-weight: bold;
	border-radius: 10px;
	width: 100px;
	height:30px;
	border-radius: 5px;
	background-color: #023095;
	display: inline-block;
	align-items: center;
	color: white;
	cursor: pointer;
	box-shadow: 0 2px 10px rgba(0, 0, 0, 2);
	margin-top: 10px;
}
.main{
	background-color: #ccc;
/* 	margin:30px; */
	align-items: center;
	width:580px;
	heigh:250px;
	padding-bottom: 5px;
	margin:0pc 400px;
	
}
#outbox{
	margin-top:10px;
	width:150px;
	height:40px;
	border-radius: 5px;
	
}
.valuescontainer{
margin-left: -400px;
}

</style>
</head>
<body>
	<%	ArrayList<Employee> list = (ArrayList<Employee>) request.getAttribute("list");
Employee emp1 = (Employee)request.getAttribute("bean");

	out.println("<table id='container' align='center'>");
	out.println("<tr><th>Id</th><th>Name</th><th>Salary</th>");

	for (Employee e : list) {
		
		out.println("<form action='doEdit' method='post' modelAttribute='bean'>");
		out.println("<tr>");
		out.println("<td><input id='box' type='text' value='" + e.getEmpid() + "' name='empid' readonly='readonly'/></td>");
		out.println("<td><input id='inbox' type='text' value='" + e.getEmpName() + "' name='empName'/></td>");
		out.println("<td><input id='inbox' type='text' value='" + e.getEmpSalary() + "' name='empSalary'/></td>");
		out.println("<td><input id='sub'type='submit' value='Edit/Save'><a value='DELETE' href='deletenow?bean="+e.getEmpid()+" '>DELETE</a></td>");
		out.println("</tr>");
		out.println("</form>");
		
		
	}
	out.println("</table></font>");

	
			out.println("<table id='con' align='center'>");
			out.print("<form action='doAdd' method='post' class='main' modelAttribute='bean' align='center'>");
			out.print("<tr>");
			out.print("<td><input id='outbox' type='text' placeholder='enter Id' name='empid'></td>");
			out.print("<td><input id='outbox' type='text' placeholder='Enter Name' name='empName'></td>"); 
			out.print("<td><input id='outbox' type='text' placeholder='Enter Salary' name='empSalary'></td>");
			out.print("<td><input id='button' type='submit' value='add' name='button'></td>");
			out.print("</tr></form>");
			out.println("</table></font>");
			

%>
</body>
</html>