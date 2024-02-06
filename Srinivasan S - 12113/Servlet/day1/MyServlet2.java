package com.servlet.day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class MyServlet2
 */
public class MyServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		
		
		out.println("<html>");
		out.println("<body>");
		
		out.println("<center>");
		out.println("Multiplication using Servlet");
		out.println("<br></br>");
		out.println("<table border=1>");
		out.println("<tr>");
		out.println("<td>");
		out.println("Num");
		out.println("</td>");			
		
		out.println("<td>");
		out.println("Val");
		out.println("</td>");
		out.println("</tr>");
		
		for (int i = 0; i <= 10; i++) {
			out.println("<tr>");
			out.println("<td>");
			out.println(i+"X 5");
			out.println("</td>");
			out.println("<td>");
			out.println(i*5);
			out.println("</td>");
			
		}
		
		out.println("</table>");
		out.println("</center>");
		out.println("</body>");
		out.println("</html>");
	}

}
