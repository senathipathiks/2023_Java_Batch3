package com.servlet.Day1;

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
 * Servlet implementation class UsingServletMethod
 */
public class UsingServletMethod extends GenericServlet {
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
	
PrintWriter out =response.getWriter();
		
		int fact=1;
		
		out.println("<html>");
		out.println("<body> <center>");
		out.println("<table border=1>");
		out.println("<tr>");
		out.println("<td>");
		out.println("Factorial of number is ");
		out.println("</td>");
		out.println("<td>");
		out.println("Value");
		out.println("</td>");
		out.println("</tr>");
		
		for(int i=1;i<=10;i++) {
			out.println("<tr>");
			out.println("<td>");
			out.println(i);
			out.println("</td>");
			out.println("<td>");
			out.println(fact=fact*i);
			out.println("</td>");
			out.println("</tr>");
			}
			out.println("</table>");
			out.println("</body> </center>");
			out.println("</html>");
		}
	

	}


