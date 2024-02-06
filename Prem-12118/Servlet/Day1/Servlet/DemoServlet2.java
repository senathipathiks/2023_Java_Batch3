package com.servlet.day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class DemoServlet2
 */
public class DemoServlet2 extends HttpServlet {
	 
//	protected void (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		 
//		  
//	         String Name= request.getParameter("Uname");
//	         String Password= request.getParameter("Upswd");
//	          
//	         if (Name.equals("Prem") && Password.equals("Prem@1234")){
//	        	 out.print("<h1>Welcome to Login Page:</h1>"+Name);
//	        	 
//	         }
//	         else
//	         {
//	        	 out.print("<h1>< text color:red>Invalid Login Credentaials</h1>");
//	         }
//		
//	          
		 
//	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		 resp.sendRedirect("Ex1.jsp");
	}
}
