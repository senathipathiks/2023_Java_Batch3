package day1Servlet.Day1;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class HomeServlet
 */
public class HomeServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String btn = req.getParameter("btn");
		
		if(btn.equals("add")) {
			RequestDispatcher rd = req.getRequestDispatcher("Add1Servlet?num1=5&num2=20");
			rd.forward(req, resp);
		}else {
			RequestDispatcher rd = req.getRequestDispatcher("MulServlet?num1=5&num2=20");
			rd.forward(req, resp);
		}
			
	}

}
