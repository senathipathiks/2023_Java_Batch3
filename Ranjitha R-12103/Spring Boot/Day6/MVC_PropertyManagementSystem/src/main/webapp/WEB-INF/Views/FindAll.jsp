<%@page import="com.pms.bean.Property"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find All</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<style type="text/css">
table{
align-content: center;
padding-left: 13px;
padding-top: 20px;
width: 40px;
color: ;
background-color: silver;
}

body{
background-color: ;
align-items: center;
background-color: teal;
font-size: small; 
 font-family: monospace;
 background-image: url("https://img.freepik.com/free-photo/abstract-luxury-gradient-blue-background-smooth-dark-blue-with-black-vignette-studio-banner_1258-52393.jpg");
 
}
th{
color: maroon;
}
#btn{
width: 200px;
}
input{
border: none;
background-color: silver;
}
h3{
color: white;
}
</style>
</head>
<body><br><br><center>
	<table border="3" cellspacing="0" cellpadding="0">
	<h3>Find All Property Details</h3>
		<tr>
			<th>Property ID:</th>
			<th>Property Name</th>
			<th>Property Type</th>
			<th>City</th>
		    <th>Country</th>
		    <th>YearOfPurchase</th>
		    <th>Seller</th>
		    <th>Operations</th>
		</tr>
		<% ArrayList<Property> list=(ArrayList<Property>)request.getAttribute("list");
		Property props=(Property)request.getAttribute("bean");
		for(Property prop:list){
			
				out.println("<form action='doEdit' method='post' modelAttribute='bean'>");
				
				out.print("<tr>");
				out.print("<td><input type=\"text\" name=\"PropId\" value=\""+prop.getPropId()+"\" readonly ></td>");
				out.print("<td><input type=\"text\" name=\"PropName\" value=\""+prop.getPropName()+"\" ></td>");
				out.print("<td><input type=\"text\" name=\"PropType\" value=\""+prop.getPropType()+"\"  ></td>");
				out.print("<td><input type=\"text\" name=\"City\" value=\""+prop.getCity()+"\"  ></td>");
				out.print("<td><input type=\"text\" name=\"Country\" value=\""+prop.getCountry()+"\"  ></td>");
				out.print("<td><input type=\"text\" name=\"YearOfPurchase\" value=\""+prop.getYearOfPurchase()+"\"  ></td>");
				out.print("<td><input type=\"text\" name=\"Seller\" value=\""+prop.getSeller()+"\"  ></td>");
				out.print("<td><a class='btn btn-warning' value='Edit&Save'>Edit</a><a class='btn btn-danger' value='delete' href='deletenow?bean="+prop.getPropId()+" '>Delete</a></td>");
				out.print("</tr></form>");
				}
		
		out.print("<form action='doAdd' method= modelAttribute='bean'>");
	    out.print("<tr>");
	    out.print("<td><input type=\"text\" name=\"PropId\"></td>");
	    out.print("<td><input type=\"text\" name=\"PropName\"></td>");
	    out.print("<td><input type=\"text\" name=\"PropType\" ></td>");
	    out.print("<td><input type=\"text\" name=\"City\" ></td>");
	    out.print("<td><input type=\"text\" name=\"Country\" ></td>");
	    out.print("<td><input type=\"text\" name=\"YearOfPurchase\" ></td>");
	    out.print("<td><input type=\"text\" name=\"Seller\" ></td>");
	    out.print("<td><a class='btn btn-success' value='add'>Add </a></td>");
	    out.print("</tr></form>");

%>
	</table></center>
</body>
</html>