package com.day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginPage1
 */
public class LoginPage1 extends HttpServlet {
//	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  
	      
		PrintWriter out=response.getWriter();
		String name1="Varshinee";
        String pwd1="Varshi@123";
    
        String n=request.getParameter("name");  
        String p=request.getParameter("pwd");
        
        if(name1.equals(n)&&(pwd1.equals(p))) {
           out.println("Welcome "+request.getParameter("name"));
           }
        else {
            out.print("Invalid");
        }
	    
	    
	    
	}

}
