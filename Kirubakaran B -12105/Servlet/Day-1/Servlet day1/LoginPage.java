package com.servlet.day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginPage
 */
public class LoginPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String u="Kiruba";
		String p="Kiruba@1234";
		PrintWriter out=response.getWriter();
				String user=request.getParameter("user");
				String Pass=request.getParameter("pass");
				
				if(user.equals(u)&&Pass.equals(p)) {
					out.println("Welcome to login page");
				}
				else {
					out.println("Enter correct details");
				}
				
	}

}
