package com.servlet.day1;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class InterestCalculator
 */
public class InterestCalculator extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		  int a=Integer.parseInt(request.getParameter("principal"));
	        int b=Integer.parseInt(request.getParameter("interest"));
	        int c=Integer.parseInt(request.getParameter("noofyears"));

	        
	        int Result=(a*(1+b*c));
	        out.print("Simple Interest is: "+Result);
		
	}

	
}
