package com.day2;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class HomeCals
 */
public class HomeCals extends HttpServlet {
//	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String btn1="calc";
		String btn2="Multipl";
		
		String action=request.getParameter("button1");
		String action1=request.getParameter("button2");
		
		if(btn1.equals(action))
		{
			RequestDispatcher rd=request.getRequestDispatcher("Calculate");
			rd.forward(request, response);
				
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("MultiTab");
			rd.include(request, response);
			
			
		}
	}

}
