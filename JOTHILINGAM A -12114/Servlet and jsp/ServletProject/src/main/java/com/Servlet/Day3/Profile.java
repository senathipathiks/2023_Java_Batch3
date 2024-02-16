package com.Servlet.Day3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Profile
 */
public class Profile extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		HttpSession session=request.getSession();
		String name=(String) session.getAttribute("user");
		
		out.println("<h1>Welcome to " 
				+name
				+" Profile Page</h1>"		
				
				);		
		out.println("<a href='InboxPage'>Clickhere to move the Inbox page</a>");

	}

}
