package com.Servlet.Day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

/**
 * Servlet implementation class Servlet2
 */
public class Servlet2 extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<table border=1>");
		out.print("<tr>");
		out.print("<td>");
		out.print("Number");
		out.print("</td>");
		out.print("<td>");
		out.print("Value");
		out.print("</td>");
		out.print("</tr>");
		
		for(int i=1;i<11;i++) 
		{
			out.print("<tr>");
			out.print("<td>");
			out.print(i+ "X 1");
			out.print("</td>");
			out.print("<td>");
			out.print(i*1);
			out.print("</td>");
			out.print("</tr>");
		}
		
		
		out.print("</table>");
		out.print("</body>");
		out.print("</html>");
	}

}
