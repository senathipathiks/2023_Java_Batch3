package day1Servlet.Day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class SimpleIntrestServlet
 */
public class SimpleIntrestServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		double p = Double.parseDouble(req.getParameter("princi"));
		double r = Double.parseDouble(req.getParameter("roi"));
		double d = Double.parseDouble(req.getParameter("days"));
		
		double n = d/365;
		double res = ((p*n*r)/100)+p;
		
		resp.getWriter().print("<h1>the simple intrest is : "+Math.round(res)+"</h1>");
	}

}
