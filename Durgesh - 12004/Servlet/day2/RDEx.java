package com.servlet.day2;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class RDEx
 */
public class RDEx extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String a = request.getParameter("addit");
		
		if(a.equals("button")) {
			RequestDispatcher rd = request.getRequestDispatcher("Sum.jsp");
			rd.forward(request, response);
		}
		
		
		String b = request.getParameter("Multi");
		
		if(b.equals("button1")){
			RequestDispatcher rd = request.getRequestDispatcher("Table");
	        rd.forward(request, response);
		}
		
		
	}

}
