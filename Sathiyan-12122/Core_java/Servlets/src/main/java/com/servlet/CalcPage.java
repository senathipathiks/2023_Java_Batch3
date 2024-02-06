package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class CalcPage
 */
public class CalcPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		double cash=Integer.parseInt(request.getParameter("amount"));
		double per=Integer.parseInt(request.getParameter("percentage"));
		int mon=Integer.parseInt(request.getParameter("month"));
		
		double interest=(cash/100)*per;
		
		double total=(mon*interest)+cash;
		
		out.print("<h1> Total amount is "+total+"</h1>");
		
	}

	

}
