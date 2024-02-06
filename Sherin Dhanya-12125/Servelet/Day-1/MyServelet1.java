package com.servlet.day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class MyServelet1
 */
public class MyServelet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		out.print("<h1><font color=blue><center>Hello </center></font></h1>");
		out.println("<html>");
		out.println("<body>");
		out.println("<table border=1>");
		out.println("<tr>");
		out.println("<td>");
		out.print("Name");
		out.println("</td>");
		out.println("<td>");
		out.print("Qualification");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.print("Sherin");
		out.println("</td>");
		out.println("<td>");
		out.print("B.E");
		out.println("</td>");
		out.println("</tr");
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
		out.print("Welcome "+ request.getParameter("fname"));
	}

}
