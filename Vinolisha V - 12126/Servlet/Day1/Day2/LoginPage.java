package com.servlet.Day2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginPage
 */
public class LoginPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		
		String name="Vino";
		String pass="ahsiloni";
		
		String fname=request.getParameter("fname");
		String p=request.getParameter("pass");
		
		
		
		if(name.equals(fname)&&pass.equals(p)) {
			response.sendRedirect("Correct.jsp?n="+fname);
		}else {
			response.sendRedirect("Invalid.jsp");
		}
	}

}
