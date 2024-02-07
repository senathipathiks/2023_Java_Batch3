package com.servlet.day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class MultiplicationServlet
 */
public class MultiplicationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();

		out.print("<html>");
		out.print("<body>");
		out.print("<table border = 1>");
		
		out.print("<tr>");
		out.print("<td>");
		out.print("Multiplication of ");
		out.print("</td>");
		out.print("<td>");
		out.print("8");
		out.print("</td>");
		out.print("</tr>");
		
		for (int i = 1; i < 11; i++) {
			out.print("<tr>");
			out.print("<td>");
			out.print(i +" X 8");
			out.print("</td>");
			out.print("<td>");
			out.print(i*8);
			out.print("</td>");
			out.print("</tr>");
		}
		
		out.print("</table>");
		out.print("</body>");
		out.print("</html>");
		
	}

}
