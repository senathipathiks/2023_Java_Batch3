package com.Servlet.Day2;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class requestDispatcherr
 */
public class requestDispatcherr extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		// it goes forward page
		

		
		String u = "jothi";
		String p = "Jothi@2000";
		

		String givuserr = request.getParameter("user");
		String givpasss = request.getParameter("pass");
		
		if (u.equals(givuserr) && p.equals(givpasss)) {
			
			RequestDispatcher rd=request.getRequestDispatcher("Welcome.jsp");
			rd.forward(request, response);
		} else {
			RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
		
			rd.include(request, response);
		out.println("<h1>login Failed</h1>");
		}
		
	}

	
}
