package com.servlet.day2;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class excerciseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		String action=request.getParameter("b1");
	
		if(action.equals("Ad")) {
			RequestDispatcher rd=request.getRequestDispatcher("excerciseAdd");
	        rd.forward(request, response);
		}else {
			RequestDispatcher rr=request.getRequestDispatcher("ServletExample");
			rr.forward(request, response);
		}
	}

}
