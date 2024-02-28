package com.servlet.day2;

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
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out=response.getWriter();
		
		String name= request.getParameter("name");
		
		out.println ("<h1> Welcome to " + name +" Inbox Page </h1>");
		
		out.println( "<a href ='SentItem'> Click here to move Sent Item Page </a><br>"); 
		out.println( "<a href ='Profile'> Click here to move Profile  Page </a>");
		
		
		HttpSession session = request.getSession();
		
		session.setAttribute("name",name);
		 
		 	}

	 

}
