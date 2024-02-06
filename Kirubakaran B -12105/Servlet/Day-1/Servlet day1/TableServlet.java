package com.servlet.day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class TableServlet
 */
public class TableServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	     PrintWriter out= response.getWriter();
	     out.println("<html>");
	        out.println("<body>");
	        out.println("<table border = 1>");
	        out.println("<tr>");
	        out.println("<td>");
	        out.println("Number");
	        out.println("</td>");
	        out.println("<td>");
	        out.println("Value");
	        out.println("</td>");
	        out.println("</tr>");
	        for (int i = 0; i<10; i++) {
				
		
	        out.println("<tr>");
	        out.println("<td>");
	        out.println(i+"x 1");
	        out.println("</td>");
	        out.println("<td>");
	        out.println(i*1);
	        out.println("</td>");
	        out.println("</tr>");
	        }
	        out.println("<tr>");
	        out.println("<td>");
	        out.println("Abishek");
	        out.println("</td>");
	        out.println("<td>");
	        out.println("Cloud");
	        out.println("</td>");
	        out.println("</tr>");
	        out.println("<table>");
	        out.println("</body>");
	        out.println("</html>");
	        
	        
	}

}
