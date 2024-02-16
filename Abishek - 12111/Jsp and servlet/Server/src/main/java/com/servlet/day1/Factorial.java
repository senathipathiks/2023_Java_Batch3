package com.servlet.day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Factorial
 */
public class Factorial extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
        
        
        out.println("<html>");
        out.println("<body>");
        out.println("<table border = 1>");
        out.println("<tr>");
        out.println("<td>");
        out.println("Number");
        out.println("</td>");
        out.println("<td>");
        out.println("Factorial value");
        out.println("</td>");
        out.println("</tr>");
        int fact=1;
        for (int i = 1; i<=5; i++) {
        out.println("<tr>");
        out.println("<td>");
        out.println(i);
        out.println("</td>");
        out.println("<td>");
        out.println(fact=fact * i);
        out.println("</td>");
        out.println("</tr>");
        }
        out.println("<table>");
        out.println("</body>");
        out.println("</html>");
    

	}

}
