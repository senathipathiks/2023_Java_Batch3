package com.servlet.Day2;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Myservlet3
 */
public class Myservlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out =response.getWriter();


		String name="Vino";
		String pass="ahsiloni";
		
		String fname=request.getParameter("fname");
		String p=request.getParameter("pass");
		
		if(name.equals(fname)&&pass.equals(p)) {
		RequestDispatcher rd=request.getRequestDispatcher("Correct.jsp");
		rd.forward(request,  response);
		}else {
			RequestDispatcher rd=request.getRequestDispatcher("MyServlet3.jsp");
			rd.include(request, response);
			out.println("<h1>InValid username/Password</h1>");
		}
	}

}
