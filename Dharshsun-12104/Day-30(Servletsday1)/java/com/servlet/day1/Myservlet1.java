package com.servlet.day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Myservlet1
 */
public class Myservlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out =response.getWriter();
//		out.print("<h1><font color=blue><center>This is my first servlet</center></font></h1>");
		out.println("<html>");
		out.println("<body>");
		out.println("<table border=1>");
//		out.println("<th>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("qualification");
		out.println("</td>");
		out.println("<td>");
		out.println("name");
		out.println("</td>");
		out.println("</tr");
		out.println("<tr>");
		out.println("<td>");
		out.println("B.Tech");
		out.println("</td>");
		out.println("<td>");
		out.println("Dharshsun.S");
		out.println("</td>");
//		out.println("</tr>");
		out.println("</tr");
//		for(int i=0;i<10;i++) {
//			out.println("<tr>");
//			out.println("<td>");
//			out.println(i+ "X 1");
//			out.println("</td>");
//			out.println("<td>");
//			out.print(i*1);
//			
//		}
//		out.println("</th>");
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
	}

}
