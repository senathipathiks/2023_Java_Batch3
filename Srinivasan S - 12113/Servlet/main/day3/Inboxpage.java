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
 * Servlet implementation class Inboxpage
 */
public class Inboxpage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Inboxpage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		HttpSession session=request.getSession();
		String name=null;
		if(session.getAttribute("uname")==null) {
		
	    name=request.getParameter("uname");
	    session.setAttribute("uname", name);
		
		}
		else {
			name=session.getAttribute("uname").toString();
		}
			out.println("<h1> Welcome to "+name+" Inbox page </h1>");
			
			out.println("<a href='SentItem'>Click here to go for Sent Item</a>");
	}

}
