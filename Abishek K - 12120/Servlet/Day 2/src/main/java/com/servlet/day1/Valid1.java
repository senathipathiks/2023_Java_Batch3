package com.servlet.day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Valid1
 */
public class Valid1 extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("username");
		String password = request.getParameter("passowrd");
		String heading = request.getParameter("h1");
		
		if(name.equals("abishek") && password.equals("Abi@2781")  ) {
			response.sendRedirect("Welcome.jsp?username="+name+"&&passowrd="+password);
		}
		else {
			response.sendRedirect("error.jsp");
		}
	}

}
