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
 * Servlet implementation class InboxPagePrg1
 */
public class InboxPagePrg1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		HttpSession session=request.getSession();
		String name=null;
		if(session.getAttribute("fname")==null) {
			name=request.getParameter("fname");
			session.setAttribute("fname", name);
		}
		else
		{
			name=(String) session.getAttribute("fname");
		}

		
		out.print("<h1> Welcome to " + name + " InboxPage </h1>");
		out.print("<a href='SendItem'> Click here to go to SendItem</a>");

		session.setAttribute("fname", name);
	}

}
