package com.servlet.day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		
		
		String user="Srinivas25";
		String Password="Srini@12345";
		
		String uname=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
		
		if (user.equals(uname)&& Password.equals(pwd)) {
			
			out.println("<html>");
			out.println("<body>");
			out.println("<center>");
			out.println("<h1>Welcome !</h1>");
			out.println("<table border=1>");
			
			out.println("<tr>");
			out.println("<td>");		
			out.println("Name");		
			out.println("</td>");
			
			out.println("<td>");
			out.println("Age");
			out.println("</td>");
			out.println("</tr>");
			
			out.println("<tr>");
			out.println("<td>");
			out.println("Srinivasan");
			out.println("</td>");			
			
			out.println("<td>");
			out.println("22");
			out.println("</td>");
			out.println("</tr>");
			
			out.println("</table >");
			out.println("</center>");
			out.println("</body>");
			out.println("</html>");
		}
		else {
			out.print("Enter valid details");
		}
		
	
	}

}
