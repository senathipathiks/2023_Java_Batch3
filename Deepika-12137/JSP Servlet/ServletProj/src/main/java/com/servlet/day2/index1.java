package com.servlet.day2;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class index1
 */
public class index1 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stubs
		
		String action=request.getParameter("button1");
		
		if(action.equals("Calc"))
		{
		RequestDispatcher rd=request.getRequestDispatcher("Calculator.html")	;
		rd.forward(request, response);
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("Factorial");
			rd.forward(request, response);		}
	}


}
