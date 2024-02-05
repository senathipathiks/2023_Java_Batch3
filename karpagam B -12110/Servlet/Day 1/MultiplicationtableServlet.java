package com.servlet.Day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class MultiplicationtableServlet
 */
public class MultiplicationtableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter out = response.getWriter();
	        out.println("<html>");
	        out.println("<body>");
	        out.println("<table border=1>");
	        out.println("<tr>");
	        out.println("<td>");
	        out.print("Number");
	        out.println("</td>");
	        out.println("<td>");
	        out.print("Value");
	        out.println("</td>");
	        out.println("</tr>");

	        for (int i = 1; i <= 10; i++) {
	            out.println("<tr>");
	            out.println("<td>");
	            out.print(i + "*8");
	            out.println("</td>");
	            out.println("<td>");
	            out.print(i * 8);
	            out.println("</td>");
	            out.println("</tr>");
	        }
	        out.print("</table>");
	        out.print("</body>");
	        out.print("</html>");

	}

}
