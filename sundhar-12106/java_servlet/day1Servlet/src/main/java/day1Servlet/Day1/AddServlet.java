package day1Servlet.Day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class AddServlet
 */
public class AddServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int n1 = Integer.parseInt(request.getParameter("inp1"));
		int n2 = Integer.parseInt(request.getParameter("inp2"));
		
		response.getWriter().print("<h1>the sum of the given number is "+(n1+n2)+"</h1>");
	}

}
