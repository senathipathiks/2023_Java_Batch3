<%@page import="java.util.ArrayList"%>
<%@page import="com.item.bean.Item"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<style>
#noti{
align-items:center;
width:50%;
height:60px;
margin-left:30%;
margin-bottom:40px;
}
</style>
</head>
<body>
<%
String action = request.getParameter("action");

if(action.equals("Insert")){
	
%>
<%@ include file="Insert.jsp" %>
<% 

out.print("<div class=\"card-body bg-success\" id=\"noti\"><h3><font color=white>Insertion Operation is Successfully Done</font></h3></div>");
}
else if(action.equals("Find"))
{
	Item itm = (Item) request.getSession().getAttribute("bean") ;
%>
	
<%@ include file="Find.jsp" %>

<%= "<div class=\"card card-body \"><table class=\"table table-dark table-hover\">"
+"<tr>"
+"<td>Item ID</td>"
+"<td>Item Name</td>"
+"<td>Item Price</td>"
+"<td>Item Seller</td>"
+"<td>Item Buyer</td>"
+"<td>Item Status</td>"

			+"<tr>"
			+"<td>"+itm.getItemID()+"</td>"
			+"<td>"+itm.getItemName()+"</td>"
			+"<td>"+itm.getItemPrice()+"</td>"
			+"<td>"+itm.getItemSeller()+"</td>"
			+"<td>"+itm.getItemBuyer()+"</td>"
			+"<td>"+itm.getItemStatus()+"</td>"
			
			+"</tr></table></div>"
			%>	



<%
}
else if(action.equals("FindAll")){
	ArrayList<Item> list = (ArrayList<Item>)request.getSession().getAttribute("All");
	
%>

<%@ include file="Find.jsp" %>
<% out.print("<div class=\"card card-body \"><h5 class=\"card-header bg-primary\">Number of Items: "+list.size()+"</h5><table class=\"table table-dark table-hover\">"
		+"<tr>"
		+"<td>Item ID</td>"
		+"<td>Item Name</td>"
		+"<td>Item Price</td>"
		+"<td>Item Seller</td>"
		+"<td>Item Buyer</td>"
		+"<td>Item Status</td>");
		

	

for(Item i : list){
	out.print("<tr>"
			+"<td>"+i.getItemID()+"</td>"
			+"<td>"+i.getItemName()+"</td>"
			+"<td>"+i.getItemPrice()+"</td>"
			+"<td>"+i.getItemSeller()+"</td>"
			+"<td>"+i.getItemBuyer()+"</td>"
			+"<td>"+i.getItemStatus()+"</td>"
			+"</tr>");
}
out.print("</table></div>");
}
else if(action.equals("Delete")){
%>
	<%@ include file="Delete.jsp" %>	
<%

out.print("<div class=\"card-body bg-success\" id=\"noti\"><h3><font color=white>Delete Operation is Successfully Done</font></h3></div>");
}
else if(action.equals("Update")){
%>
	<%@ include file="Update.jsp" %>	
<%

out.print("<div class=\"card-body bg-success\" id=\"noti\"><h3><font color=white>Update Operation is Successfully Done</font></h3></div>");
}
%>

</body>
</html>