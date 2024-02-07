package com.servlet.day2;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class AddorMult
 */
public class AddorMult extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		String action=request.getParameter("b1");
		
		if(action.equals("btn1")) {
			RequestDispatcher rd=request.getRequestDispatcher("Add");
			rd.include(request, response);
		}
		else if(action.equals("btn2")) {
			RequestDispatcher rd=request.getRequestDispatcher("Subtract");
			rd.include(request, response);
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("Multiply");
			rd.include(request, response);
		}
			
	}

}
