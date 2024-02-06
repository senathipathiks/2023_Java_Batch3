package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginPage
 */
public class LoginPage extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		
		String uname = request.getParameter("username");
		String pass=request.getParameter("password");
		
		 if(uname.equals("sathya") && pass.equals("Sathya@123")){  
		        out.print("<h1>"+"Welcome "+uname+"</h1>"); 
		    }  
		    else{  
		        out.print("<h1>"+"Invalid User name or password "+"</h1>");  
		          
		   }
		 
	}

}
