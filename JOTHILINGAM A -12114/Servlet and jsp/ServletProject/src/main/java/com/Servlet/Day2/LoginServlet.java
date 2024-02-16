package com.Servlet.Day2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out=response.getWriter();
		
		String u = "jothi";
		String p = "Jothi@2000";
		

		String givuserr = request.getParameter("user");
		String givpasss = request.getParameter("pass");
		
		if (u.equals(givuserr) && p.equals(givpasss)) {
			
			response.sendRedirect("Welcome.jsp" );
		} else {
			response.sendRedirect("Invalid.jsp");
		}
		
		
		
	}

}
