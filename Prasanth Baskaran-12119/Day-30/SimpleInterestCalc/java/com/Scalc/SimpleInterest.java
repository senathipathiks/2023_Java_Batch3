package com.Scalc;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SimpleInterest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter pw = response.getWriter();
		
		response.setContentType("text/html");
		
		  double p = Double.parseDouble(request.getParameter("princ"));
		  double i = Double.parseDouble(request.getParameter("inter"));
		 double t = Double.parseDouble(request.getParameter("time"));
		 
		 double result = (p*i*t)/100;
		 
		 pw.print("<h1>Simple Interest Value is : </h1>"+result);
		
	}

}
