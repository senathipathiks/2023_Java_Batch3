package com.day1.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ToAdd
 */
public class ToAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter  p = response.getWriter();
		
		int x=Integer.parseInt(request.getParameter("FN"));
		int y=Integer.parseInt(request.getParameter("SN"));
		
		
		int n = x+y;
		p.println("The sum of Two Numbers :"+ n);
		
		
		
		
		
	}

}
