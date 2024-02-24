package com.servlet.day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Servlet
 */
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		//out.print("<h1><font color=blue><center>This is my First servlet</center></font></h1>");
		out.println("<html>");
		out.println("<body>");
		out.println("<table border=1>");
		out.println("<tr>");
		out.println("<td>");
		out.println("Name");
		out.println("</td>");
		out.println("<td>");
		out.println("Qualification");
		out.println("</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>");
		out.println("Abishek");
		out.println("</td>");
		out.println("<td>");
		out.println("Engineering");
		out.println("</td>");
		out.println("</tr>");
		out.println("<table>");
		out.println("</body>");
		out.println("</html>");
		
		out.println("Table -8");
		int table=8;
		for(int i=1;i<=10;i++) {
			out.println("<html>");
			out.println("<body>");
			out.println("<table border=1>");
			out.println("<tr>");
			out.println("<td>");
			out.println(i+"x8");
			out.println("</td>");
			out.println("<td>");
			out.println(i*table);
			out.println("</td>");
			out.println("</tr>");
			out.println("</table>");
			out.println("</body>");
			out.println("</html>");
		}
			
			out.println("Factoril");
			int fact =1;
			for(int j=1;j<=10;j++) {
				for(int k=j;k<=j;k++) {
					out.println("<html>");
					out.println("<body>");
					out.println("<table border=1>");
                    out.println("<tr>");
                    out.println("<td>");
                    out.println("Number");
                    out.println("</td>");
                    out.println("</tr>");				
					out.println("<tr>");
					out.println("<td>");
					out.println(j+"!");
					out.println("</td>");
					out.println("<td>");
					out.println(fact=fact*j);
					out.println("</td>");
					out.println("</tr>");
					out.println("</table>");
					out.println("</body>");
					out.println("</html>");
					
				}
			}
		
		}
		
		
		

}

