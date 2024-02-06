package com.servlet.day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Factorial
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter p = response.getWriter();
		p.println("<html>");
		p.println("<body>");
		p.println("<table border=2 style=\"text-align:center\">");
		p.println("<tr>");
		p.println("<th>Number</th>");
		p.println("<th>Factorial</th>");
		p.println("</tr>");
		for(int i=1;i<=10;i++) {
			int fact = 1;
			for(int j=i;j>0;j--)
				fact*=j;
				
			p.println("<tr><td>"+i+"!</td>"+"<td>"+fact+"</td></tr>");
		}
		p.println("</tbody>");
		p.println("</body>");
		p.println("</html>");
	}

}
