<%@page import="com.pms.bean.Property"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page import="com.pms.bean.Property" %>
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
 body{
    font-family: monospace;
    background-image: url("https://img.freepik.com/free-photo/abstract-luxury-gradient-blue-background-smooth-dark-blue-with-black-vignette-studio-banner_1258-52393.jpg");
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
td,b{
color: white;
}
#in{
color: black;
}
</style>

<script type="text/javascript">
	function Validation() {
		var PropId = document.getElementById("PropId").value;
		var PropName = document.getElementById("PropName").value;
		var PropType = document.getElementById("PropType").value;
		var City = document.getElementById("City").value;
		var Country = document.getElementById("Country").value;
		var YearOfPurchase = document.getElementById("YearOfPurchase").value;
		var Seller = document.getElementById("Seller").value;

		if (PropId == "") {
			alert("PropId cannot be empty");
		} else if (PropName == "") {
			alert("PropName cannot be empty");
		} else if (PropType == "") {
			alert("PropType cannot be empty");

		} else if (City == "") {
			alert("City cannot be empty");

		} else if (Country == "") {
			alert("Country cannot be empty");

		} else if (YearOfPurchase == "") {
			alert("YearOfPurchase cannot be empty");

		} else if (Seller == "") {
			alert("Seller cannot be empty");

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
						<b>Update Property Details</b>
					</h5>
					<table border="3" color="black" align="center" id="tbl">
						<tr>
							<td id="txt">Property ID:</td>
							
							<form action="Fetch" method="post" modelAttribute="bean">
							
								<td><select type="text" required="required" name="PropId" id="PropId">
							<%
							
							ArrayList<Integer> list=(ArrayList<Integer>) request.getAttribute("key");
							if(list!=null)
							for(Integer i:list){
								%>
								<option value="<%=i %>"><%=i %></option>
							<% }%>
								</select><input type="submit" value="Fetch" name="button" id="in"/>
								</form>
								</td>
					<form action="UpdationProp" method="post" autocomplete="on" modelAttribute="bean">
						</tr>
						
						<%
						
					Property prop = (Property)request.getAttribute("bean") ;
						if(prop != null){
						
						%>
						<tr>
						<td id="txt">Property ID:</td>
						<td><input type="text" name="PropId" id="PropId"
							required="required" value="<%=prop.getPropId() %>"></td>
					</tr>
					<tr>
						<td id="txt">Property Name:</td>
						<td><input type="text" name="PropName" id="PropName"
							required="required" value="<%=prop.getPropName()%>"></td>
					</tr>
					<tr>
						<td id="txt">Property Type:</td>
						<td><input type="text" name="PropType" id="PropType"
							required="required" value="<%=prop.getPropType()%>"></td>
					</tr>
					<tr>
						<td id="txt">City:</td>
						<td><input type="text" name="City" id="City"
							required="required" value="<%=prop.getCity()%>"></td>
					</tr>
					<tr>
						<td id="txt">Country:</td>
						<td><input type="text" name="Country" id="Country"
							required="required" value="<%=prop.getCountry()%>"></td>
					</tr>
					<tr>
						<td id="txt">YearOfPurchase:</td>
						<td><input type="text" name="YearOfPurchase"
							id="YearOfPurchase" required="required" value="<%=prop.getYearOfPurchase()%>"></td>
					</tr>
					<tr>
						<td id="txt">Seller:</td>
						<td><input type="text" name="Seller" id="Seller"
							required="required" value="<%=prop.getSeller()%>"></td>
					</tr>
				<tr>
					<td colspan="2" align="center">
					<input type="submit" class="btn btn-success btn-lg btn-block" value="Update" name="button" onclick="Validation()" id="colr1">
					</td>
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