package com.servlet.day1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Addnum
 */
public class Addnum extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		int n1 = Integer.parseInt(request.getParameter("one"));
		int n2 = Integer.parseInt(request.getParameter("two"));
		int n3 = n1 + n2;
		
		out.print(n3);
		
		out.print("Hello");
	}
}
