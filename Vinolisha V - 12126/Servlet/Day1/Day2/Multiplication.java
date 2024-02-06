package com.servlet.Day2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Multiplication
 */
public class Multiplication extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		out.println("<h1>Multiplication servlet Opened</h1>");
		int f1=Integer.parseInt(request.getParameter("fname1"));
		int f2=Integer.parseInt(request.getParameter("fname2"));
		int mul=f1*f2;
		out.println("Multiple: " + mul);
	}

}
