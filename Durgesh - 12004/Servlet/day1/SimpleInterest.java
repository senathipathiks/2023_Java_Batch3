package com.servlet.day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class SimpleInterest
 */
public class SimpleInterest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		int p = Integer.parseInt(request.getParameter("principle"));
		int r = Integer.parseInt(request.getParameter("rate"));
		int t = Integer.parseInt(request.getParameter("years"));
		
		int s = (p*r*t)/100;
		
		out.print("<h1>Simple Interest : </h1> " +s);

	}

}
