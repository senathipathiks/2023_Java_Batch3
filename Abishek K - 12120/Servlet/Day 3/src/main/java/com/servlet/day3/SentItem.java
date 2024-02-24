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
 * Servlet implementation class SentItem
 */
public class SentItem extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		String name = session.getAttribute("name").toString();
		
		out.print("<h1> Welcome to "+name+" sent Item Page </h1>");
		
		out.print("<a href='ProfilePage'> click here to move to Profile Page </a>");
		
		
		
		
		
	}

}
