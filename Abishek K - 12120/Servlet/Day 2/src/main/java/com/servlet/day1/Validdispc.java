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
 * Servlet implementation class Validdispc
 */
public class Validdispc extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("username");
		String password = request.getParameter("passowrd");
		
		if(name.equals("abishek") && password.equals("Abi@2781")  ) {
			
		RequestDispatcher rd = request.getRequestDispatcher("Welcome.jsp");
		rd.forward(request, response);
		
		}
		else {
			RequestDispatcher rd1 = request.getRequestDispatcher("ValidForm1.html");
			rd1.include(request, response);
			out.println("<h1>Invalid Username / Password</h1>");
		}
		
	}

}
