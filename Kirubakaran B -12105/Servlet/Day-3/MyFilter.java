package com.servlet.day3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class MyFilter
 */

public class MyFilter extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		response.setContentType("text/html");
		 PrintWriter out=response.getWriter();
		 
		 int aid=Integer.parseInt(request.getParameter("aid"));
		 String aname=request.getParameter("aname");
		 
		 out.print("Welcome"+" "+aname+" " +aid);
	       out.close();
	
	}

}
