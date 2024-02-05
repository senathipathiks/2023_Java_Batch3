package com.day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ServletEx1
 */
public class ServletEx1 extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
//		out.print("Hello Wolrd");
		out.print("<html>");
        out.print("<body>");
        
        out.print("<table border=1>");
        out.print("<tr>");
        out.print("<td>");
        out.print("Name");
        out.print("</td>");
        
        out.print("<td>");
        out.print("Qualification");
        out.print("</td>");
        out.print("</tr>");
        
        out.print("<tr>");
        out.print("<td>");
        out.print("Varshinee");
        out.print("</td>");
        
        out.print("<td>");
        out.print("B.E");
        out.print("</td>");
        out.print("</tr>");
        
        out.print("</table>");
        out.print("</body>");
        out.print("</html>");
	
	}

}
