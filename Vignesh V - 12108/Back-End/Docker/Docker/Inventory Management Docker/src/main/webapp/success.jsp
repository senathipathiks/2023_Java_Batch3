<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String action=request.getParameter("action");
if(action.equals("Insert")){%>
<%@ include file="insert.jsp" %>
<%= "<h1> <font color=green> Record Inserted Successfully </font> </h1>" %>

<%}else if(action.equals("Update")){ %>
<%@ include file="update.jsp" %>
<%= "<h1> <font color=green> Record Updated Successfully </font> </h1>" %>

<%}else if(action.equals("Delete")){ %>
<%@ include file="delete.jsp" %>
<%= "<h1> <font color=green> Record deleted Successfully </font> </h1>" %>

<%}else if(action.equals("Find")){ %>
<%@ include file="view.jsp" %>

<%= "<font size=5px color=green><table align=center border=1>"
		+"<tr>"
		+"<th>Product ID</th>"
		+"<th>Product Name</th>"
		+"<th>Quantity In Stock</th>"
		+"<th>Manufacturer</th>"
		+"<th>MFG date</th>"
		+"<th>Price</th>"
		+"</tr>"
		+"<tr>"
		+"<td>"%>inv.getItemId()+"</td>"
		+"<td>"+inv.getItemName()+"</td>"
		+"<td>"+inv.getQuantityStock()+"</td>"
		+"<td>"+inv.getManufacturer()+"</td>"
		+"<td>"+inv.getMfgDate()+"</td>"
		+"<td>"+inv.getPrice()+"</td>"  %>


<%} %>
</body>
</html>