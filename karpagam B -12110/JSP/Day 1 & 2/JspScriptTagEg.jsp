<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jsp Examples</title>
</head>
<body>

<%--This is my first jsp page iam writing this using comment --%>

<%--below is declaration tag & this will be kept outside the service & it is global variable --%>

<%--! String name="Kaviya"; --%>

<%!int Square(int x){return x*x;} %>

<%--below is scriptlet tag  & out is an implicit object of jsp we dont need to create reference & inside scriptlet tag also we can declare a variable like declaration tag & we cannot declare methods inside because it comes into service method,java doesn't allow method  declaration inside method--%>

<% out.println(Square(3)); %>

<% 
   String name="Kavi";
   out.println("<h1><font color=red> Welcome " +name+"</font></h1>"); %>

<%--below is Expression  tag & it will invoke service method of scriptlet tag --%>

<%="<h1><font color=blue>Welcome " +name+", this is created using expression tag</font></h1>" %>
<%= Square(4) %>

</body>
</html>