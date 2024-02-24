<%@page import="com.shop.bean.Shop"%>
<%@page import="java.util.ArrayList"%>

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

<% String action = request.getParameter("action");

if(action.equals("Insert")){
%>
	<%@ include file="Insert.jsp" %>
<%
out.print("<div class=\"card-body bg-success\" id=\"noti\"><h3><font color=white>Insertion Operation is Successfully Done</font></h3></div>");
}
else if(action.equals("Find")){
	
	Shop htl = (Shop)request.getSession().getAttribute("bean");
%>	
<%@ include file="Find.jsp" %>
<%= "<div class=\"card card-body \"><table class=\"table table-dark table-hover\">"
+"<tr>"
+"<td>Shop ID</td>"
+"<td>Shop Name</td>"
+"<td>Shop Location</td>"
+"<td>Shop PHNo.</td>"



			+"<tr>"
			+"<td>"+htl.getShopID()+"</td>"
			+"<td>"+htl.getShopName()+"</td>"
			+"<td>"+htl.getShopLoc()+"</td>"
			+"<td>"+htl.getShopPh()+"</td>"
			
			+"</tr></table></div>"
%>	



<%
}
else if(action.equals("FindAll"))
{
	ArrayList<Shop> list = (ArrayList<Shop>) request.getSession().getAttribute("list");

%>
<%@ include file="Find.jsp" %>
<% out.print("<div class=\"card card-body \"><h5 class=\"card-header bg-primary\">Number of Data: "+list.size()+"</h5><table class=\"table table-dark table-hover\">"
		+"<tr>"
		+"<td>Shop ID</td>"
		+"<td>Shop Name</td>"
		+"<td>Shop Location</td>"
		+"<td>Shop PHNo.</td>"
		
		);
		

	

for(Shop i : list){
	out.print("<tr>"
			+"<td>"+i.getShopID()+"</td>"
			+"<td>"+i.getShopName()+"</td>"
			+"<td>"+i.getShopLoc()+"</td>"
			+"<td>"+i.getShopPh()+"</td>"
			
			+"</tr>");
}
out.print("</table></div>");
}
else if(action.equals("Update")){
	
%>
<%@ include file="Update.jsp" %>	
<%

out.print("<div class=\"card-body bg-success\" id=\"noti\"><h3><font color=white>Update Operation is Successfully Done</font></h3></div>");
}
else if(action.equals("Delete")){
%>
	<%@ include file="Delete.jsp" %>	
<%

out.print("<div class=\"card-body bg-success\" id=\"noti\"><h3><font color=white>Delete Operation is Successfully Done</font></h3></div>");
}
%>
</body>
</html>