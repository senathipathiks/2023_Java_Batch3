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
 * Servlet implementation class ProfilePagecook
 */
public class ProfilePagecook extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
       PrintWriter out = response.getWriter();
		
		Cookie[] ck = request.getCookies();
		String name = ck[0].getValue();
		
		out.print("<h1> Welcome To "+ name + "Profile Page </h1>");
		
		out.print("<a href='InboxPageCook'> Click here to move to Profile Page</a>");
		
	}

}
