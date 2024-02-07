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
 * Servlet implementation class Myservlet2
 */
public class Myservlet2 extends HttpServlet {
	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		PrintWriter out = response.getWriter();
//		out.print("Welcome "+request.getParameter("fname"));
//		--------------------------------
//		 String name1="Sowmiya";
//		    String pwd1="Sowmi@123";
//		
//		    String n=request.getParameter("name");  
//		    String p=request.getParameter("pwd");
//		    
//		    if(name1.equals(n)&&(pwd1.equals(p))) {
//		    	 response.sendRedirect("Welcome2.jsp");
//		    	 
//	           }
//		    else {
//		    	 response.sendRedirect("Invalid2.jsp");
//		    }
//		---------------------------------------------
		
//		String fname=request.getParameter("name");
//		response.sendRedirect("Welcome2.jsp?name="+fname);
//		----------------------------------------
//		out.print("Invalid Username/Password");
//		RequestDispatcher rd=request.getRequestDispatcher("Welcome2.jsp");
//		rd.forward(request, response);
		
//		-----------------------------------
		
//		 String name1="Sowmiya";
//		 String pwd1="Sowmi@123";
//		 
//		 String n=request.getParameter("name");  
//		    String p=request.getParameter("pwd");
//		    
//		    if(name1.equals(n)&&(pwd1.equals(p))) {
//		    	RequestDispatcher rd=request.getRequestDispatcher("Welcome2.jsp");
//		    	rd.forward(request, response); 
//	           }
//		    else {
////		    	RequestDispatcher rd=request.getRequestDispatcher("Invalid2.jsp");
////				rd.include(request, response);
//				out.print("<h1>Invalid Username/Password</h1>");
//				
//		    }
//		    -----------------------------------------------
	  
	   String mgs="Invalid Username/Password";
	}

}
