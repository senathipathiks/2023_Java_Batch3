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
 * Servlet implementation class InboxPage
 */
public class InboxPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        PrintWriter out=response.getWriter();
//		HttpSession session=request.getSession();
//		String name = null;
//		if(session.getAttribute("name")==null) {
//			name = request.getParameter("name");
//			session.setAttribute("name",name);
//		}else {
//			name = session.getAttribute("name").toString();
//		}
        String name = request.getParameter("name");
        Cookie cookie = new Cookie("name",name);
        response.addCookie(cookie);
        if(cookie.getAttribute("name")==null) {
			name = request.getParameter("name");
			cookie.setAttribute("name",name);
		}else {
			name = cookie.getAttribute("name").toString();
		}
		out.print("<h1>Welcome to " + name + " Inbox Page</h1>");
		out.print("<a href='Sentitem'> Click here to move to Sent Item </a>");
		
	} 
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	

}
