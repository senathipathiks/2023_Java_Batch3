package com.sender;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class SenderRedirect extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	     response.setContentType("text/html");
	     
	     PrintWriter pw = response.getWriter();
	     
	     String name = request.getParameter("search");
	     
	     response.sendRedirect("https://www.google.co.in/="+name);
		
	}

}
