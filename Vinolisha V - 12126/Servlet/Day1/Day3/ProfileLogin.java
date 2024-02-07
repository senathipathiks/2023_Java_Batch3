package com.servlet.Day3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ProfileLogin
 */
public class ProfileLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
PrintWriter out=response.getWriter();
		
		HttpSession session=request.getSession();
		String name=session.getAttribute("name").toString();
		
		out.print("<h1> Welecome to " + name + "Sent Item Page </h1>");
		
		out.print("<a href='LoginServlet'> Click here to move to Login Page </a>");
	}

}
