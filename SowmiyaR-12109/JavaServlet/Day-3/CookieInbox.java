package com.servlet.day3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class CookieInbox
 */
public class CookieInbox extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();

		String name = request.getParameter("name");
		Cookie cookie = new Cookie("name", name);
		response.addCookie(cookie);

		out.print("<h1>Welcome to " + name + "Cookie Inbox</h1>");

		out.print("<a href='CookieeSentItem'> Click here to move to Cookie SentItem</a>");
	
	}

}
