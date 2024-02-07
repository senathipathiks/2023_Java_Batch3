package com.servlet.day1;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/day2/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter out = res.getWriter();
		out.println("<table>");
		out.println("<tr>");
		out.println("<td>");
		out.println("Name : \t"+req.getParameter("name"));
		out.println("<td>");
		out.println("<tr>");
		out.println("<tr>");
		out.println("<td>");
		out.println("Age : \t"+req.getParameter("age"));
		out.println("<td>");
		out.println("<tr>");
		out.println("<tr>");
		out.println("<td>");
		out.println("Gender : \t"+req.getParameter("gender"));
		out.println("<td>");
		out.println("<tr>");
		out.println("<tr>");
		out.println("<td>");
		out.println("Email : \t"+req.getParameter("username"));
		out.println("<td>");
		out.println("<tr>");
		out.println("<tr>");
		out.println("<td>");
		out.println("Name : \t"+req.getParameter("password"));
		out.println("<td>");
		out.println("<tr>");
		out.println("</table>");
	}
	
  
}

