<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.pay.bean.Payroll"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<style>
.record{
color: green;
}
.box{
margin-left: 350px;
}
</style>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<title>Success page</title>
</head>
<body>
<%
	String action = request.getParameter("action");
	if(action.equals("Insert")){
		%>
		<%@include file="Insert.jsp" %>
		<%="<br><div class=\" record\"><center><h4>Record Inserted Successfully</h4><center></div>"%>
		<%
	}else if(action.equals("Delete")){
		%>
		<%@include file="Delete.jsp" %>
		<%="<br><div class=\"record \"><center><h4>Record Deleteded Successfully</h4><center></div>"%>"%>
		<%
	}else if(action.equals("Update")){
		%>
		<%@include file="Update.jsp" %>
		<%="<br><div class=\"record \"><center><h4>Record Updateded Successfully</h4><center></div>"%>
		<%
	}else if(action.equals("Search")){
		%>
		<%@include file="Search.jsp" %>
		<%
		Payroll pay = (Payroll)request.getSession().getAttribute("bean");
		%>
		<%="<center><br><div class=\"card card-body w-60 table bg-light\"><table><tr style=\"font-weight:bold #77a874\"><td>Payroll ID</td><td>Employee Name</td><td>Employee ID</td><td>Basic</td><td>HRA</td><td>DA</td><td>TA</td><td>CTC</td><tr></center>" %>
		<%="<tr><td>"+pay.getPayRollID()+"</td><td>"+pay.getEmployeeName()+"</td><td>"+pay.getEmpId()+"</td><td>"+pay.getBasic()+"</td><td>"+pay.getHra()+"</td><td>"+pay.getDa()+"</td><td>"+pay.getTa()+"</td><td>"+pay.getCtc()+"</td></tr></table></div>" %>
		<%	
	}else if(action.equals("View")){
		%>
		<%@include file="Search.jsp" %>
		<%
		ArrayList<Payroll> list = (ArrayList<Payroll>)request.getSession().getAttribute("list");
		%>
		<%="<center><br><div class=\"card card-body w-60 table \"><h4>No Of Record : "+list.size()+"</h4>" %>
		<%="<br><table table-info class=\"bg-light \" ><tr style=\"font-weight:bold row\"><td>Payroll ID</td><td>Employee Name</td><td>Employee ID</td><td>Basic</td><td>HRA</td><td>DA</td><td>TA</td><td>CTC</td><tr></center>" %>
		<%
		for(Payroll pay : list){
			%>
			<%="<tr class=\" table table-light \" ><td>"+pay.getPayRollID()+"</td><td>"+pay.getEmployeeName()+"</td><td>"+pay.getEmpId()+"</td><td>"+pay.getBasic()+"</td><td>"+pay.getHra()+"</td><td>"+pay.getDa()+"</td><td>"+pay.getTa()+"</td><td>"+pay.getCtc()+"</td></tr>" %>
			<%} %>
			<%="</table></div>" %>
			<%
		}
			
		%>
		
</body>
</html>