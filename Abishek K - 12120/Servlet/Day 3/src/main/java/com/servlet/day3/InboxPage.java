package com.servlet.day3;

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
		
	PrintWriter out = response.getWriter();
	
	HttpSession session = request.getSession();
	String name = null;

	if(session.getAttribute("name")==null)
	{
		
	name = request.getParameter("uname");
	session.setAttribute("name", name);
	}
	else {
		name= session.getAttribute("name").toString();
	}
	out.print("<h1>Welcome to "+ name + " to Inbox Page </h1>");
	
	out.print("<a href='SentItem'> Click here to move to sent Item Page</a>");
	
	
	
	
	
	}

}
