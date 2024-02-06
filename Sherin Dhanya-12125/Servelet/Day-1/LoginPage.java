package com.servlet.day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class LoginPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
String username="Sherin";
String password="Sherin@2002";

String user=request.getParameter("fname");
String pass=request.getParameter("fpass");
if(username.equals(user)&& password.equals(pass)) {
	out.print("Welcome to Home page");
}
else {
	out.print("Enter the correct username and password");
}
			
	}

}
