package com.servlet.Day3;

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
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
//		String name=request.getParameter("name");
		HttpSession session=request.getSession();
        String name=null;

        if(session.getAttribute("name")==null) {
        	name=request.getParameter("name");
    		session.setAttribute("name", name);
    		}
        else {
        	name=session.getAttribute("name").toString();
        }
		out.print("<h1> Welcome to "
				+ name
				+" Inbox page</h1> ");
		
		out.print("<a href='SentItem'> click here to move to Sent Item page</a>");
		
		
		}

}
