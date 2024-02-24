package com.servlet.day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Valid
 */
public class Valid extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String name = request.getParameter("username");
		String password = request.getParameter("passowrd");
		
		
	if((name.equals("abishek") && password.equals("Abi"))) {
		
		out.print("<h1>Welcome To The Home Page</h1>");
		
			}
	else {
		out.print("<h1>Please give Valid Input </h1>");
	}
		
	}

}
//Get is Insecure method
//Post is secure method