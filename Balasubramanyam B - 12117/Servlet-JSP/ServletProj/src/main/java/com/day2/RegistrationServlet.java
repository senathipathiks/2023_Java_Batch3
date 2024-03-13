package com.day2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	           throws ServletException, IOException {
	    	PrintWriter out=response.getWriter();
			out.println("<h1>First Name:"+ request.getParameter("fname")+"</h1>");
			out.println("<h1>Second Name:"+ request.getParameter("fname1")+"</h1>");
			out.println("<h1>Phone Number: "+ request.getParameter("fpno")+"</h1>");
			out.println("<h1>Email:"+ request.getParameter("fmail")+"</h1>");
			
	}}
