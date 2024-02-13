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
 * Servlet implementation class RequestDispatcherDemo
 */
public class RequestDispatcherDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 PrintWriter out=response.getWriter();
		 
		 
		
		
		
		 String u="Kiruba";
			String p="Kiruba@1234";
			
					String user=request.getParameter("user");
					String Pass=request.getParameter("pass");
					
					if(user.equals(u)&&Pass.equals(p)) {
						RequestDispatcher rd=request.getRequestDispatcher("Welcome.jsp");
						 rd.forward(request,response);
					
					}
					else {
						RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
						 rd.include(request, response);
						 
						 out.println("Invalid username & password");
					}
	}

}
