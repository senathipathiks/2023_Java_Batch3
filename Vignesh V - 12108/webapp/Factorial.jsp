<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Factorial</title>
</head>
<body>
      <H1>Finding a Factorial</H1>
    <%
        int value = 6, factorial = 1, temporaryValue = value;

        while (temporaryValue > 0) {
            factorial *= temporaryValue;
            temporaryValue--;
        }

        out.println("The factorial of " + value + " is " + factorial + ".");
    %>
      

    </body>
</html>

</body>
</html>