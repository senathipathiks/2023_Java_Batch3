package com.servlet.day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LogIN
 */
public class LogIN extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		PrintWriter out=response.getWriter();

		
		String name1="Heram";
        String pwd1="Hema@001";
    
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
