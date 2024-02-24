package com.servlet.day1;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class TwoButton
 */
public class TwoButton extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	 PrintWriter out = response.getWriter();
	 
	 String action = request.getParameter("btn1");
	 
	 if(action.equals("Calc")) {
		
		RequestDispatcher rd = request.getRequestDispatcher("Calc");
		rd.forward(request, response);
	 
	}
	 else {
		 RequestDispatcher rd = request.getRequestDispatcher("Mul");
		 rd.forward(request, response);
	 }

}
}