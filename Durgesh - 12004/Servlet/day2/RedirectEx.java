package com.servlet.day2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class RedirectEx
 */
public class RedirectEx extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		String a="Durgesh25";
//		String b="Durgesh@25";
		String uname = request.getParameter("uname");
		String pword = request.getParameter("pass");
		
		if (uname.equals(uname)&& pword.equals(pword)) {
			response.sendRedirect("Welcome.jsp? uname ="+ uname);

		}
		else {
			response.sendRedirect("Invalid.jsp");
		}	
	}

}
