<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.ArrayList"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<style type="text/css">
*{
    margin: 10px;
    padding: 12px;
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
    background: rgb(238,211,174);
background: radial-gradient(circle, rgba(238,211,174,1) 0%, rgba(148,233,168,1) 100%);
}

label{
    font-size: 20px;
    color: black;
    margin-left: 10%;
    opacity: .8;
    text-shadow: 2px 2px 4px rgba(0,0,0,.2);
}
h2{
    font-size: 18px;
    text-align: center;
    color: red;
    font-size: bold;
    text-shadow: 2px 2px 4px rgba(0,0,0,.2);
    letter-spacing: 3px;
    
    margin-bottom: 55%;
    opacity: .7;

}
#button{
    width: 94%;
    margin: 3% auto;
    color: black;
    font-size: 15px;
 
    background: rgba(255,255, 255, 0.06);
 
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

</style>
</head>
<body>
<div class="box">
	<form action="DeleteEmp1" >
		<table width="80%" align="center" border="0">
			<tr>
				<td class="text">EmpName</td>
				<td><select  name="ename"  required="required">
				<option>select by name</option>
				<c:forEach var="name" items="${list1}">
				<option value="${name}">${name}</option>
				</c:forEach>
			
				</select>
				</td>
			</tr>
			
			<tr>
				<td colspan="3" align="center"><input type="submit"
					value="DeleteByName" class="btn btn-danger" /></td>
			</tr>
		</table>
		<center>
			<font color="green">${msg}</font></center>
		</form>
		</div>
	
</body>
</html>