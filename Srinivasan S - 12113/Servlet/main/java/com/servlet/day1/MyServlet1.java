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
		
		PrintWriter out=response.getWriter();//to print on web page
		out.println("<h1><font color=red><center>This is my Servlet</h1></font color=red></center");//print 
		out.println("<html>");
		out.println("<body>");
		out.println("<center>");
		out.println("Welcome"+request.getParameter("fname"));
		out.println("<table border=1>");
		
		out.println("<tr>");
		out.println("<td>");		
		out.println("Name");		
		out.println("</td>");
		
		out.println("<td>");
		out.println("Age");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Srinivasan");
		out.println("</td>");			
		
		out.println("<td>");
		out.println("22");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Shiva");
		out.println("</td>");			
		
		out.println("<td>");
		out.println("21");
		out.println("</td>");
		out.println("</tr>");
		
		
		
		out.println("</table >");
		out.println("</center>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
