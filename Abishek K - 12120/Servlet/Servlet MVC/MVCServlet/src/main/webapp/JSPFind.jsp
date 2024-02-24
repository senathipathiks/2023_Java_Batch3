<%@page import="java.util.LinkedList"%>
<%@page import="com.sms.bean.Student"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.sms.dao.StudentDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<%@ include file="view.jsp" %>

<%

String action = request.getParameter("button");

if(action.equals("Find")){
	

int id = Integer.parseInt(request.getParameter("sid"));

StudentDao dao = new StudentDao();

Student stud = dao.findStudent(id);
        
if(stud!=null){

out.print("<table border=2 align=center class=table table-dark table-hover>"+
"<tr>"+
"<th>Student ID</th>"+
"<th>Student Name</th>"+
"<th>Student City</th>"+
"</tr>"+
"<tr>"+
"<td>"+stud.getStudId()+"</td>"+
"<td>"+stud.getStudName()+"</td>"+
"<td>"+stud.getStudCity()+"</td>"+
"</tr>"+
"</table>"
);
}

else{
	out.print("<h3><font color=red>Record Not Found</font></h3>");
}
}

else if(action.equals("FindAll")){
	
	StudentDao dao = new StudentDao();
	Student stud = new Student();
	LinkedList<Student> list = new LinkedList<Student>();
	
	list=dao.findAllStudent();
	
	if(list.size()>0){
		
		out.print("<table border=2 align=center class=table table-dark table-hover>"+
				"<tr>"+
				"<th>Student ID</th>"+
				"<th>Student Name</th>"+
				"<th>Student City</th>"+
				"</tr>");
		
		for(Student i : list){
			out.print("<tr>"+
					"<td>"+i.getStudId()+"</td>"+
					"<td>"+i.getStudName()+"</td>"+
					"<td>"+i.getStudCity()+"</td>"+
					"</tr>"
					);
		}
		
		out.print("</table>");
	}
	else{
		out.print("<h1><font color=red>Records Not Found</font></h1>");
	}
	
	
	
}
%>



</body>
</html>