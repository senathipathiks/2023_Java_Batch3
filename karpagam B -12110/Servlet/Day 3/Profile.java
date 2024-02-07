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
 * Servlet implementation class Profile
 */
public class Profile extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   PrintWriter out=response.getWriter();
		  
			HttpSession session=request.getSession();
			String name=session.getAttribute("name").toString();
			
			out.print("<h1>Welcome to  "
					+ name //here we can't get the value by second time
					+"Profile Page</h1>");
			
			out.print("<a href='InboxPage'> click here to move to Inbox Page </a>");
			
		
	}

}
