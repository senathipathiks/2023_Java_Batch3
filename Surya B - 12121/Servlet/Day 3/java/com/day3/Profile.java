package com.day3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class Profile extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/HTML");
		PrintWriter out = response.getWriter();
		
		HttpSession s = request.getSession();
		String k = (String) s.getAttribute("kn");
		out.print(k);
		out.print(s.getId());
		//out.println(s.getCreationTime());
	
		
		out.print("<a href = 'SendItem'> Click here to Direct</a>");
		
		out.println(s.getLastAccessedTime());
		s.setAttribute("kn", k);
	}

}
