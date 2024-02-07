package com.servlet.Day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class PasswordValidation
 */
public class PasswordValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		String name="vinolisha";
		String pass="ahsiloni";
		
		String n=request.getParameter("fname");
		String p=request.getParameter("pass");
		
		if(name.equals(n)&&pass.equals(p)) {
			out.println("Welcome "+request.getParameter("fname"));
		}else {
			out.println("InValid Values");
		}
		
	}
}
	


