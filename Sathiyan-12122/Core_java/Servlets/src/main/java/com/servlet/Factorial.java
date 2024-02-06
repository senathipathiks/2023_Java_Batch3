package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Factorial
 */
public class Factorial extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		int fact=1;
		
		out.print("<html>");
		out.print("<body>");
		out.print("<table border=1>");
		out.print("<tr>");
		out.print("<td>");
		out.print("Number");
		out.print("</td>");
		out.print("<td>");
		out.print("Factorial");
		out.print("</td>");
		out.print("</tr>");
		
		for (int i = 1; i < 5; i++) {
			out.print("<tr>");
			out.print("<td>");
			out.print(i+ " Factorial");
			out.print("</td>");
			out.print("<td>");
			out.print(fact = fact * i);
			out.print("</td>");
			out.print("</tr>");
			
		}
		
		out.print("</table>");
		out.print("</body>");
		out.print("</html>");
	}

}
