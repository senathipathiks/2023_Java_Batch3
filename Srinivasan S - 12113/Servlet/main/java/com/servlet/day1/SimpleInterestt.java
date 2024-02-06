package com.servlet.day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class SimpleInterestt
 */
public class SimpleInterestt extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		float p=Integer.parseInt(request.getParameter("principle"));
		float r=Float.parseFloat(request.getParameter("interest"));
		float t=Float.parseFloat(request.getParameter("time"));
		
		float si=(p*r*t)/100;
		out.print("<h1>Simple Interest : </h1>"+si);
	}

}
