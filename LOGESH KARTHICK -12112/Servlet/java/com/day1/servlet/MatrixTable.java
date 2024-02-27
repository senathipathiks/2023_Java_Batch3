package com.day1.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class MatrixTable
 */
public class MatrixTable extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MatrixTable() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter p = response.getWriter();
		p.println("<html>");
		p.println("<body>");
		p.println("<table border = 1>");
		p.println("<tr>");
		p.println("<th> Number <th>");
		p.println("<th> by value<th>");
		p.println("</tr>");
		for(int i=1;i<=10;i++)
		{
			p.println("<tr><td>"+i+"</td>"+"<td>"+9+"</td>+"+"<td>"+i*9+"</td></tr>");
		}
		
		p.println("</body>");
		p.println("</html>");
	}


}
