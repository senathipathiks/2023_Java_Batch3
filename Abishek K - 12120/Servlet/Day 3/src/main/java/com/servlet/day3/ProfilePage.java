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
 * Servlet implementation class ProfilePage
 */
public class ProfilePage extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		String name = session.getAttribute("name").toString();
		
		out.print("<h1> Welcome To "+name+" the Profile Page</h1>");
		
		out.print("<a href='InboxPage'> Move to the InboxPage</a>");
		
		
		
	}

}
