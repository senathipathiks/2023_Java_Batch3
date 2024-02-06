package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Sample
 */
public class Sample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sample() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		
		
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
		
		for (int i = 0; i <= 10; i++) {
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
		
		
		out.print("<h1>Welcome" +request.getParameter("fname")+"</h1>");
		
		
	}

}
