package com.servlet.day3;

import jakarta.servlet.ServletException;


//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


public class LoginPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		String name = null;
		if(session.getAttribute("username") == null) {
			name = request.getParameter("username");
			session.setAttribute("username",name);
		}
		else
			name= session.getAttribute("username").toString();
		 
		
		out.println("<h1>Hello All, This is "+name+"</h1>");
		out.println("<a href='SentItem'>Click here to move to Profile Page<a>");
		
		
	}

}
