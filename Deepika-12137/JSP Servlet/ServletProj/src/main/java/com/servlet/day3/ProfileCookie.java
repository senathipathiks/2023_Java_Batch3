package com.servlet.day3;

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
 * Servlet implementation class ProfileCookie
 */
public class ProfileCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
PrintWriter out=response.getWriter();
		
		Cookie[] ck=request.getCookies();
		String name=ck[0].getValue();
		
		out.print("<h1> Welcome to "
				+name
				+" Profile Page </h1>"
				);
		
		out.print("<a href='LoginCookie'>Click here to move to Inbox Item </a>");
		
	}

}
