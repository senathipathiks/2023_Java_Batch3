<%@page import="java.util.ArrayList"%>
<%@page import="com.spring.bean.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
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
body {
	background-color: teal;
	font-family: monospace;
	
}

h5 {
	text-shadow: 1px 2px;
}

#colr2 {
	background: linear-gradient(to right, #C0C0C0, #808080);
}

#txt {
	font: bold;
}
</style>

<script type="text/javascript">
function Validation() {
	var sid = document.getElementById("sid").value;
	var sname = document.getElementById("sname").value;
	var bookauthor = document.getElementById("bookauthor").value;
	

	if (sid == "") {
		alert("sid cannot be empty");
	} else if (sname == "") {
		alert("sname cannot be empty");
	} else if (bookauthor == "") {
		alert("bookauthor cannot be empty");

}
}
</script>

</head>
<body>
	<br>
	<br>
	
		<font size="5px" color="black">
			<center>
				
					<h5 >
						<b>Update Student Details</b>
					</h5>
					<table border="3" color="black" align="center" id="tbl">
						<tr>
							<td id="txt">Student ID:</td>
							
							<form action="Fetch" method="post" modelAttribute="bean">
							
								<td><select type="text" required="required" name="sid" id="sid">
							<%
							ArrayList<Integer> list=(ArrayList<Integer>) request.getAttribute("key");
							for(Integer i:list){
								%>
								<option value="<%=i %>"><%=i %></option>
							<% }%>
								</select><input type="submit" value="Fetch" name="button"/>
								</form>
								</td>
					<form action="UpdationStud" method="post" autocomplete="on" modelAttribute="bean">
						</tr>
						<%Student stud=(Student)request.getAttribute("bean");
						if(stud!=null){
						%>
						
						<tr>
					<td>Student Id</td>
					<td><input type="text" name="sid" value="${stud.sid }"
						readonly="readonly"></td>
				</tr>
				<tr>
					<td>Student Name</td>
					<td><input type="text" name="sname" value="${stud.sname }"></td>
				</tr>
				<tr>
					<td>Student City</td>
					<td><input type="text" name="scity" value="${stud.scity }"></td>
				</tr>
				
				<tr>
					<td colspan="2" align="center">
					<input type="submit" class="btn btn-success btn-lg btn-block" value="Update" name="button" onclick="Validation()" id="colr1">
					</td>
				</tr>
				<%}else{ %>
						<tr>
							<td id="txt">Student Name:</td>
							<td><input type="text" name="sname" id="sname"
								required="required"></td>
						</tr>
						<tr>
							<td id="txt">Student City</td>
							<td><input type="text" name="scity" id="scity"
								required="required"></td>
						</tr>
						
						<tr>
							<td colspan="2"><center>
									<input type="submit" class="btn btn-success btn-lg btn-block"
										value="Update" name="button" onclick="Validation()" id="colr1"></td>
							</center>
						</tr>
						<%} %>
						</form>
					</table>
				
			</center>
		</font>
	
	
	<%
	String msg=(String)request.getAttribute("msg");
	if(msg!=null ){
		out.println("<center><h3><b>"+msg+"<b><h3></center>");
	}
	
	%>
</body>
</html>