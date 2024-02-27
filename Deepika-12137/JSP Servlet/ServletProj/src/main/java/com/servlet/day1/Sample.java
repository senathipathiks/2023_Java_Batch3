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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
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
       for (int i = 0; i < 12; i++) {
    	out.println("<tr>");
   		out.println("<td>");
   		out.println(i +"x 1");
   		out.println("</td>");
   		out.println("<td>");
   		out.println(i*1);
   		out.println("</td>");
   		out.println("</tr>");
		}
	
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
		
		out.print("<h1>Welcome " +request.getParameter("fname")+"</h1>");
		
	}

}