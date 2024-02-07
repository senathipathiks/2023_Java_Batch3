package com.servlet.day1;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class FactorialServlet
 */
public class FactorialServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out  = response.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		out.print("<table border = 1>");
		
		out.print("<tr>");
		out.print("<td>");
		out.print("Factorial");
		out.print("</td>");
		out.print("<td>");
		out.print("Value");
		out.print("</td>");
		out.print("</tr>");
		
		int fact = 1;

		for (int i = 1; i <= 10; i++) {
			out.print("<tr>");
			out.print("<td>");
			out.print(i + "!" + " is");
			out.print("</td>");
			out.print("<td>");
			fact = fact*i;
			out.print(fact);
			out.print("</td>");
			out.print("</tr>");
		}

		
		out.print("</table>");
		out.print("</body>");
		out.print("</html>");

	}

}
