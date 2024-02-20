<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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

<%="<h4>Record Inserted Failed</h4>"%>
	<%
	}
	
	
		else if(action.equals("delete")){
	%>
		<%@include file="delete.jsp" %>
<%="<h4>Record Deleted Failed</h4>"%>
	<%
	}
	
	
		else if(action.equals("update")){
	%>
		<%@include file="update.jsp" %>
	<%="<h4>Record updated Successfully</h4></div>" %>



	<%
		}else if(action.equals("View")){
			%>
			<%@include file="search.jsp" %>
			<%="<h4>No Record Found</h4></div>" %>
			
			
			<%	
		}else if(action.equals("VeiwALL")){
			%>
			<%@include file="search.jsp" %>
			<%="<h4>No Record Found</h4></div>" %>
				<%
			}
				
			%>


</body>
</html>
