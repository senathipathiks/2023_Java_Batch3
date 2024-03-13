package com.practice;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Servelet1
 */
public class Servelet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int i =Integer.parseInt(request.getParameter("num1"));
		int j =Integer.parseInt(request.getParameter("num2"));
		int k = i+j;
		k=k*k;
		request.setAttribute("k",k);
		RequestDispatcher rd = request.getRequestDispatcher("Servlet2");
		rd.forward(request, response);
//		PrintWriter out = response.getWriter();
//		out.println("<h1>Result is "+k+"</h1");
	}

}
