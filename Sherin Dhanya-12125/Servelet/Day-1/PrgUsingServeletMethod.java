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

import jakarta.*;

/**
 * Servlet implementation class PrgUsingServeletMethod
 */
public class PrgUsingServeletMethod extends GenericServlet {
	private static final long serialVersionUID = 1L;
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		int fact=1;
		int n=5;

		out.println("<html>");
		out.println("<body>");
		out.println("<table border=1>");
		for(int i=1;i<=n;i++) {
			
		
		out.println("<tr>");
		out.println("<td>");
		out.print("Factorial of "+ i +" is ");
		out.println("</td>");

		out.println("<td>");
		out.print(fact=fact*i);
		out.println("</td>");
		out.println("</tr>");
		}
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
			
		}
	
}
