package com.servlet.day2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class JspDemo extends HttpServlet {
 
	 public void doPost(HttpServletRequest request, HttpServletResponse response)  
		        throws ServletException, IOException {  
		  
		    response.setContentType("text/html");  
		    PrintWriter out = response.getWriter();  
		       
		    RequestDispatcher rd = request.getRequestDispatcher("welcomepage");
		    rd.forward(request, response);
//		    String n=request.getParameter("fname");  
//		    out.print("Welcome "+ n);  
		    } 
}
