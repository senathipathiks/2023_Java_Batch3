package com.servlet.day1;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import javax.print.attribute.PrintRequestAttribute;


public class Interest extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int p = Integer.parseInt(request.getParameter("p"));
		int r = Integer.parseInt(request.getParameter("r"));
		int t = Integer.parseInt(request.getParameter("t"));
		
		int intrest = (p * r * t)/100;
		
		PrintWriter out = response.getWriter();
		
		out.print(intrest);
	}

}
