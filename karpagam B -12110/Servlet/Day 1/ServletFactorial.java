package com.servlet.Day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ServletFactorial
 */
public class ServletFactorial extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		out.println("<h1><font color=blue><center>Factorial table using servlet !!</center></font></h1>"); //to print on web page
		
		out.println("<html>");
		out.println("<body>");
		
		
		out.println("<table border=1>");
		out.println("<tr>");
		out.println("<td>");
		out.println("Number");
		out.println("</td>");
		out.println("<td>");
		out.println("Factorial");
		out.println("</td>");
		out.println("</tr>");
		for(int i=1;i<=10;i++) {
			for (int j=1;j<=10;j++) {
				out.println("<tr>");
			    out.println("<td>");
			    out.println(i);
			    out.println("</td>");
			    out.println("</tr>");
		
				out.println("fact=fact*j");
				out.println("<tr>");
				out.println("<td>");
				out.println("fact");
				out.println("</td>");
				out.println("</tr>");
			}
		}
		
		    out.println("</table>");
	        out.println("</body>");
			out.println("</html>");
		


	}

}
