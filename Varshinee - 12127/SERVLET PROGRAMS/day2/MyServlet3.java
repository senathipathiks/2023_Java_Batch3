package com.day2;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class MyServlet3
 */
public class MyServlet3 extends HttpServlet {
//	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
//		String name1="Varshinee";
//        String pwd1="Varshi@123";
//    
//        String n=request.getParameter("name");  
//        String p=request.getParameter("pwd");
//        
//        if(name1.equals(n)&&(pwd1.equals(p))) {
//        	response.sendRedirect("welcome.jsp");
//           }
//        else {
//        	response.sendRedirect("Invalid.jsp");
//        }
		
//		
//		String fname=request.getParameter("name"); 
//		response.sendRedirect("welcome.jsp?name="+fname);
		
		String name1="Varshinee";
        String pwd1="Varshi@123";
		
		String n=request.getParameter("name");  
		String p=request.getParameter("pwd");
		
		if(name1.equals(n)&&(pwd1.equals(p))) {
		RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
		rd.forward(request, response);
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("Invalid.jsp");	
			rd.include(request, response);
			out.print("<h1>Invalid Username/Password</h1>");
		}
		
	}

}
