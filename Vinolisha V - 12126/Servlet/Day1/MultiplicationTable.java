package com.servlet.Day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class MultiplicationTable extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		
		
		out.println("<html>");
		out.println("<body> <center>");
		out.println("<table border=1>");
		
		out.println("Welcome" + request.getParameter(" fname "));
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Number");
		out.println("</td>");
		out.println("<td>");
		out.println("Value");
		out.println("</td>");
		out.println("</tr>");
		
		for(int i=0;i<=10;i++) {
		out.println("<tr>");
		out.println("<td>");
		out.println(i+"* = 1");
		out.println("</td>");
		out.println("<td>");
		out.println(i*1);
		out.println("</td>");
		out.println("</tr>");
		}
		out.println("</table>");
		out.println("</body> </center>");
		out.println("</html>");
	}

}
