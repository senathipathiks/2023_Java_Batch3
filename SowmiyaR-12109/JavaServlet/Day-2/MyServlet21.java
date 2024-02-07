package com.servlet.day2;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class MyServlet21
 */
public class MyServlet21 extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 String btn1="calc";
		 String btn2="Multipl";
		
		    String n=request.getParameter("button1");  
		    String p=request.getParameter("button2");
	        
		    if(btn1.equals(n))
	        {
		    RequestDispatcher rd=request.getRequestDispatcher("Calculate");
		    rd.include(request, response);
	        }
	        else {
		    RequestDispatcher rd=request.getRequestDispatcher("Multitab");
		    rd.include(request, response);
	}
	
	
	}

}
