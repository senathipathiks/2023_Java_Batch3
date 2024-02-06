package com.servlet.day2;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Myservlethome
 */
public class Myservlethome extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action1 = request.getParameter("button1");

		if (action1.equals("calc")) {
			RequestDispatcher rd = request.getRequestDispatcher("Calculate");
			rd.forward(request, response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("Multiplication");
			rd.forward(request, response);
		}
	}

}
