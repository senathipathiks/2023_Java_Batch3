package com.servlet.day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class SumOfTwoNum
 */
public class SumOfTwoNum extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		int num1= Integer.parseInt(request.getParameter("fnum1"));
		int num2= Integer.parseInt(request.getParameter("fnum2"));
		int num3= num1+num2;
		out.print(num3);
	}

}
