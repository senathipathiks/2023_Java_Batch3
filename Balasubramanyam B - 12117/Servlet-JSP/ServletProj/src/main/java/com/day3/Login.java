package com.day3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		String name=null;
		if(session.getAttribute("name")==null) {
			name=request.getParameter("name");
			session.setAttribute("name", name);
		}
		else {
		name=session.getAttribute("name").toString();
		}
		
		out.print("<h1>Welcome to Login Page "+name+"</h1>");
		out.print("<a href='SentItem'> Click the sent item Page</a>");
		
	}

}
