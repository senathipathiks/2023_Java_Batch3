package com.servlet.day2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Multitab
 */
public class Multitab extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		 out.print("<h1><font color=purple><center>Multiplication table</center></font></h1>");
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
	        for(int i=0;i<=10;i++) {
	        	out.println("<tr>");
	        	 out.println("<td>");
	        	 out.print(i+"X 1");
	        	 out.println("</td>");
	        	 out.println("<td>");
	        	 out.print(i*1);
	        	 out.println("</td>"); 
	        	 out.println("</tr>"); }
	        	 out.println("</table>");
	        	 out.println("</body>");
	        	 out.println("</html>");
	}

}
