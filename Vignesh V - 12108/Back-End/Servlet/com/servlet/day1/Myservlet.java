package com.servlet.day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Myservlet
 */
public class Myservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Myservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
PrintWriter out =response.getWriter();
//		out.println("<h1><front color=blue><center>Hello World</ center></front><h1>") ;
//		out.println("<html>");
//		out.println("<body>");
//		out.println("<table border=1>");
//		out.println("<tr>");
//		out.println("<td>");
//		out.println("Name");
//		out.println("</td>");
//		out.println("<td>");
//		out.println("Qualification");
//		out.println("</td>");
//		out.println("</tr>");
//		out.println("</tr>");
//		out.println("<tr>");
//		out.println("<td>");
//		out.println("Vignesh");
//		out.println("</td>");
//		out.println("<td>");
//		out.println("-BE-EEE");
//		out.println("</td>");
//		out.println("</tr>");
//		out.println("</table>");
//		out.println("</body>");
//		out.println("</html>");
//		
		//out.println("<h1>Welcome" +request.getParameter("fname")+"</h1>");
		
      out.println("Sum"+(Integer.parseInt(request.getParameter("fnum"))+Integer.parseInt(request.getParameter("secnum"))));

		
	}

}
