package com.servlet.Day3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		PrintWriter out=response.getWriter();
//		
//		String name=request.getParameter("fname");
//		out.println("<h1>Welcome to " + name + " Inbox Page</h1>");
//	
//		out.print("<a href='SendItems'>Click here to move to Send item </a> ");
//			
//				HttpSession session=request.getSession();
//				session.setAttribute("name", name);
		
		PrintWriter out=response.getWriter();
		
		HttpSession session=request.getSession();
		String name=null;
		
		if(session.getAttribute("name")==null)
		{
			name=request.getParameter("fname");
			session.setAttribute("name", name);
		}else {
			name=session.getAttribute("name").toString();	
		}
		out.println("<h1>Welcome to " + name + " Login Page</h1>");
	
		out.print("<a href='SendItems'>Click here to move to Send item </a> ");
	
	}
	

}
