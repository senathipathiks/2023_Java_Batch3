package com.servlet.day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class PrintSum
 */
public class PrintSum extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	  PrintWriter out=response.getWriter();
	  
	  int a=Integer.parseInt(request.getParameter("num1"));
	  int b=Integer.parseInt(request.getParameter("num2"));
	  int n=a+b;
	  out.print("Sum of Two numbers: "+n);
	
	}

}
