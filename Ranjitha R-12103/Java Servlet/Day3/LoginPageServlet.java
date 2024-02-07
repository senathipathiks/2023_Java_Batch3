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
 * Servlet implementation class LoginPageServlet
 */
public class LoginPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		PrintWriter out = response.getWriter();
	
		
		HttpSession session=request.getSession();
		String name=null;
		
		if(session.getAttribute("name")==null) {
			name=request.getParameter("name");
			session.setAttribute("name", name);
		}
		else {
			name=session.getAttribute("name").toString();
		}

//		String name = request.getParameter("name");
		out.print("<h1>Welcome to " + name + "Login Page Servlet</h1>");

		out.print("<a href='SendItem'> Click here to move to SendItem</a>");

//		HttpSession session = request.getSession();
//		session.setAttribute("name", name);
	}

}
