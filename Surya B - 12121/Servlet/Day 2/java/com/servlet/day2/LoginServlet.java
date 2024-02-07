package com.servlet.day2;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html");  
		    PrintWriter out = response.getWriter();  
		          
		    String n=request.getParameter("n");  
		    String p=request.getParameter("p");  
		          
		    if(p.equals("servlet")){  
		       //response.sendRedirect("welcomepage");
		    	
		    	RequestDispatcher rd = request.getRequestDispatcher("welcomepage");
		    
			    rd.include(request, response);
		    }  
		    else{  
		    	RequestDispatcher rd = request.getRequestDispatcher("Invalid");
		        rd.include(request, response);
		        String destination = "p";
		        RequestDispatcher rd = request.getRequestDispatcher(destination);
		        
		    }         
	}

}
