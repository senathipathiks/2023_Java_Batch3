package com.servlet.day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class MyServlet1
 */
public class MyServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out=response.getWriter();
		//out.print("<h1><font color=blue><center>This is My First Servlet</center></h1>");
		out.println("<html>");
		out.println("<body>");
		out.println("<table border=1 >");
		
		out.println("<tr>");
		out.println("<td>");
		out.print("Name");
		out.println("</td>");
		out.println("<td>");
		out.print("Qualification");
		out.println("</td>");
		out.println("<td>");
		out.print("Job Title");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.print("Ranjitha");
		out.println("</td>");
		out.println("<td>");
		out.print("B.E.,");
		out.println("</td>");
		out.println("<td>");
		out.print("Software Engineer");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.print("Sowmiya");
		out.println("</td>");
		out.println("<td>");
		out.print("B.E.,");
		out.println("</td>");
		out.println("<td>");
		out.print("Software Engineer");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.print("Varshiee");
		out.println("</td>");
		out.println("<td>");
		out.print("B.E.,");
		out.println("</td>");
		out.println("<td>");
		out.print("Software Engineer");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
	}

}
