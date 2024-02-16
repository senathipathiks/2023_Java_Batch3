package com.Servlet.Day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Servlet3
 */
public class Servlet3 extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		out.print("<table border=1>");
		out.print("<tr>");
		out.print("<td>");
		out.print("Number");
		out.print("</td>");
		out.print("<td>");
		out.print("Factorial Value");
		out.print("</td>");
		out.print("</tr>");
		
		int fact=1;
		
		for(int i=1;i<=5;i++) 
		{
			out.print("<tr>");
			out.print("<td>");
			out.print(i);
			out.print("</td>");
			out.print("<td>");
			out.print(fact=fact*i);
			out.print("</td>");
			out.print("</tr>");
		}
		
		
		out.print("</table>");
		out.print("</body>");
		out.print("</html>");
	}

}
