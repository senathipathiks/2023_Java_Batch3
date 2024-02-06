package com.servlet.day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter p = response.getWriter();
		//p.println("<h1 style=\"color:blue;text-align:center;\">Hello world</h1>");
		p.println("<html>");
		p.println("<body>");
		p.println("<table border=3 style=\"text-align:center\">");
		p.println("<thead>");
		p.println("<th>Name</th>");
		p.println("<th>Age</th>");
		p.println("<th>Gender</th>");
		p.println("</thead>");
		p.println("<tbody>");
		p.println("<tr>");
		p.println("<td>Sanjay</td>");
		p.println("<td>23</td>");
		p.println("<td>Male</td>");
		p.println("</tr>");
		p.println("</tbody>");
		p.println("</body>");
		p.println("</html>");
		
		}

}
