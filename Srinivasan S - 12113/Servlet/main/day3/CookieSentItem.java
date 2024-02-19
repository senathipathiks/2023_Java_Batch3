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
 * Servlet implementation class CookieSentItem
 */
public class CookieSentItem extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		Cookie [] c=request.getCookies();
		String name=c[1].getValue();
		
		out.print("<h1> Welcome ! "
				+ name
				+" to Sent Item page</h1> ");
		
		out.print("<a href='CookieProfileItem'> Click here to move to Cookie Profile Page</a>");
		
		
	}

}
