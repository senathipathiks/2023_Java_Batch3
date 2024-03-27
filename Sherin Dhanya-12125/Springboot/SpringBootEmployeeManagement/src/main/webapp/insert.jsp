<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	  
    <%@ page import="java.util.List"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert</title> 

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<style type="text/css">
*{
    margin: 2px;
    padding: 5px;
    box-sizing: border-box;
    font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
    cursor: pointer;

}
body{
    height: 80vh;
    width: 100%;
    display: flex;
    justify-content: center;
    align-items: center;
     background-position: 100%;
    background-repeat: no-repeat;
    background-size: 120%;
    
}
form{
    width: 28rem;
    height: 25rem;
   
    background: rgba(255,255, 255, 0.06);
    box-shadow: 0 8px 32px 0 rgba(31,38, 135, .37);
    border-radius: 30px;
    border-left: 1px solid rgba(255,255, 255, .3);
    border-top: 1px solid rgba(255,255, 255, .3);
    padding: 55px;
}
label{
    font-size: 20px;
    color: black;
    margin-left: 10%;
    opacity: .8;
    text-shadow: 2px 2px 4px rgba(0,0,0,.2);
}
h3{
    font-size: 18px;
    text-align: center;
    color: purple;
    text-shadow: 2px 2px 4px rgba(0,0,0,.2);
    letter-spacing: 3px;
    
    margin-bottom: 55%;
    opacity: .7;

}
#button{
    width: 50%;
    margin: 3% auto;
    color: black;
    font-size: 15px;
    opacity: .7;
    background: rgba(255,255, 255, 0.06);
    padding-top:30px;
    padding: 10px 30px;
    border: 3px;
    outline: 3px;
    border-radius: 20px;
    background-color: gray;
    text-shadow: 2px 2px 4px rgba(255,255, 255, 0.06);
    box-shadow: 3px 3px 5pxrgba(31,38,135,.37) ;
    border-left: 1px solid rgba(255,255, 255, .3);
    border-top: 1px solid rgba(255,255, 255, .3);
}
.td{
width: 200px;
}
</style>

</head>
<body >
<div >
	<form action="PerformInsert" method="post"  modelAttribute="bean" >
		<table width="80%" align="center" border="0" >
			<tr>
				<td >Employee Id</td>
				<td><input type="number" name="eid" /></td>
			</tr>
			<tr>
				<td>Employee Name</td>
				<td><input type="text" name="ename" required="required" /></td>
			</tr>
			<tr>
				<td>Employee salary</td>
				<td><input type="number" name="esalary" required="required"/></td>
			</tr>
			<tr>
				<td colspan="3" align="center"><input type="submit"
					value="Insert" id="button" required="required"></td>
			</tr>
			</form>
		</table>
		<h3>${msg}</h3>
	
	</div>
	<br>
	

</body>
</html>