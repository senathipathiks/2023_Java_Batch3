package com.servlet.Day1;

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
     
		PrintWriter out= response.getWriter(); //to print something on the web page
		out.println("<h1><font color=blue><center>This is my table using servlet !!</center></font></h1>"); //to print on web page
		
		out.print("Welcome:"+request.getParameter("fname"));
		out.println("<br></br>");
		
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
		out.println("<td>");
		out.println("Age");
		out.println("</td>");
		
		
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Kaviya");
        out.println("</td>");
		
		out.println("<td>");

		out.println("BE");

		out.println("</td>");

		out.println("<td>");
		out.println("22");

		out.println("</td>");
		
		
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Raj");
		out.println("</td>");
		out.println("<td>");
		out.println("Bsc");
		out.println("</td>");
		out.println("<td>");
		out.println("20");
		out.println("</td>");
		
		out.println("</table>");
        out.println("</body>");
		out.println("</html>");
}

}
