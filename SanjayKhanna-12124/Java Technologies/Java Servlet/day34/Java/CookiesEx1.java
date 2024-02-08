package com.servlet.day3;

import jakarta.servlet.ServletException;

//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class CookiesEx1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		Cookie c1 = new Cookie("name", name);
		Cookie c2 = new Cookie("password", password);
		
		response.addCookie(c1);
		response.addCookie(c2);
		
		out.println("<h1>Hello "+name+"</h1>");
		out.println("<a href='CookiesEx2'>Click to move next Page<a>");
		
	}

}
