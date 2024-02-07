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
		// TODO Auto-generated method stub
		//for service method request and response are the two object
		PrintWriter out =response.getWriter();
		//out.println("Hello World");
		//out.println("<h1><font color=blue><center>This is my first Servlet</center></font></h1>");
		out.println("<html>");
		out.println("<body> <center>");
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
		out.println("Vinolisha");
		out.println("</td>");
		out.println("<td>");
		out.println("M.C.A");
		out.println("</td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</body> </center>");
		out.println("</html>");
		
		
	}

}
