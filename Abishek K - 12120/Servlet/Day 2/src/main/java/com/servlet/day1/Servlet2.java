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

/**
 * Servlet implementation class Servlet2
 */
public class Servlet2 extends GenericServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		//out.println("Factoril");
		int fact =1;
		for(int j=1;j<=10;j++) {
			for(int k=j;k<=j;k++) {
				
				out.println("<html>");
				out.println("<body>");
				out.println("<table border=1>");
                			
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

//servlet three ways - HTTP request
             //      - Generic request
             //        - by implement servlet interface