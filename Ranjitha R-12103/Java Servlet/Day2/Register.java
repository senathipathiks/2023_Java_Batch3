package com.servlet.day2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		out.println("welcome:"+request.getParameter("fname"));
		out.println("E-Mail id: "+request.getParameter("email"));
		out.println("Mobile Number: "+request.getParameter("mobileno"));
		
	}

}
