package com.day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Sample
 */
public class Sample extends HttpServlet {
	
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out=response.getWriter();
		//out.println("<h1><font color=blue> <center> Hello World</center></font></h1>");
		out.println("<html>");
		out.println("<body> <center>");
		out.println("<table border=1");
		out.println("<tr>");
		out.println("<td>");
		out.println("Name");
		out.println("</td>");
		out.println("<td>");
		out.println("Quelifiaction");
		out.println("</td>");
		out.println("</tr>"); 
		out.println("<tr>");
		out.println("<td>");
		out.println("Bala");
		out.println("</td>");
		out.println("<td>");
		out.println("BE");
		out.println("</td>");
		out.println("</tr>");
		out.println("</table>");
		out.print("</body>  </center>");
		out.println("</html>");
}
	
}
