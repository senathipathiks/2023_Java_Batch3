package com.servlet.day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class InboxPage
 */
public class InboxPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();		
		HttpSession session = request.getSession();
		
		String user=null;
		if(session.getAttribute(user)==null)
		{
		user = request.getParameter("username");
		session.setAttribute("username", user);
		}
		else
		{
			user=session.getAttribute("username").toString();
			
		}
		
		out.println("<h1> Welcome to " +user+ " Inbox page </h1>" );
		out.println("<a href='Profile'> Click here to move to Ak profile</a>");
		
		
		//session.setAttribute("username", user);
		
		
		
		
		
		
		
		
		
	}

}
