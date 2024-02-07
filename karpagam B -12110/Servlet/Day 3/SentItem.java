package com.servlet.Day3;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class SentItem
 */
public class SentItem extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out=response.getWriter();
		
        HttpSession session=request.getSession();
		String name=(String) session.getAttribute("name");
				
		out.print("<h1>Welcome to "
				+ name                 //here we can't get the value by second time,so we use httpsession to get and set attributes
				+" Sent Item page</h1>");
		
		out.print("<a href='Profile'> click here to move to Profile page</a>");
		
	}

}
