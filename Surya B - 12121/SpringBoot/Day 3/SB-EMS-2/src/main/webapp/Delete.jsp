<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "java.util.*" %>
    <%@ taglib prefix="c" uri="jakarta.tags.core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body{
display: flex;
flex-direction: column;
justify-content: center;
align-items: center;
}
.container{
padding: 40px;
background-color: black;
width: 350px;
height: 350px;
display: flex;
color: white;
justify-content: center;
align-items: center;
font-family: verdana;
font-size: 14px;
border-radius: 15px;
margin-top: 5%;

box-shadow: 0px 1px 1px rgba(3, 7, 18, 0.02),
  0px 5px 4px rgba(3, 7, 18, 0.03),
  0px 12px 9px rgba(3, 7, 18, 0.05),
  0px 20px 15px rgba(3, 7, 18, 0.06),
  0px 32px 24px rgba(3, 7, 18, 0.08);


}

#submit-btn{
margin-top: 10px;
background-color: red;
color: white;
border-style: none;
width: 80px;
height: 30px;
border-radius: 10px;
font-weight: 600;

}

#submit-btn:hover {
	cursor: pointer;
}

#result{
color: red;
}
</style>
</head>
<body>
<div class = "container">
	<form action = "performDelete" >
	<table >
	<tr><td>Employee ID<td>
	
		<td>
		<select  name = "eid" required = "required">
			
		<c:forEach var = "id" items = "${list}">
		<option value = "${id}">${id} </option>
		</c:forEach>
  		</select>
  		</td>
	</tr>
	
	
		
	</tr>
	<tr>
	<td><input type = "submit" id = "submit-btn"  value = "Delete" name = "btn" /></td>
	</tr>
	</table>
	</form>
	
	<form action = "performDeleteByName" >
	<table >
	<tr><td>Employee Name<td>
	
		<td>
		<select  name = "ename" required = "required">
			
		<c:forEach var = "name" items = "${slist}">
		<option value = "${name}">${name} </option>
		</c:forEach>
  		</select>
  		</td>
	</tr>
	
	
		
	</tr>
	<tr>
	<td><input type = "submit" id = "submit-btn"  value = "Delete" name = "btn" /></td>
	</tr>
	</table>
	</form>
</div>

<div id = "result">
<h3>${msg}</h3>
</div>



</body>
</html>