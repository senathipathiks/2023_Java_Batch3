package com.servlet.day2;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Add
 */
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			 PrintWriter out=response.getWriter();
			try {
				
			float a=Float.parseFloat(request.getParameter("n1"));
			float b=Float.parseFloat(request.getParameter("n2"));
			float c=a+b;
			
			
			
		out.println("<h1>Add</h1>");
			out.println(c);
			
		} catch (Exception e) {
			System.out.println(e);
			out.println("<h1>Enter valid details</h1>");
		}
		
	}

}
