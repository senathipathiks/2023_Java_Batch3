package com.day2;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class RequestDispatcher1
 */
public class RequestDispatcher1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String a = request.getParameter("name");
		String b = request.getParameter("password");
		if(a.equals("Bala") && b.equals("Password")) {
			response.sendRedirect("Welcome.jsp?name="+a);
		RequestDispatcher r = request.getRequestDispatcher("Welcome.jsp");
		r.forward(request, response);}
		else { 
		RequestDispatcher r1 = request.getRequestDispatcher("login.jsp");
		r1.include(request, response);
		out.println("<h1>Invalid name/password</h1>");
	}}}


