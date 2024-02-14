package com.Servlet.Day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class SimpleIntrest
 */
public class SimpleIntrest extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		double p=Float.parseFloat(request.getParameter("p"));
		double r=Float.parseFloat(request.getParameter("r"));
		int t=Integer.parseInt(request.getParameter("t"));
		
		
		 double si=p*r*t/100;
		 
		 out.print("<h1>Simple Intrest is: "+si+"");
		
	}

}
