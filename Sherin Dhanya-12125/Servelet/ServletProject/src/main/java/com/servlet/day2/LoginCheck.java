package com.servlet.day2;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginCheck
 */
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		String username="Sherin";
		String password="Sherin@2002";
		String user=request.getParameter("fname");
		String pass=request.getParameter("fpass");
		if(username.equals(user)&& password.equals(pass)) 
		{
			String name=request.getParameter("fname");
			RequestDispatcher rd=request.getRequestDispatcher("LoginSuccess.jsp");
			rd.forward(request, response);
		}
		
		else
		{
		RequestDispatcher rd=request.getRequestDispatcher("LoginFail.jsp");
		rd.include(request, response);
		out.println("<h1>Invalid Username/Password</h1>");
	}
}}
