package com.servlet.day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		out.print("<h1><font color = blue><center>This is my First Servlet</center></font></h1>");
		out.print("<body>");
		out.print("<table border=1>");
		out.print("<tr>");
		out.print("<th>");
		out.print("Name");
		out.print("</th>");
		out.print("<th>");
		out.print("Qualification");
		out.print("</th>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td>");
		out.print("Surya");
		out.print("</td>");
		out.print("<td>");
		out.print("B.E");
		out.print("</td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td>");
		out.print("Jeeva");
		out.print("</td>");
		out.print("<td>");
		out.print("Java");
		out.print("</td>");
		out.print("</tr>");
		out.print("</table>");
		
		out.print("<br>");
		out.print("<table border = 1>");
		out.print("<tr>");
		out.print("<th>");
		out.print("Mul");
		out.print("</th>");
		out.print("<th>");
		out.print("Output");
		out.print("</th>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td>");
		out.print("8 X 1");
		out.print("</td>");
		out.print("<td>");
		out.print("8");
		out.print("</td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td>");
		out.print("8 X 2");
		out.print("</td>");
		out.print("<td>");
		out.print("16");
		out.print("</td>");
		out.print("</tr>");
		out.print("</table>");
		
		int fact = 1;
		int number = 5;
		for(int i = 1; i<=number; i++) {
			
			fact = fact * i;
			
		}
		out.print("<tr>");
		out.print("<th>");
		out.print("Number");
		out.print("</th>");
		out.print("<th>");
		out.print("Fact");
		out.print("</th>");
		out.print("</tr>");
		
		out.print("<tr>");
		out.print("<td>");
		out.print(number);
		out.print("</td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td>");
		out.print(fact);
		out.print("</td>");
		out.print("</tr>");
		out.print("</tabel>");
		
		out.print("</body>");
		out.print("</html>");
		
	}

}
