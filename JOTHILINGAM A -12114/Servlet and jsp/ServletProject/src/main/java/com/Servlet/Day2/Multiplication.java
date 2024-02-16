package com.Servlet.Day2;

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
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		int n1=Integer.parseInt( request.getParameter("num1"));
		int n2=Integer.parseInt(request.getParameter("num2"));
		int c=n1*n2;
		
		
		out.print("The multiplication is : "+ c);
	}

}
