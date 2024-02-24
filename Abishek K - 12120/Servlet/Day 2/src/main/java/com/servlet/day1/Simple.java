package com.servlet.day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Simple
 */
public class Simple extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		String prin = request.getParameter("p");
		String inte = request.getParameter("r");
		String year = request.getParameter("n");
		
		int principle = Integer.parseInt(prin);
		int interest = Integer.parseInt(inte);
		int num = Integer.parseInt(year);
		
		int SI = (principle*interest*num)/100;
		out.print("<h1>Simple Interest is: </h1>"+SI);
	
	}

}
