package com.servlet.day1;

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
		
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<table border=1>");
		out.print("<h1>");
		out.print("Factorial");
		out.print("</h1>");
		
		out.println("<tr>");
		out.println("<td>");
		out.print("Number");
		out.println("</td>");
		out.println("<td>");
		out.print("Value");
		out.println("</td>");
		out.println("</tr>");
		
		int fact=1;
		for(int i=1;i<=10;i++) {
			out.println("<tr>");
			out.println("<td>");
			out.print(i+ "! is "+"");
		    out.println("</td>");
			out.println("<td>");
			fact=fact*i;
			out.print(fact);
			out.println("</td>");
			out.println("</tr>");
		}
		out.print("</table>");
		out.print("</body>");
		out.print("</html>");
	}

}
