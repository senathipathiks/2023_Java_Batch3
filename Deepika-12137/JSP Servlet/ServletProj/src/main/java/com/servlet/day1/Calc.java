package com.servlet.day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Calc
 */
public class Calc extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();	
		
		double cash=Integer.parseInt(request.getParameter("amount"));
		double per=Integer.parseInt(request.getParameter("percentage"));
		int mon=Integer.parseInt(request.getParameter("months"));
		
		double Interest=(cash/100)*per;
		double total=(mon*Interest)+cash;
		out.println("<h1>the total amount is :"+total+"</h1>");
	}

}
