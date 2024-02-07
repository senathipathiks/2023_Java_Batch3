package com.servlet.day2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Registration
 */
public class Registration extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		out.print(request.getParameter("fname")) ;
		out.print(request.getParameter("lname"));
		out.print(request.getParameter("email")) ;
		out.print(request.getParameter("mno"));
		out.print(request.getParameter("pw")) ;
	    out.print(request.getParameter("rpw"));
		
		

		}

	}

