package day1Servlet.Day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class MulServlet
 */
public class MulServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int num1 =Integer.parseInt(request.getParameter("num1"));
		int num2 =Integer.parseInt(request.getParameter("num2"));
		
		response.getWriter().print("<h1>Multiplication Servlet called "+(num1*num2)+"</h1>");
	}

}
