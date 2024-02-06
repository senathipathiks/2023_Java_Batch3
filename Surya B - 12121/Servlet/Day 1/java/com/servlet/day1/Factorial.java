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


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int fact = 1;
		
		
		PrintWriter out = response.getWriter();
		
		
		
		out.print("<html>");
		
		
		
		out.print("<body>");
		out.print("<table border=1>");
		out.print("<tr>");
		out.print("<th>");
		out.print("Number");
		out.print("</th>");
		out.print("<th>");
		out.print("Factorial");
		out.print("</th>");
		out.print("</tr>");
		
	
		
		for(int i = 1; i<=5; i++) {
			
			out.print("<tr>");
			out.print("<td>");
			out.print(i);
			out.print("</td>");
			out.print("<td>");
			fact = fact * i;
			out.print(fact);
			out.print("</td>");
			out.print("</tr>");
			out.print("</body>");
			out.print("</html>");
			
			}
		
		
		}	
		}
		
		
	


