package com.servlet.day1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyTable
 */
public class MyTable extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyTable() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out =response.getWriter();
//		out.print("<h1><font color=blue><center>This is my first servlet</center></font></h1>");
		out.println("<html>");
		out.println("<body>");
		out.println("<table border=1>");
//		out.println("<th>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Number");
		out.println("</td>");
//		out.println("</tr>");
//		out.println("<tr>");
		out.println("<td>");
		out.println("value");
		out.println("</td>");
		out.println("</tr");
		for(int i=0;i<10;i++) {
			out.println("<tr>");
			out.println("<td>");
			out.println(i+ "X 1");
			out.println("</td>");
			out.println("<td>");
			out.print(i*1);
			
		}
		out.println("</td>");
//		out.println("</tr>");
		out.println("</tr");
//		out.println("</th>");
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
	}



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
