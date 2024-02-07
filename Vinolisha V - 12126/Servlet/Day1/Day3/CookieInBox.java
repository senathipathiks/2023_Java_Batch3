package com.servlet.Day3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class CookieInBox
 */
public class CookieInBox extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("fname");
		Cookie cookie= new Cookie("fname",name);
		response.addCookie(cookie);
		
		out.print("<h1> Welcome to " + name + " Cookie Inbox Page</h1>");
		
		out.print("<a href='CookieSentItem'> Click here to move to Cookie Sent Item Page</a>");
		
	}

}
