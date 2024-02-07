package com.servlet.day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class MyServelt
 */
public class MyServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
//		out.print("<h1><font color = red><center> Hello World......This is Durgesh  </center></font></h1>");
		
		out.print("<html>");
		out.print("<body>");
		out.print("<table border = 1>");
		out.print("<center>");

		out.print("<tr>");
		out.print("<td>");
		out.print("Name");
		out.print("</td>");
		out.print("<td>");
		out.print("Department");
		out.print("</td>");
		out.print("</tr>");
		
		out.print("<tr>");
		out.print("<td>");
		out.print("Durgesh nandhini");
		out.print("</td>");
		out.print("<td>");
		out.print("Software Engineer");
		out.print("</td>");
		out.print("</tr>");
		
		out.print("<tr>");
		out.print("<td>");
		out.print("Logesh");
		out.print("</td>");
		out.print("<td>");
		out.print("Analyst");
		out.print("</td>");
		out.print("</tr>");
		
		out.print("</center>");
		out.print("</table>");
		out.print("</body>");
		out.print("</html>");

		
	}

}
