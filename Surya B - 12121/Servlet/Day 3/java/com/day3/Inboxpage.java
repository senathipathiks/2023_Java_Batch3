package com.day3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;


public class Inboxpage extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		
		String n = request.getParameter("uname");
		String name = null;
		if(session.getAttribute("n")==null)
		{
		name = (String) request.getAttribute("n");
		session.setAttribute(n, n);
		}
		else
		{
			name = (String) session.getAttribute("name");
		}
		out.print("<h1>Welcome to " + n + "'s Inbox Page <h1>");
		
		out.print("<a href = 'SendItem'> Click here to Direct</a>");
		
		
		session.setAttribute("kn", n);
		
	}

}
