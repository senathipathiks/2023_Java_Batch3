package com.servlet.Day2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class RegistractionForm
 */
public class RegistractionForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();

		
		out.println("First Name:"+ request.getParameter("fname"));
		out.println("Second Name:"+ request.getParameter("fname1"));
		out.println("Phone Number: "+ request.getParameter("fpno"));
		out.println("Email:"+ request.getParameter("fmail"));
		
		
		
		
		
		}

}
