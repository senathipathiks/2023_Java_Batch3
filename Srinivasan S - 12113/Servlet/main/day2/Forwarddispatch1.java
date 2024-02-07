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
 * Servlet implementation class Forwarddispatch1
 */
public class Forwarddispatch1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String n="Srini";
		String fname=request.getParameter("name");
		
		// for forward and include methods

		RequestDispatcher rd=request.getRequestDispatcher("Welcome.jsp");
		rd.include(request, response);//forwards a servlet one page to another page
		
		if(n.equals(fname)) {
			out.println("<h1>Valid details</h1>");
		}
		else
		out.println("<h1>Invalid username / password</h1>");
	}

}
