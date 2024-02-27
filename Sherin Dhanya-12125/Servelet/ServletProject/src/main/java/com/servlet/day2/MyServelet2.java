package com.servlet.day2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class MyServelet2
 */
public class MyServelet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
// using doPost method in url it will not show the queries like password. it is safe to use
// using doGet method it will show the queries in the url so it is not safe.
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		out.print("Welcome to my JSP page");
		response.sendRedirect("welcome.jsp");
	}

}
