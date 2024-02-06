package com.servlet.day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class MyServlet3
 */
public class MyServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		int fact=1;
		out.println("<html>");
		out.println("<body>");
		out.println("<center>");
		out.println("Factorial using Servlet");
		out.println("<br></br>");
		out.println("<table border=1");
		
		out.println("<tr>");
		
		out.println("<td>");
		out.println("Values");
		out.println("</td>");
		
		out.println("<td>");
		out.println("Factorial");
		out.println("</td>");
		
		out.println("</tr>");
		
		for (int i = 1; i <= 10; i++) {
			out.println("<tr>");
			out.println("<td>");
				out.println(i);
				out.println("</td>");
				out.println("<td>");
			    fact=fact*i;
				out.println(fact);
				out.println("</td>");
				
			
		}
		out.println("</table>");
		out.println("</center>");
		out.println("</body>");
		out.println("</html>");
	}

}
