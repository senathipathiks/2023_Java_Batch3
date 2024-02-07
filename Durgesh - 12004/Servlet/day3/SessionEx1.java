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
 * Servlet implementation class SessionEx1
 */
public class SessionEx1 extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();

		String n = null;
		if(session.getAttribute("n")==null) {
			n = request.getParameter("uname");
			session.setAttribute("n", n);
		}
		else {
			n = session.getAttribute("n").toString();
		}

		
		out.print("<h1> Welcome " +n+ " To Relevantz </h1>");
		
		
		
		out.print("<a href ='SendItem'>Click here to move to Sent Item </a> ");
		
	}

}
