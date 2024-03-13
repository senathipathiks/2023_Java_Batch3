package com.day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Sum
 */
public class Sum extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int a = Integer.parseInt(request.getParameter("N1"));
		int b = Integer.parseInt(request.getParameter("N2"));
		int c=a+b;
		out.print("The Result is: "+c);
	}

}
