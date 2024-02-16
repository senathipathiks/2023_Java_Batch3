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
 * Servlet implementation class InboxPage
 */
public class InboxPage extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		
				
		
		HttpSession session=request.getSession();
		
		String name =null;
		
		if(session.getAttribute("user")==null) {
			name=request.getParameter("user");
			session.setAttribute("user", name);
		}
		else {
			name=(String) session.getAttribute("user");
		}
		out.println("<h1>Welcome to " 
				+name
				+" Inbox Page</h1>"		
				
				);
		out.println("<a href='SeinItem'>Clickhere to move the Sent item</a>");

	}

}
