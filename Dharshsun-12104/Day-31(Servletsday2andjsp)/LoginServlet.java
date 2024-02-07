package com.servlet.day1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out =response.getWriter();
		
		String n=request.getParameter("useremail");  
		
	    String p=request.getParameter("pass");  
	          
	    
	   
	if(n.equals("dharshsun0303@gmail.com") && p.equals("Dharshsun2544"))
	    {
		response.sendRedirect("Welcome.jsp");
    }
    else
    {
      response.sendRedirect("Invalid.jsp");
      }

	    out.close();
		}
	}

		

