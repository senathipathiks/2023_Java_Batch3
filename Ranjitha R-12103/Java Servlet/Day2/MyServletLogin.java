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
 * Servlet implementation class MyServletLogin
 */
public class MyServletLogin extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
//		String name1 = "Ranjitha";
//		String pass1 = "Ram@12345";
//
//		String name2 = request.getParameter("name");
//		String pass2 = request.getParameter("pass");
//		if (name1.equals(name2) && pass1.equals(pass2)) {
//
//			response.sendRedirect("welcome.jsp?name=" + name2);
//		} else {
//			response.sendRedirect("Invalid.jsp");
//		}
		
		//using requestdispatcher method
//		String name1 = "Ranjitha";
//		String pass1 = "Ram@12345";
//
//		String name2 = request.getParameter("name");
//		String pass2 = request.getParameter("pass");
//		if (name1.equals(name2) && pass1.equals(pass2)) {
//
//		RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
//		rd.forward(request, response);
//		}else {
//		
//		RequestDispatcher rd=request.getRequestDispatcher("Invalid.jsp");
//		rd.include(request, response);
//		out.println("Invalid Username/Password");
//		}
		
		RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
		String name=request.getParameter("name");
		request.getAttribute("name");
		rd.forward(request, response);
		
		
	}

}
