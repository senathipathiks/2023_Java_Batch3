package com.servlet.day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Practice
 */
public class Practice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   @Override
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub


		PrintWriter out=response.getWriter();
		
		int  n1=Integer. parseInt(request.getParameter("num1"));
		int  n2=Integer.parseInt(request.getParameter("num2"));
		int C=n1+n2;
		out.println("The sum of Two numbers:"+C);
}

}


