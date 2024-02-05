package com.servlet.Day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class FindSimpleInterest
 */
public class FindSimpleInterest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		int p=Integer.parseInt(request.getParameter("amount"));
		int r=Integer.parseInt(request.getParameter("rate"));
		int y=Integer.parseInt(request.getParameter("years"));
		
		int si=(p*(1+r*y));
		out.print("Simple Interest: " + si);
		
	}

}
