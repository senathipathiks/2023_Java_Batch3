package com.servlet.day1;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class DemoServlet
 */
public class DemoServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
	//	out.println("Details:");
		
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
		out.println("Prem");
		out.println("</td>");
		out.println("<td>");
		out.println("EEE");
		out.println("</td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");

//		PrintWriter out = response.getWriter();
		//out.println("8Th Table");
	      
		int table = 8;
		for (int i = 1; i <= 10; i++) {

			out.println("<html>");
			out.println("<html>");
			out.println("<body>");
			out.println("<table border=0>");
			out.println("<tr>");
			out.println("<td>");
			out.println(i);
			out.println("</td>");
			out.println("<td>");
			out.println("X");
			out.println("</td>");
			out.println("<td>");
			out.println("8");
			out.println("</td>");
			out.println("<td>");
			out.println("=");
			out.println("</td>");
			out.println("<td>");
			out.println(i * table);
			out.println("</td>");
			out.println("</tr>");
			out.println("</table>");
			out.println("</body>");
			out.println("</html>");
		}
		
		//out.println("Factorials");
		int fact=1;
		for(int i=1;i<=10;i++) {
			for (int j=i;j<=i;j++) {
				out.print("<html>");
				out.print("<body>");
				out.println("<table border=0>");
				out.println("<tr>");
				out.println("<td>");
				out.println("Factorial"+i+"!");
				out.println("</td>");
				out.println("<td>");
				out.println(fact=fact*i);
				out.println("</td>");
				out.print("</body>");
				out.print("</html>");
				
			}
			
		}

	}
}