<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="com.pms.bean.Playroll" %>  
 <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String action=request.getParameter("action");
	if(action.equals("insert")){
%>

<%@include file="insert.jsp" %>

<%="<h4>Record Inserted Successfully</h4>"%>
	<%
	}
		
		
			else if(action.equals("delete")){
	%>
		<%@include file="delete.jsp" %>
<%="<h4>Record Deleted Successfully</h4>"%>
	<%
	}
		
		
			else if(action.equals("update")){
	%>
		<%@include file="update.jsp" %>
	<%="<h4>Record updated Successfully</h4></div>"%>



	<%
	}
			else if(action.equals("View")){
	%>
			<%@include file="search.jsp" %>
	<%
	Playroll play=(Playroll)request.getSession().getAttribute("bean");
	%>
	<%="<table><tr style=\"font-weight:bold\"><td>Employee RollId</td><td>Employee Name</td><td>Employee Id</td><td>Employee Basic</td><td>House Rent</td><td>Dearness Allowance</td><td>Travelling Allowance</td><td>Cost of Company</td></tr>"%>
	<%="<tr><td>"+ play.getRollId()+"</td><td>"+play.getEmpName()+"</td><td>"+play.getEmpId()+"</td><td>"+play.getBasic()+"</td><td>"+play.getHra()+"</td><td>"+play.getDa()+"</td><td>"+play.getTa()+"</td><td>"+play.getCtc()+"</td></tr></table></div>"%>
	
	<%
		}
			
			
			
				else if(action.equals("ViewAll")){
			
				System.out.println("view all");
		%>
	
	<%@include file="search.jsp"%>
	<%
	System.out.print("vino");
			LinkedList<Playroll> emp=(LinkedList<Playroll>)request.getSession().getAttribute("bean");
	%>
	
	<%="<table><tr style=\"font-weight:bold\"><td>Employee RollId</td><td>Employee Name</td><td>Employee Id</td><td>Employee Basic</td><td>House Rent</td><td>Dearness Allowance</td><td>Travelling Allowance</td><td>Cost of Company</td></tr>"%>
	
	<%
		for(Playroll e:emp){
		%>
	
		<%="<tr><td>"+ e.getRollId()+"</td><td>"+e.getEmpName()+"</td><td>"+e.getEmpId()+"</td><td>"+e.getBasic()+"</td><td>"+e.getHra()+"</td><td>"+e.getDa()+"</td><td>"+e.getTa()+"</td><td>"+e.getCtc()+"</td></tr></table></div>"%>
	
	<% 
		}
	%>
	
	<%="</table>" %>	
	
	<%
		}
	%>
	
</body>
</html>
