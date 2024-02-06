package com.servlet.day1;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class NewServlet
 */
@SuppressWarnings("serial")
public class NewServlet extends GenericServlet {
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }



	
	public void service(ServletRequest req , ServletResponse res) throws ServletException, IOException {
PrintWriter p = res.getWriter();
		
		p.println("<html>");
		p.println("<body>");
		p.println("<table border=2 style=\"text-align:center\">");
		p.println("<tr>");
		p.println("<th>Number</th>");
		p.println("<th>by value </th>");
		p.println("<th>Result</th>");
		p.println("</tr>");
		for(int i=1;i<=10;i++)
			p.println("<tr><td>"+i+"</td>"+"<td>"+9+"</td>"+"<td>"+i*9+"</td></tr>");
		p.println("</body>");
		p.println("</html>");
	}

}
