package com.servlet.day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Page1
 */
public class Page1 extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		String num1 = request.getParameter("n1");
		String num2 = request.getParameter("n2");
		//int n1 = parseInt(num1);
		
		int nu1 = Integer.parseInt(num1);
		int nu2 = Integer.parseInt(num2);
		
		int sum = nu1 + nu2;
		
		out.print("Sum of the Two Number: "+sum);
	}

}
