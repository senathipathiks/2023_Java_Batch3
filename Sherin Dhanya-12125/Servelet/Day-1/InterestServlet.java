package com.servlet.day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class InterestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
PrintWriter out = response.getWriter();
		
		int a=Integer.parseInt(request.getParameter("princ"));
		int b=Integer.parseInt(request.getParameter("rot"));
		int c=Integer.parseInt(request.getParameter("noe"));

		
		int A=(a*(1+b*c));
		out.print("Simple Interest is:"+A);
	}

}
