package com.servlet.Day3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class CookieInboxPage
 */
public class CookieInboxPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     PrintWriter out=response.getWriter();
		
        String name=request.getParameter("name");
        Cookie cookie=new Cookie("name", name);
        response.addCookie(cookie);

		out.print("<h1> Welcome to "
				+ name
				+" Cookie Inbox page</h1> ");
		
		out.print("<a href='CookieSentItem'> click here to move to Cookie Sent Item page</a>");
		
	}

}
