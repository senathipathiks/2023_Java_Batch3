package com.servlet.Day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginValidation
 */
public class LoginValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		 PrintWriter out = response.getWriter();
		 
		 String name="Kaviya";
		 String password="Kaviyabs@1602";
		 
		 String name2=request.getParameter("name1");
		 String pwd2=request.getParameter("pwd1");
		 
		 if(name.equals(name2)&& password.equals(pwd2)) {
			out.print("<h1><center><font color=red>Valid Successfully !!</font></center></h1>");
			
		 }
		 
		 


		
		 

	}

}
