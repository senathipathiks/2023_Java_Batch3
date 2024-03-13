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
 * Servlet implementation class Validation
 */
public class Validation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String a = request.getParameter("name");
		String b = request.getParameter("password");
		if(a.equals("Bala") && b.equals("12345")) {
			RequestDispatcher rd = request.getRequestDispatcher("Welcome.jsp?name="+a);
			rd.forward(request, response);
		}
		else if(!b.equals("12345") ) {
			out.print("<h1>Sorry Password Not Valid!</h1>");  
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.include(request, response);
		}
		else {
			out.print("<h1>Sorry UserName Not Valid!</h1>");  
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.include(request, response);
		}
	}

}
