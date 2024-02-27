package com.servlet.day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import org.apache.catalina.filters.ExpiresFilter.XPrintWriter;

/**
 * Servlet implementation class Sample
 */
public class Factorial extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Factorial() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		int num=5;
		int fact=1;
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Deepika Details</h1>");
		out.println("<table border=1>");
		out.println("<tr>");
		out.println("<td>");
		out.println("Number");
		out.println("</td>");
		out.println("<td>");
		out.println("value");
		out.println("</td>");
		out.println("</tr>");
       for (int i = 1; i <= num ; i++) {
    	   fact=fact*i;
       }
    	out.println("<tr>");
   		out.println("<td>");
   		out.println("Factorial Of five " + num );
   		out.println("</td>");
   		out.println("<td>");
   		out.println(fact);
   		out.println("</td>");
   		out.println("</tr>");	
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
		
		
		
	}

}