<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.rrs.bean.RailwayReservationSystem"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<title>Success page</title>
</head>
<body>
	<%
	String action = request.getParameter("action");
	if (action.equals("Insert")) {
	%>
	<%@include file="Insert.jsp"%>
	<%="<br><div class=\"card card-body w-50\"><h4>Record Inserted Successfully</h4></div>"%>
	<%
	} else if (action.equals("Delete")) {
	%>
	<%@include file="Delete.jsp"%>
	<%="<br><div class=\"card card-body w-50\"><h4>Record Deleted Successfully</h4></div>"%>
	<%
	} else if (action.equals("Update")) {
	%>
	<%@include file="Update.jsp"%>
	<%="<br><div class=\"card card-body w-50\"><h4>Record Updated Successfully</h4></div>"%>
	<%
	} else if (action.equals("Search")) {
	%>
	<%@include file="Search.jsp"%>
	<%
	RailwayReservationSystem rrs = (RailwayReservationSystem) request.getSession().getAttribute("bean");
	%>
	<%="<br><div  class=\"card card-body text-center \" ><table><tr style=\"font-weight:bold\"><td>Train ID</td><td>Train Name</td><td>Train Type</td><td>No Of Seats</td><td>Source</td><td>Destination</td><td>Fare</td><tr>"%>
	<%="<tr><td>" + rrs.getTrainID() + "</td><td>" + rrs.getTrainName() + "</td><td>" + rrs.getTrainType()
		+ "</td><td>" + rrs.getNo_of_seats() + "</td><td>" + rrs.getSource() + "</td><td>" + rrs.getDestination()
		+ "</td><td>" + rrs.getFare() + "</td></tr></table></div>"%>
	<%
	} else if (action.equals("View")) {
	%>
	<%@include file="Search.jsp"%>
	<%
	ArrayList<RailwayReservationSystem> list = (ArrayList<RailwayReservationSystem>) request.getSession().getAttribute("list");
	%>
	<%="<br><div  class=\"card text-center card-body  \"  ><h4> No Of Record : "
		+ list.size() + "</h4>"%>
	<%="<br><table ><tr style=\"font-weight:bold\"><td>Train ID</td><td>Train Name</td><td>Train Type</td><td>No Of Seats</td><td>Source</td><td>Destination</td><td>Fare</td><tr>"%>
	<%
	for (RailwayReservationSystem rrs : list) {
	%>
	<%="<tr><td>" + rrs.getTrainID() + "</td><td>" + rrs.getTrainName() + "</td><td>" + rrs.getTrainType()
		+ "</td><td>" + rrs.getNo_of_seats() + "</td><td>" + rrs.getSource() + "</td><td>" + rrs.getDestination()
		+ "</td><td>" + rrs.getFare() + "</td></tr>"%>
	<%
	}
	%>
	</table>
	</div>
	<%
	}
	%>
</body>
</html>




