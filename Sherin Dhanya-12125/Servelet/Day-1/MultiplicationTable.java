package com.servlet.day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class MultiplicationTable
 */
public class MultiplicationTable extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		int a=10;
		for(int i=1;i<=10;i++) {
			out.println("<html>");
			out.println("<body>");
			out.println("<table border=1>");
			out.println("<tr>");
			out.println("<td>");
			out.print(i);
			out.println("</td>");
			out.println("<td>");
			out.print("x");
			out.println("</td>");
			out.println("<td>");
			out.print(a);
			out.println("</td>");
			out.println("<td>");
			out.print("=");
			out.println("</td>");
			out.println("<td>");
			out.print(i*a);
			out.println("</td>");
			out.println("</tr>");
			out.println("</table>");
			out.println("</body>");
			out.println("</html>");
			
		}
	}

}
