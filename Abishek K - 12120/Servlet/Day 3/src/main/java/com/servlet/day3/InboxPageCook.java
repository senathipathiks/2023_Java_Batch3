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
 * Servlet implementation class InboxPageCook
 */
public class InboxPageCook extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		String name = null;
		
		
		
		Cookie ck[] = request.getCookies();
		
		if(ck[0].getValue()=="abishek") {
			name = request.getParameter("uname");
			out.println(name);
			Cookie cook = new Cookie("name", name);
			response.addCookie(cook);
			
		}
		else {
			
			name = ck[0].getValue();
		
		}
		
		
		
		
		
		out.print("<h1>Welcome "+name+"To Inbox Page</h1>");
		out.print("<a href ='SentItemcook'>Click Here to Move To SentItem Page</a>");
		
		
		
		
		
		

}
}