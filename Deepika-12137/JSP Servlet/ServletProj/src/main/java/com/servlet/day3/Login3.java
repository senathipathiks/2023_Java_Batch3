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
 * Servlet implementation class Login3
 */
public class Login3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out=response.getWriter();
		
		HttpSession session=request.getSession();
		String name=null;
		
		if (session.getAttribute("username")==null) {
			name=request.getParameter("username");
			session.setAttribute("username", name);
		}
		else {
			name=session.getAttribute("username").toString();
		}
				
				
				
		out.print("<h1> Welcome to "
				+name
				+" Inbox Page </h1>"
				);
		
		out.print("<a href='SentItem'>Click here to move to sent Item </a>");
		
		
		session.setAttribute("username", name);
	}


}
