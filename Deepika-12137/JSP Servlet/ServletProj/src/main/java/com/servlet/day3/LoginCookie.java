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
 * Servlet implementation class LoginCookie
 */
public class LoginCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("username");
		
		Cookie cookie=new Cookie("username", name);
		
		response.addCookie(cookie);
		
		if (cookie.getAttribute("username")==null) {
			name=request.getParameter("username");
			cookie.setAttribute("username", name);
		}
		else {
			name=cookie.getAttribute("username");
		}
				
				
				
		out.print("<h1> Welcome to "
				+name
				+" Inbox Page </h1>"
				);
		
		out.print("<a href='SentItemCookie'>Click here to move to sent Item </a>");
	}

}
