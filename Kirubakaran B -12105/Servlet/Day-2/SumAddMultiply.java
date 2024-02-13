package com.servlet.day2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SumAddMultiply
 */
public class SumAddMultiply extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String action=request.getParameter("bt1");
		if(action.equals("add"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("Practice");
			 rd.forward(request,response);
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("Multiplication");
			 rd.forward(request,response);
		}

	}

	
}
