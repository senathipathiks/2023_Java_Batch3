package com.servlet.day2;

import jakarta.servlet.RequestDispatcher;

import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@SuppressWarnings("serial")
public class ButtonServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("btn1");
		if(action.equals("Calculator")) {
			RequestDispatcher rd = request.getRequestDispatcher("Calculator");
			rd.forward(request, response);
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("Multiplication");
			rd.forward(request, response);
		}
			
	}

}
