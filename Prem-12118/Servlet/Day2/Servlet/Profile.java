package com.servlet.day2;

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
	 		
	 		HttpSession session = request.getSession();
			String k = (String) session.getAttribute("name");	
			PrintWriter out= response.getWriter();
			out.print(k);
	 		
	}

	 
	 
}
