package com.day3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class SendItem extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/Html");
	PrintWriter out = response.getWriter();
	HttpSession session = request.getSession();
	
	String k = (String) session.getAttribute("kn");
	
	out.println(k);
	
	session.setAttribute("kn", k);
	
	
	
	out.print("<a href='Profile'> Click here to Direct</a>");

	}

}
